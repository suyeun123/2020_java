package com.ict.edu;

public class Ex11_main {
		public static void main(String[] args) {
			// ��ü ����
			Ex11 t1 = new Ex11("�Ѹ�");
			
			System.out.println(t1.getName());
			System.out.println(t1.getAge());
			System.out.println(t1.getAddr());
			
			System.out.println("============================");
			// t1 �� �����͸� ��������
			// �뾥, 9, �ϱ����� ��������
			
			t1.setName("�뾥");
			t1.setAge(9);
			t1.setAddr("�ϱ�");
			System.out.println(t1.getName());
			System.out.println(t1.getAge());
			System.out.println(t1.getAddr());
			
			System.out.println("============================");
			
		
			Ex11 t2 = new Ex11();
			
			System.out.println(t2.getName());
			System.out.println(t2.getAge());
			System.out.println(t2.getAddr());
			
			System.out.println("============================");
			
			Ex11 t3 = new Ex11("����",47,"����");
			System.out.println(t3.getName());
			System.out.println(t3.getAge());
			System.out.println(t3.getAddr());
			
		}
}
