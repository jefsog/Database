package com.database.tables.impl;

import com.database.tables.Updateable;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Room implements Updateable {

	private final String roomNumber;
	private final String roomType;

	public Room(String roomNumber, String roomType) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	@Override
	public void update() {
		//TODO
	}
}
