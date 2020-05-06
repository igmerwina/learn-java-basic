package com.erwin.practice;

public enum LoggingLevel {

	PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, ""), ERROR(4, "Some Text ");

	private int i;
	private String s;

	// constructor
	private LoggingLevel(int i, String s) {
		this.i = i;
		this.s = s;
	}

	public int code() {
		return i;
	}
}
 