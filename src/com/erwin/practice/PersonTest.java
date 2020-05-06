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
	
	@Test 
	public void shouldReturnNumberOfPersonInLoop() {
		int i = 0 ;
		while (i < 4) {
			Person person1 = new Person();
			i++;
		}
		assertEquals(4, Person.numberOfPersons());
	}
	
	@Test
	public void demonstrateArrays() {
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
	}

}
