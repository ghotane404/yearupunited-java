package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		// Setup DataSource
		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
		dataSource.setUsername("root");
		dataSource.setPassword("yearup26");

		// Query the database
		String sql = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";

		try (Connection conn = dataSource.getConnection();
		     PreparedStatement stmt = conn.prepareStatement(sql);
		     ResultSet rs = stmt.executeQuery()) {


			String productIDName = "Id";
			String productName = "Name";
			String productPrice = "Price";
			String productInStock = "Stock";

			System.out.printf("%-5s %-35s %-8s %-10s%n",
					productIDName, productName, productPrice, productInStock);
			System.out.printf("%-5s %-35s %-8s %-10s%n",
					"-".repeat(4), "-".repeat(33), "-".repeat(7), "-".repeat(5));
				while (rs.next()) {
					int productID = rs.getInt("ProductID");
					String name = rs.getString("ProductName");
					double price = rs.getDouble("UnitPrice");
					int inStock = rs.getInt("UnitsInStock");

					System.out.printf("%-5d %-35s $%-8.2f %-10d%n",
							productID, name, price, inStock);
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
