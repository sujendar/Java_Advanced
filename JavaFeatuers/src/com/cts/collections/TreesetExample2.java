package com.cts.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetExample2 {
public static void main(String[] args) {
	TreeSet<User> treeset1=new TreeSet<User>(Comparator.comparing(User::getLastName));
	treeset1.add(new User("ram", "ayogh", 23L));
	treeset1.add(new User("ram", "cyogh", 23L));
	treeset1.add(new User("ram", "byogh", 23L));
	treeset1.forEach(System.out::println);
}
}
