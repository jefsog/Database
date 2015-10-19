package com.database;

import java.sql.SQLException;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class Test {

	public static void main(String[] args) {
		/**
		 * Open and connect to the OracleSQL Database
		 */
		DatabaseConnection connection = DatabaseConnection.open();
		connection.connect();

		/**
		 * Execute a query and iterate through all the results
		 */
		connection.execute("select author.* from author").forEach(r -> {
			try {
				int authorId = r.getInt("AUTHORID"); //Read a int value from column AUTHORID
				String lastName = r.getString("LNAME"); //Read the String value from column LNAME
				String firstName = r.getString("FNAME"); //Read the String value from column FNAME

				if (firstName.equalsIgnoreCase("bob")) {
					r.updateString("FNAME", "bill"); //Update the FNAME to 'bill' if it is currently 'bob'
					r.updateRow(); //Update the row when changes are made
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}

}
