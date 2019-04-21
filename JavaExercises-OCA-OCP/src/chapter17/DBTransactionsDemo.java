package chapter17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTransactionsDemo {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery?useTimezone=true&serverTimezone=UTC", "alban", "PASS4alban");

			connection.setAutoCommit(false);
			
			DBTransactionsDemo demo = new DBTransactionsDemo();
			demo.insertCustomer(connection, "Restaurant with transaction", "Transaction address");
			demo.insertCustomer(connection, "Restaurant with transaction2", "Transaction address2");
			demo.insertCustomer(connection, "Restaurant with transaction3", "Transaction address3");
			demo.insertCustomer(connection, "Restaurant with transaction3Restaurant with transactionRestaurant with transactionRestaurant with "
							+ "transactionRestaurant with transactionRestaurant with transactionRestaurant with transactionRestaurant with "
							+ "transactionRestaurant with transactionRestaurant with transactionRestaurant with transaction", "Transaction address");
			demo.insertCustomer(connection, "Restaurant with transaction4", "Transaction address4");
			demo.insertCustomer(connection, "Restaurant with transaction5", "Transaction address5");
			
			demo.getRestaurants(connection);
			
			connection.commit();
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			if(connection != null) {
				try {
					connection.rollback();
					System.out.println("Rollback transaction");
				} catch (SQLException e1) {
					System.out.println("Rollback failed");
					e1.printStackTrace();
				}	
				
			}
			e.printStackTrace();
		}
		
	}
	
	private void getRestaurants(Connection connection) throws SQLException {
		String getRestaurantString = "select * from restaurant";
		PreparedStatement preparedStatement = connection.prepareStatement(getRestaurantString);
		ResultSet resultSet = preparedStatement.executeQuery();	
		while(resultSet.next())	{	
			String restaurantName = resultSet.getString("name");		// column 'name'
			String address = resultSet.getString("address");
			System.out.println("\n" + restaurantName);
			System.out.println(address);
		}
		
	}
	
	private void insertCustomer(Connection connection, String restaurantName, String address) throws SQLException {
		
		String insertSQL = "insert into restaurant (name, address) values (?, ?)";
		PreparedStatement insertStatement;
			insertStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);
			insertStatement.setString(1, restaurantName);
			insertStatement.setString(2, address);
			insertStatement.executeUpdate();
			ResultSet insertResult = insertStatement.getGeneratedKeys();
			if(insertResult.next()) {
				long id = insertResult.getLong(1);
				System.out.println("\n" + id + " is inserted");
			}

		
	}
	
}
