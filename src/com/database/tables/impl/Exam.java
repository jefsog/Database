package com.database.tables.impl;

import com.database.tables.Table;
import com.database.tables.impl.student.Student;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Exam implements Table {

	private final String courseCode;
	private final String roomNumber;
	private final String start;
	private final String end;
	private final Student[] students;

	public Exam(String courseCode, String roomNumber, String start, String end, Student... students) {
		this.courseCode = courseCode;
		this.roomNumber = roomNumber;
		this.start = start;
		this.end = end;
		this.students = students;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public Student[] getStudents() {
		return students;
	}

	@Override
	public void sync() {
		//TODO
	}
}
