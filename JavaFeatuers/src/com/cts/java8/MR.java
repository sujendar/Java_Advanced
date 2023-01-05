package com.cts.java8;

public class MR {
static void saySomething() {
	System.out.println("Hi ");
}
public static void main(String[] args) {
	Sayble say=MR::saySomething;
	say.say();
}
}
