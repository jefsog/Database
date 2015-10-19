package com.database.tables;

import com.database.config.DatabaseConnection;

/**
 * Created by Jonathan on 10/11/2015.
 */
public interface Table {

    /**
     * The update method to add/read from the database initially.
     */
	void update();

    /**
     * DO NOT OVERRIDE
     *
     * The DEFAULT method for executing querys to and from the database.
     *
     * @param query to be executed
     */
	default void execute(String query) {
		DatabaseConnection.instance.execute(query);
	}

}
