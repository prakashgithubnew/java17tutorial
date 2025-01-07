package org.example.utilities;

import org.example.dto.Person;

import java.util.Comparator;

public class ComparatorUtility {

    public static Comparator getPersonAgeComparator(){
        Comparator<Person> personAgeComparator = Comparator.comparing(Person::getAge);
        return personAgeComparator;
    }

    public static Comparator getPersonNameComparator(){
        Comparator<Person> personNameComparator = Comparator.comparing(Person::getName);
        return personNameComparator;
    }

    public static Comparator getPersonProfessionComparator(){
        Comparator<Person> personProfessionComparator = Comparator.comparing(Person::getProfession);
        return personProfessionComparator;
    }

    public static Comparator getPersonSexComparator(){
        Comparator<Person> personSexComparator = Comparator.comparing(Person::getSex);
        return personSexComparator;
    }
}
