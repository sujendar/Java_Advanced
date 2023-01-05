package com.cts.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,6,8);
		Map<Boolean, List<Integer>> partitionBy=numbers.stream().map(i->i*i).distinct().collect(Collectors.partitioningBy(i->i>6));
		System.out.println(partitionBy.get(true));
		List<String> strings=Arrays.asList("j","h","i");
		String mergedString=strings.stream().collect(Collectors.joining(","));
		System.out.println(mergedString);
	}

}
