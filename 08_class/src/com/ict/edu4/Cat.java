package com.ict.edu4;

public class Cat extends Animal {
	String name = "����";
	int age = 10;
	
	public void hobby() {
		System.out.println("�����̳���");
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�~�߿�");
	}
	
	
	// �θ�Ŭ������ �޼ҵ�� �ڽ�Ŭ������ �޼ҵ尡 ���� ��
	// ��, �ڽ�Ŭ������ ������ �ڽ��� Ŭ������ �°� �����ϴ� ��
	/*
	 * @Override public void sleep() { System.out.println("�� �� �� ��"); }  => �θ�Ŭ������ sleep()�� final ó����.
	 */
	
}
