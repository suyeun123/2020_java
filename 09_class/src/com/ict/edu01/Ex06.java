package com.ict.edu01;


// Local ���� Ŭ����
public class Ex06 {

	String name = "�Ѹ�";
	
	public Ex06() {
		
		System.out.println("�ܺ�" + this);
		
	}
	
	public void sound() {
		System.out.println("ȣȣ~ȣȣ");
	}
	
	public void play() {
		int age = 22;
		
		class Inner01 {
			int money = 2000;
			public Inner01() {
					System.out.println("���� : " + this);
			}
			
			public void hobby() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(money);
				
			}
			
		}// ����Ŭ���� ��
		
		Inner01 in01 = new Inner01();
		
		in01.hobby();
		System.out.println("==============================================================");
		System.out.println(" �޼ҵ�� ");
		
	} // �ܺ� �޼ҵ� ��
	
	
} // �ܺ� Ŭ���� ��
