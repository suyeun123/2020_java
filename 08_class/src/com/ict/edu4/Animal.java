package com.ict.edu4;


// final  : ����, ���� �ǹ̰� �ִ�.
// final class => ��� �ȵ�
// final method => �������̵� �ȵ�
// final ���� => �������� �ȵ�(���)


public class Animal {
	
	int eyes = 2;
	int legs = 4;
	
	
	public void like() {
		System.out.println("���ڱ�");
		}
	
	public void sound() {
		System.out.println("�����Ҹ�");
	}
	
	
	
	public final void sleep() {
		System.out.println("6�ð��� ���� �ܴ�.");
	}
	
	
	
	
}
