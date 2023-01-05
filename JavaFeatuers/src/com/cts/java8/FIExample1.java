package com.cts.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FIExample1 {
public static void main(String[] args) {
	
	Consumer<Integer> con=b->System.out.println(b);
	con.accept(4);
	
	Consumer<List<Integer>> square=list->{
		for (int i=0;i<list.size();i++) {
			list.set(i, 2*list.get(i));
		}
	};
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	square.accept(list);
	list.forEach(System.out::println);
}
}
