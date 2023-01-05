package com.cts.java8;

import java.util.function.Predicate;

public class FIExample3 {
public static void main(String[] args) {
	Predicate<Integer> less=i->(i>18);
	System.out.println(less.test(10));
}
}
