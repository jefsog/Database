package com.database.config;

import com.database.tables.impl.Result;

import java.sql.*;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class DatabaseConnection {

    /**
     * Singleton instance of the DatabaseConnection class. (This will be removed to avoid Global State)
     */
    public static DatabaseConnection instance;

    /**
     * Create a new instance of the DatabaseConnection class.
     * @return the connection
     */
    public static DatabaseConnection open() {
        if (instance != null) {
            throw new RuntimeException("You can not open more than one instance of a database.");
        }
        return instance = new DatabaseConnection(DatabaseConfiguration.DEFAULT);
    }

    /**
     * The configuration for the database.
     */
    private final DatabaseConfiguration config;

    /**
     * The database connection
     */
    private Connection connection;

    /**
     * Creates a <code>Statement</code> object for sending
     * SQL statements to the database.
     * @param config the database configuration
     */
    private DatabaseConnection(DatabaseConfiguration config) {
        this.config = config;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Opens a new connection to the database.
     */
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@" + config.getHost() + ":" + config.getPort() + ":grok", config.getUsername(), config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Executes a SQL query to the server
     * @param query the string to be executed
     * @return result of the query
     */
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
