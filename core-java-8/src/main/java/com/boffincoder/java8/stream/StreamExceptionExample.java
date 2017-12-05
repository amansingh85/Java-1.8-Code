package com.boffincoder.java8.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author Amandeep Singh
 *
 */
public class StreamExceptionExample {
	public static void main(String[] args) {
		List<String> lines = DataStub.getLines();
		Stream<String> stream = lines.stream();
		stream.reduce((a, b) -> a.length() > b.length() ? a : b)
		    .ifPresent(System.out::println);

		// below line will throw the exception
		stream.forEach(System.out::println);
	}
}
