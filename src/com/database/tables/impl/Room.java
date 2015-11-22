package com.database.tables.impl;

import com.database.tables.Table;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Room implements Table {

	/**
	 * Room number for the class room
	 */
	private final String roomNumber;

	/**
	 * Room type for the class room (Lab/Regular Class)
	 */
	private final String roomType;

	/**
	 * Creates a new object of the Room class
	 *
	 * @param roomNumber the room number
	 * @param roomType type of the room
	 */
	public Room(String roomNumber, String roomType) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	/**
	 * Returns the roomNumber
	 * @return roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * Returns the roomType
	 * @return roomType
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * Syncs the values with the SQL table to ensure data integrity
	 * @return roomType
	 */
	@Override
	public void sync() {
		//TODO
	}
}
