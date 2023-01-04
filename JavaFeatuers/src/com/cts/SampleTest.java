package com.cts;

import java.util.Arrays;
import java.util.List;

public class SampleTest {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,3,4);
	list.stream().forEach(System.out::println);
}
}
