package com.database.config;

import com.database.tables.impl.Result;

import java.sql.*;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class DatabaseConnection {

	public static DatabaseConnection instance;

	public static DatabaseConnection open() {
		return instance = new DatabaseConnection(DatabaseConfiguration.DEFAULT);
	}

	private final DatabaseConfiguration config;
	private Connection connection;

	public DatabaseConnection(DatabaseConfiguration config) {
		this.config = config;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void connect() {
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@" + config.getHost() + ":" + config.getPort() + ":grok", config.getUsername(), config.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Result execute(String query) {
		if (connection == null) {
			connect();
		}
		try {
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			return new Result(stmt.executeQuery(query));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new NullPointerException("Invalid query!");
	}

}
