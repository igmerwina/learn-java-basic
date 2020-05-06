package com.erwin.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.erwin.practice.Person;

class PersonTest {

	private static final String[] MY_STATE_VALUES = { "PENDING", "PROCESSING", "PROCESSED" };

	private static final int PENDING = 1;
	private static final int PROCESSING = 2;
	private static final int PROCESSED = 3;

	public String[] states() {
		return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
	}

	@Test
	public void shouldReturnHelloWorld() {
		Person marcus = new Person();
		assertEquals("Hello World", marcus.helloWorld());
	}

	@Test
	public void shouldReturnMarcus() {
		Person person = new Person();
		assertEquals("Hello Marcus", person.hello("Marcus"));
	}

	@Test
	public void shouldReturnNumberOfPersons() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		assertEquals(5, Person.numberOfPersons());
	}

	@Test
	public void shouldReturnNumberOfPersonInLoop() {
		int i = 0;
		while (i < 4) {
			Person person1 = new Person();
			i++;
		}
		assertEquals(4, Person.numberOfPersons());
	}

	@Test
	public void demonstrateArrays() {
		// traditional array call
		Person[] persons = new Person[4];
		persons[0] = new Person();
		persons[1] = new Person();
		persons[2] = new Person();
		persons[3] = new Person();

		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].helloWorld();
		}

		for (Person person : persons) {
			person.helloWorld();
		}

		Person myPerson = new Person();
		Person myPerson2 = new Person();

		// short form array call
		Person[] person = { persons[0], persons[3], myPerson, myPerson2 };

		int myState = PENDING;

		switch (myState) {
		default:
			; // print defaultMethod() or statement
			break;
		case PENDING:
			; // print someMethod() or statement
		case PROCESSED:
			; // print someMethod() or statement
		case PROCESSING:
			; // print someMethod() or statement
			break;
		}

		// for looping yang ada di class LoggingLevel as state variable
		for (LoggingLevel state : LoggingLevel.values()) {
			if (state == (LoggingLevel.PENDING)) {

			}
			if (state == (LoggingLevel.PROCESSED)) {

			}
			if (state == (LoggingLevel.PROCESSING)) {

			}
		}
	}

}
