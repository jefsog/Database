package com.database.tables;

import com.database.config.DatabaseConnection;

/**
 * Created by Jonathan on 10/11/2015.
 */
public interface Updateable {

	void update();

	default void execute(String query) {
		DatabaseConnection.instance.execute(query);
	}

}
