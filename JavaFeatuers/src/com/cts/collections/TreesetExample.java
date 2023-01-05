package com.cts.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(11);
		treeset.add(2);
		treeset.add(21);
		treeset.add(19);
		treeset.add(17);
		treeset.add(13);
		Iterator<Integer> itr=treeset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}
		
		TreeSet<Integer> treeset1=new TreeSet<Integer>(Collections.reverseOrder());
		treeset1.add(5);
		treeset1.add(11);
		treeset1.add(2);
		treeset1.add(21);
		treeset1.add(19);
		treeset1.add(17);
		treeset1.add(13);
		System.out.println("reverses");
		treeset1.forEach(System.out::println);
	}

}
