package chapter17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBApplication {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			String connectionUrl = "jdbc:mysql://127.0.0.1/fooddelivery?user=root&password=ben7tpliyim";
//			Connection connection = DriverManager.getConnection(connectionUrl);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery?useTimezone=true&serverTimezone=UTC", "alban", "PASS4alban");
			
// SELECT
			String getRestaurantString = "select * from restaurant where restaurant_id = ? and owner = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(getRestaurantString);
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Agim Agimi");
			ResultSet resultSet = preparedStatement.executeQuery();	
			while(resultSet.next())	{	
				String restaurantName = resultSet.getString("name");		// column 'name'
				String address = resultSet.getString("address");
				System.out.println("\n" + restaurantName);
				System.out.println(address);
			}
			
// INSERT
			String insertSQL = "insert into restaurant (name, address) values (?, ?)";
			PreparedStatement insertStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);
			insertStatement.setString(1, "Amaro 2");
			insertStatement.setString(2, "Te Lesna");
			insertStatement.executeUpdate();
			ResultSet insertResult = insertStatement.getGeneratedKeys();
			if(insertResult.next()) {
				long id = insertResult.getLong(1);
				System.out.println("\n" + id + " is inserted");
			}
			
// UPDATE	
			String updateSQL = "update restaurant set name = ?, address = ? where restaurant_id = ?";
			PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
			updateStatement.setString(1, "Name from Java application");
			updateStatement.setString(2, "Address from Java application");
			updateStatement.setLong(3, 66);
			int affectedRows = updateStatement.executeUpdate();
			if(affectedRows > 0) {
				System.out.println("\nupdate operation is successfull");
				System.out.println(affectedRows + " row is updated");
			} else {
				System.out.println("\nupdate operation failed");
			}

// DELETE
			String deleteSQL = "delete from restaurant where name = ? ";
			PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL);
			deleteStatement.setString(1, "Amaro 2");
			int deletedRows = deleteStatement.executeUpdate();
			if(deletedRows > 0) {
				System.out.println("\ndelete operation is successfull");
				System.out.println(deletedRows + " row is deleted");
			} else {
				System.out.println("\ndelete operation failed");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
