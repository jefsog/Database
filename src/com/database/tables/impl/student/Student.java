package com.database.tables.impl.student;

import com.database.tables.Table;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Student implements Table {

	private final Transcript transcript;
	private final String id;
	private final String first;
	private final String last;

	public Student(Transcript transcript, String id, String first, String last) {
		this.transcript = transcript;
		this.id = id;
		this.first = first;
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	@Override
	public void sync() {
		String query = "INSERT INTO STUDENTS(FIRST_NAME, LAST_NAME, STUDENT_ID, ENROLLMENT_DATE, GRADUATION_DATE) VALUES(" + first
				+ "," + last + "," + id + ")";
		execute(query);
	}
}
