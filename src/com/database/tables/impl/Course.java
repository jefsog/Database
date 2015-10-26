package com.database.tables.impl;

import com.database.tables.Table;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Course implements Table {
	
	private final String courseCode;
	private final String programCode;
	private final String name;
	private final String roomNumber;
	private final String teacherId;

	public Course(String courseCode, String programCode, String name, String roomNumber, String teacherId) {
		this.courseCode = courseCode;
		this.programCode = programCode;
		this.name = name;
		this.roomNumber = roomNumber;
		this.teacherId = teacherId;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getProgramCode() {
		return programCode;
	}

	public String getName() {
		return name;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public String getTeacherId() {
		return teacherId;
	}

	@Override
	public void sync() {
		//TODO
	}
}
