package com.boffincoder.java8.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.boffincoder.java8.stream.StreamSamples.Person;


/**
 * 
 * @author Amandeep Singh
 *
 */
public class StreamMappingExample {
	public static void main(String[] args) {
		Collection<Person> persons = StreamSamples.getPersons();
		List<String> firstNames = persons.stream()
		    .map(Person::getFirstName)
		    .collect(Collectors.toList());
		System.out.println(firstNames);
	}
}
