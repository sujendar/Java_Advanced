package com.cts.java8;

public class TestClass implements TestInterface1,TestInterface2 {
public static void main(String[] args) {
	
}

@Override
public void show() {
	// TODO Auto-generated method stub
	TestInterface1.super.show();
	TestInterface2.super.show();
}

}
