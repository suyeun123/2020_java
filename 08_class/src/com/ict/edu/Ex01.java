package com.ict.edu;

public class Ex01 {
			
		//  - ��Ӱ��� :  �ڽ�Ŭ������ �θ� Ŭ������ ����ʵ�, ����޼ҵ带 ��ü ��������
		// 				  ������� ��� �� �� �ִ� Ŭ�������� ���踦 ���Ѵ�.
		// 				  �ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ´�.
		// 				  �ڽ�Ŭ���� extends �θ�Ŭ����
		//  - �ڹٿ����� ���� ����� �� �� ����. �� �θ�Ŭ������ �ϳ��� �����Ѵ�.
		//  - ��� Ŭ������ object��� Ŭ������ ��ӹް� �ִ�.
		// 
		
	
		public static void main(String[] args) {
			
			Ex01_sub test = new Ex01_sub();
			System.out.println(test);
			System.out.println("============");
			
			test.play();
			System.out.println("============");
			
			test.prn1(); // �θ�Ŭ������ �޼ҵ� ��밡��
			System.out.println("============");
			
			// static �� ��Ӱ� ������� ��� ����
			System.out.println(Ex01_Sup.car);
			System.out.println(Ex01_Sup.GENDER);
			Ex01_Sup.prn2();
			
			/* System.out.println(test.dog); private�� ����̾ ������ �ȵ� */
			
			
			
		}
	
	
	
	
	
}
