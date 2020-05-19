package com.ict.edu4;

public class Cat extends Animal {
	String name = "나비";
	int age = 10;
	
	public void hobby() {
		System.out.println("쥐잡이놀이");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~야옹");
	}
	
	
	// 부모클래스의 메소드와 자식클래스의 메소드가 같은 것
	// 단, 자식클래스가 내용을 자신의 클래스에 맞게 변경하는 것
	/*
	 * @Override public void sleep() { System.out.println("야 옹 야 옹"); }  => 부모클래스가 sleep()를 final 처리함.
	 */
	
}
