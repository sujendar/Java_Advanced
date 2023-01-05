package com.cts.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
public static void main(String[] args) {
	int[] numbers = { 2, 6, 3, 1 };
	int secondLargestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
			.get();
	System.out.println(secondLargestNumber);
	int secondsmallestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.naturalOrder()).skip(1).findFirst()
			.get();
	System.out.println(secondsmallestNumber);
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(secondLargestNumber);
	list.add(secondsmallestNumber);
	 
}
}
