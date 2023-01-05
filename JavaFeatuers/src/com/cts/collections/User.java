package com.cts.collections;

public class User {
private String firstName;
private String lastName;
private Long age;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public User(String firstName, String lastName, Long age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
}
public Long getAge() {
	return age;
}
public void setAge(Long age) {
	this.age = age;
}
}
