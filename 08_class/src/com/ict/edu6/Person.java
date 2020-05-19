package com.ict.edu6;

public abstract class Person {
	
		// UML :  -name : String, -age : int
		private String name;
		private int age ;
		
		
		// ������ : <<create>> person(name: String, age: int) 
		// ���� ����ʵ� ��ü�� ���ڷ� ���
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


		// getter/setter
		
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
		
		
		// print()
		
		public abstract void print() ;
		
		
		}
		
		
		
	

