package com.cts.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyExample {
public static void main(String[] args) {
	List<String> list1=Arrays.asList("Ram","Laxman","Kanna");
	List<String> list2=Arrays.asList("Ram","Naksh","Vikas");
	List<String> list3=Arrays.asList("Manas","Laxman","Bharth");
	List<List<String>> mainList=Arrays.asList(list1,list2,list3);
	mainList.stream().flatMap(i->i.stream()).collect(Collectors.toSet()).forEach(System.out::println);
}
}
