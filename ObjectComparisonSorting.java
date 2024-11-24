package com.cg.pack;

import com.cg.pack.dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ObjectComparison {

    public static void main(String args[]) {
        Employee employee1 = new Employee("Prakash", "male", 41, "83 roebuck lane,manchester", "Project Manager");
        Employee employee2 = new Employee("Prakash", "male", 42, "83 roebuck lane,manchester", "Project Manager");
        Employee employee3 = new Employee("Akash", "male", 38, "83 roebuck lane,manchester", "Project Manager");
        Employee employee4 = new Employee("Brijesh", "male", 55, "83 roebuck lane,manchester", "Project Manager");
        Employee employee5 = new Employee("Mohan", "male", 95, "83 roebuck lane,manchester", "Project Manager");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
        employees.sort(employeeNameComparator);
        //Display All Employees in natural alphabet sorted manner
        for (Employee employee : employees)
            System.out.println("Employees in sorted manner by name====" + employee.getName());

        Comparator<Employee> employeeNameComparatorReversed = Comparator.comparing(Employee::getName).reversed();
        employees.sort(employeeNameComparatorReversed);
        //Display All Employees in opposite  alphabet sorted manner
        for (Employee employee : employees)
            System.out.println("Employees in sorted in reversed manner by name====" + employee.getName());

        Comparator<Employee> compositeComparatorNameandAge = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getAge);
        employees.sort(compositeComparatorNameandAge);
        for (Employee employee : employees)
            System.out.println("Employees in sorted by name and age====" + employee.getName());
    }
}
