package com.cts.java8;

import java.util.function.Function;

public class FIExample2 {
public static void main(String[] args) {
	Function<Integer, Double> half=a->a/2.0;
	half.apply(5);
}
}
