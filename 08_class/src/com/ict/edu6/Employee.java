package com.ict.edu6;

public class Employee extends Person{

	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void print() {
//		super.print();
		System.out.println("�̸� : " + super.getName() + ", ���� : " + getAge() + ", �μ� : " + dept);
	}
	
	
	
}
