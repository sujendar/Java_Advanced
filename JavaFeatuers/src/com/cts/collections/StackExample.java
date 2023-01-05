package com.cts.collections;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class StackExample {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(5);
	stack.push(11);
	stack.push(2);
	stack.push(21);
	stack.push(19);
	stack.push(17);
	stack.push(13);
	stack.pop();
	
	Iterator<Integer> itr=stack.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next()); 
		
	}
	Stack<String> stack1=new Stack<String>();

System.out.println(stack1.push("1"));
	
	System.out.println(stack1.add("2"));	

}
}
