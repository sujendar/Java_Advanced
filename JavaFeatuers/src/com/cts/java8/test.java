package com.cts.java8;

public enum test {

blue("value","honest");
	public String getVal() {
	return val;
}
	private String msg;
	private String val;
test(String msg,String val){
	this.msg=msg;
	this.val=val;
}
public String getMsg() {
	return msg;
}
public static void main(String[] args) {
	System.out.println(test.blue.getMsg());
	System.out.println(test.blue.getVal());
}
}
