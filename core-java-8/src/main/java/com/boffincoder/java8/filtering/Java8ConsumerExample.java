package com.boffincoder.java8.filtering;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 
 * @author Amandeep Singh
 *
 */
public class Java8ConsumerExample {
	public static void main(String[] args) {
		preJava8CollectionIteration();
		postJava8CollectionIteration();
		preJava8MapIteration();
		postJava8MapIteration();
	}
	
	private static void preJava8MapIteration() {
		Map<Long, Employee> idToEmployeeMap = EmployeeStub.getEmployeeAsMap();
		for (Map.Entry<Long, Employee> entry : idToEmployeeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void postJava8MapIteration() {
		BiConsumer<Long, Employee> employeeBiConsumer = (id, employee) -> System.out.println(id + " : " + employee);
		Map<Long, Employee> idToEmployeeMap = EmployeeStub.getEmployeeAsMap();
		idToEmployeeMap.forEach(employeeBiConsumer);
	}

	private static void preJava8CollectionIteration() {
		List<Employee> employees = EmployeeStub.getEmployees();
		Iterator<Employee> employeeItr = employees.iterator();
		Employee employee;
		while (employeeItr.hasNext()) {
			employee = employeeItr.next();
			System.out.println(employee);
		}
	}

	private static void postJava8CollectionIteration() {
		// fetch employees from Stub
		List<Employee> employees = EmployeeStub.getEmployees();
		// create a consumer on employee
		Consumer<Employee> consolePrinter = System.out::println;
		// use List's retrofitted method for iteration on employees and consume it
		employees.forEach(consolePrinter);
	}
}
