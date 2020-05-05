package com.erwin.practice;

import com.erwin.practice.Name;

public class Person {
	private Name personName;
	private static int personCounter = 0;
	
	public Person() {
		personCounter++;
		/*
		 * Empty on purpose - default constructor 
		 * */
	}
	
	public Person(Name personName) {
		this.personName = personName;
	}

	public String helloWorld() {
		return "Hello World";
	}

	public String hello(String name) {
		return "Hello " + name;
	}

	public static int numberOfPersons() {
		return personCounter;
	}
}
