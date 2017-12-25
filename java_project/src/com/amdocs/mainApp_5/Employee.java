package com.amdocs.mainApp_5;

/**
 * @author Amit
 *
 */
public class Employee {

	private String name;
	private String account;
	private Integer salary;
	
	public Employee(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}

	public Employee() {
		super();
	}
	
	
}
