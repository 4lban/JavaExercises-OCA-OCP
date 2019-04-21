package chapter18.reqres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import chapter18.reqres.model.BaseRequest;
import chapter18.reqres.model.BaseResponse;
import chapter18.reqres.model.GetUsersResponse;
import chapter18.reqres.model.User;
import chapter18.reqres.model.UserLoginRequest;
import chapter18.reqres.model.UserLoginResponse;
import chapter18.reqres.model.UserRegistrationRequest;
import chapter18.reqres.model.UserRegistrationResponse;

public class ReqresApplication {

	public static void main(String[] args) {
		ReqresApplication reqresApplication = new ReqresApplication();
		
		UserRegistrationResponse response = reqresApplication.register("alban@maxhuni.com", "somepass");
		if (!"".equals(response.getToken())) {
			System.out.println("registration is successfull\t" + response.getToken());
		}
		
		UserLoginResponse loginResponse = reqresApplication.login("alban@maxhuni.com", "somepass");
		if (!"".equals(loginResponse.getToken())) {
			System.out.println("login is successfull\t\t" + loginResponse.getToken());
		}
		
		GetUsersResponse usersResponse = reqresApplication.getUsers(1, 10);
		
		for (User user : usersResponse.getData()) {
			System.out.println(user.getFirstName());
		}
		
	}
	
	private GetUsersResponse getUsers(int page, int perPage) {
		String targetUrl = "https://reqres.in/api/users";
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("page", page);
		parameters.put("per_page", perPage);
		return (GetUsersResponse) doGet(targetUrl, parameters, GetUsersResponse.class);
	}
	
	private BaseResponse doGet(String targetUrl, Map<String, Object> queryParameters, Class<? extends BaseResponse> clazz) {
		
		try {
			
			if(queryParameters != null) {
				int i = 0;
				for( Map.Entry<String, Object> entry : queryParameters.entrySet()) {
					if(i == 0) {
						targetUrl += "?";
					} else {
						targetUrl += "&";
					}
					targetUrl += entry.getKey() + "=" + entry.getValue().toString();
				}
			}
			
			System.out.println(targetUrl);
			
			URL url = new URL(targetUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.addRequestProperty("User-Agent", "Mozilla/5.0");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			StringBuffer stringBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
			}
			
			String response = stringBuffer.toString();
			
			BaseResponse responseObject = new Gson().fromJson(response, clazz);
			
			return responseObject;

		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
		
	}
	
	private BaseResponse doPost(final String targetUrl, BaseRequest request, Class<? extends BaseResponse> clazz) {
		try {
			URL url = new URL(targetUrl);
			HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.addRequestProperty("Content-Type", "application/json");
			conn.addRequestProperty("User-Agent", "Mozilla/5.0");
			conn.setDoOutput(true); 
			
			String requestPayload = new Gson().toJson(request);
			
			OutputStream outputStream = conn.getOutputStream();
			outputStream.write(requestPayload.getBytes());
			outputStream.close();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			StringBuffer stringBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
			}
			
			String response = stringBuffer.toString();
			
			BaseResponse responseObject = new Gson().fromJson(response, clazz);
			
			return responseObject;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private UserRegistrationResponse register(String userName, String password) {
		String targetUrl = "https://reqres.in/api/register";
		
		UserRegistrationRequest request = new UserRegistrationRequest();
		request.setEmail(userName);
		request.setPassword(password);
		
		return (UserRegistrationResponse)doPost(targetUrl, request, UserRegistrationResponse.class);
	}
	
	private UserLoginResponse login(String userName, String password) {
		String targetUrl = "https://reqres.in/api/login";
		
		UserLoginRequest request = new UserLoginRequest();
		request.setEmail(userName);
		request.setPassword(password);
		
		return (UserLoginResponse)doPost(targetUrl, request, UserLoginResponse.class);
		
	}
	
}
