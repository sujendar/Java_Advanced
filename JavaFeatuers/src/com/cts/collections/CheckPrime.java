package com.cts.collections;

public class CheckPrime {
	static int i=2;
public static void main(String[] args) {
	if(isPrime(17)) {
		System.out.println("it prime number");
	}
}

private static boolean isPrime(int n) {
	// TODO Auto-generated method stub
	if(n==0 || n==1)
	return false;
	
	if(n==i)
		return true;
	
	if(n%i==0) {
		return false;
	}
	i++;
	return isPrime(n);
}
}
