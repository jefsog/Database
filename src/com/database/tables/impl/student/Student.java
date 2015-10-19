package com.database.tables.impl.student;

import com.database.tables.Updateable;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Student implements Updateable {

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
	public void update() {
		String query = "INSERT INTO STUDENTS(ID, FIRST_NAME, LAST_NAME) VALUES(" + id + "," + first + "," + last + ")";
		execute(query);
	}
}
