package com.my.educative.java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

	public static List<Person> getPersonsWOLambda(List<Person> persons) {
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}

		});
		return persons;

	}

	public static List<Person> getPersonsWLambda(List<Person> persons) {
		Collections.sort(persons, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));
		return persons;

	}

}