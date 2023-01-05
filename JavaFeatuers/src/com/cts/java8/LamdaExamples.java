package com.cts.java8;

public class LamdaExamples {
	int operate(int a,int d,Functionalinterface type) {
		return type.operation(a, d);
	}
	public static void main(String[] args) {
		Functionalinterface addition=(a,b)->a+b;
		Functionalinterface subtraction=(a,b)->a-b;
		LamdaExamples l=new LamdaExamples();
		System.out.println(l.operate(5, 4, addition));
	}

}

