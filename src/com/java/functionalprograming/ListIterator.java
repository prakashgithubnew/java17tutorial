package com.java.functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIterator {

	public static void main(String[] args) {

		// Simple adding elements to ArrayList and Iterate
		Person person1 = new Person("Prakash", "Sharma", 23, 34000);
		Person person2 = new Person("Manish", "Sharma", 23, 34000);

		List<Person> namesList = Arrays.asList(person1, person2);
		namesList.forEach(name -> {
			System.out.println(name.fname);
			System.out.println(name.lname);
		});

		namesList.forEach(System.out::println);

		// Convert Object attribute to Upper Case
		System.out.println("Person Object first name to Upper Case");
		List<String> fnameUpperCase = namesList.stream().map(i -> i.fname.toUpperCase()).collect(Collectors.toList());
		fnameUpperCase.forEach(n -> {
			System.out.println(n);
		});

		// Calculate the square of numbers in one line
		List<Integer> squareList = Arrays.asList(1, 2, 3, 4, 5, 6).stream().map(i -> i * i)
				.collect(Collectors.toList());
		System.out.println("Square of a numbers are given below::::");
		squareList.forEach(n -> {
			System.out.print(n + ",");
		});

		// Convert String to upper case
		List<String> l2 = Arrays.asList("a", "b");
		List<String> upperCaseNames = l2.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("String to upper case");
		upperCaseNames.forEach(i -> {
			System.out.println(i);
		});

	}

}
