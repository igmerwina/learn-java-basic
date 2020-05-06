package com.erwin.practice;

public enum LoggingLevel {

	PENDING(1), PROCESSING(2), PROCESSED(3);

	private int i;

	// constructor
	private LoggingLevel(int i) {
		this.i = i;
	}

	public int code() {
		return i;
	}
}
 