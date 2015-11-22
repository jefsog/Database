package com.database.tables.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Consumer;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class Result {

	private ResultSet resultSet;

	public Result(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public void forEach(Consumer<ResultSet> e) {
		try {
			while (resultSet.next()) {
				e.accept(resultSet);
			}
			resultSet.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
