package com.database.tables.impl.student;

/**
 * Created by Jonathan on 10/11/2015.
 */
public final class Transcript {

	private final String code;
	private final String enrolmentDate;
	private final String graduationDate;

	public Transcript(String code, String enrolmentDate, String graduationDate) {
		this.code = code;
		this.enrolmentDate = enrolmentDate;
		this.graduationDate = graduationDate;
	}

	public String getCode() {
		return code;
	}

	public String getEnrolmentDate() {
		return enrolmentDate;
	}

	public String getGraduationDate() {
		return graduationDate;
	}
}
