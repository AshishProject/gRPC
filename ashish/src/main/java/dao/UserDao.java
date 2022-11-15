package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			String url = "jdbc:postgresql://localhost:5432/login";
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, "postgres", "1998");
			System.out.println(connection != null ? "connection established" : "connection failed");
		} catch (ClassNotFoundException cnfe) {
			System.err.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {
			System.err.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.err.println(e);
		}
		return connection;
	}

	public void save(String username, String password) {
		Connection connection = getConnection();
		String readQuery = "INSERT INTO logindetails VALUES(?,?)";

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(readQuery);
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			int rowsAffected = prepareStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println(rowsAffected + " record inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
