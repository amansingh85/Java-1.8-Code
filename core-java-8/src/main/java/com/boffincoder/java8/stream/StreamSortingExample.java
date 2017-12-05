package com.boffincoder.java8.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.boffincoder.java8.stream.StreamSamples.Person;

/**
 * 
 * @author Amandeep Singh
 *
 */
public class StreamSortingExample {
	public static void main(String[] args) {
		List<String> lines = DataStub.getLines();
		lines.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst()
		    .ifPresent(System.out::println);

		Collection<Person> persons = StreamSamples.getPersons();
		List<Person> sortedByAge = persons.stream()
		    .sorted(Comparator.comparingInt(Person::getAge))
		    .collect(Collectors.toList());
		System.out.println(sortedByAge);
	}
}
