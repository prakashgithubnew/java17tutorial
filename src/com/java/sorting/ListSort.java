package com.java.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,6,1,2,9,12,11);
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println("==========List in sorted Order=====");
		sorted.forEach(i->{
			System.out.println(i);
		});
		
		System.out.println("==========List in reverse sorted Order=====");
		
		List<Integer> sorted2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		sorted2.forEach(i->{
			System.out.println(i);
		});
	}
}
