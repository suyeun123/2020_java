package com.ict.edu;

// �ڽ�Ŭ���� : �ڽ�Ŭ�������� �θ�Ŭ������ ��Ӱ��踦 �δ´�.
public class Ex01_sub extends Ex01_Sup {
				
	String name = "ȫ����";
	int age = 13;
	
	public Ex01_sub() {
		System.out.println("�ڽ�Ŭ���� ������ : "  + this);
	}
	
	public void play() {
		System.out.println(name); // ȫ����
		
		String name = "ȫ�β�";
		System.out.println(name); // ȫ�β�
	
		
		// ����X, ����X, �θ�O
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		
		
		int age = 3 ;
		System.out.println(age);       // 3  (����)
		System.out.println(this.age);  // 13 (����)
		System.out.println(super.age); // 57 (�θ�)
		
		
	}
	
	public void play2() {
		//System.out.println(dog); // private�� ����̾ ������ �ȵ�
		System.out.println(GENDER);
		System.out.println(car);
	}
	
	
}
