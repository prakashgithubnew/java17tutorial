package org.example;

import org.example.dto.Person;
import org.example.utilities.ComparatorUtility;

import java.util.Comparator;
import java.util.List;


import java.util.List;
import java.util.Comparator;

public class ListImplementation {
    public static void main(String[] args) {
        System.out.println("===== Sorting Using simple primitive types =====");
        List<Integer> list = List.of(1, 2, 5, 0, 17, 11);

        // Default sorting
        System.out.println("List in default sorting order:");
        list.stream().sorted().forEach(System.out::println);

        // Sorting in descending order
        System.out.println("List in descending sorting order:");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("===== Sorting Using Java Objects =====");
        List<Person> listPerson = List.of(
                new Person("Prakash", 12, "M", "software engineer"),
                new Person("Mahesh", 4, "M", "software engineer"),
                new Person("Ganesh", 44, "M", "engineer"));

        // Sorting by age
        System.out.println("List sorted by age:");
        Comparator<Person> personAgeComparator = ComparatorUtility.getPersonAgeComparator();
        listPerson.stream().sorted(personAgeComparator).forEach(System.out::println);

        // Sorting by name
        System.out.println("List sorted by name:");
        Comparator<Person> personNameComparator = ComparatorUtility.getPersonNameComparator();
        listPerson.stream().sorted(personNameComparator).forEach(System.out::println);

        // Filtering and sorting by age (age > 4)
        System.out.println("Filtered and sorted by age (age > 4):");
        listPerson.stream()
                .filter(person -> person.getAge() > 4)
                .sorted(personAgeComparator)
                .forEach(System.out::println);

        // Filtering and sorting by profession (software engineer)
        System.out.println("Filtered and sorted by profession (software engineer):");
        listPerson.stream()
                .filter(person -> person.getProfession().equals("software engineer"))
                .sorted(personNameComparator)
                .forEach(System.out::println);
    }
}
