package com.amdocs.mainApp_12;

/**
 * @author amit
 *
 */
public class Person {
	private String name;
	private int age;
	private String designation;
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.designation = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String address) {
		this.designation = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	public Person() {
		super();
	}
	
	
}
