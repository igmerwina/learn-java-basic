package com.erwin.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.erwin.practice.Person;

class PersonTest {

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
		assertEquals(5 , Person.numberOfPersons());
	}

}
