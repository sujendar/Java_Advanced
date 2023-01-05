package com.cts.java8;

import java.util.function.BiFunction;

public class MR2 {
	public int add(int a,int b) {
		return a+b;
	}
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> adder=new MR2()::add;
	System.out.println(adder.apply(2, 3));
}
}
