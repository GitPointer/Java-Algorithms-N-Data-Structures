package com.my.educative.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class CopmaratorUsingLambda {

	public static void main(String args[]) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(23, "John", "USA"));
		persons.add(new Person(23, "Carl", "Australia"));
		persons.add(new Person(23, "Amit", "India"));
		persons.add(new Person(23, "Vikram", "Bhutan"));
		persons.add(new Person(23, "Kane", "Brazil"));
		// First without Lambda
		// Calling getPerson() method which will return the List of Person in sorted
		// order.
		List<Person> sortedPersons = PersonService.getPersonsWOLambda(persons);
		System.out.println("Persons after sorting");
		// Printing the name of each person.
		for (Person person : sortedPersons) {
			System.out.println("Person Name : " + person.getName());
		}

		// Using Lambda
		persons = new ArrayList<>();
		persons.add(new Person(23, "Vikas", "USA"));
		persons.add(new Person(23, "Ayansh", "Australia"));
		persons.add(new Person(23, "Meenu", "India"));
		persons.add(new Person(23, "Keshav", "Bhutan"));
		persons.add(new Person(23, "Boopu", "Brazil"));
		// Calling getPerson() method which will return the List of Person in sorted
		// order.
		sortedPersons = PersonService.getPersonsWLambda(persons);
		System.out.println("Persons after sorting");
		// Printing the name of each person.
		for (Person person : sortedPersons) {
			System.out.println("Person Name : " + person.getName());
		}
	}

}
