/**
 * 
 */
package com.atlantis.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Praveen Kumar
 * 
 */
public class DriverRegister {

	private static Logger logger = Logger.getLogger(DriverRegister.class
			.toString());
	private static Properties prop = new Properties();
	static {
		try {
			prop.load(DriverRegister.class.getClassLoader()
					.getResourceAsStream("dbCredentials.properties"));
		} catch (IOException e) {
			logger.info(e.getMessage());
		}

	}

	public static final String DB_DRIVER = prop.getProperty("driver.package");
	public static final String DRIVER_URL = prop.getProperty("driver.location");
	public static final String DB_USERNAME = prop
			.getProperty("driver.username");
	public static final String DB_PASSWORD = prop
			.getProperty("driver.password");

	/**
	 * Returns the connections string for VoltDB.
	 * */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DRIVER_URL, DB_USERNAME,
					DB_PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * Closes the connections and resultSet for VoltDB.
	 * */
	public static ResultSet getSelectStatement(String sqlQuery) {
		ResultSet results = null;
		try {

			Connection conn = getConnection();
			Statement query = conn.createStatement();
			results = query.executeQuery(sqlQuery);
			query.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return results;
	}

	/**
	 * Closes the connections for VoltDB.
	 * */
	public static void closeConnection(Connection conn, ResultSet results) {

		try {
			results.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn) {

		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
