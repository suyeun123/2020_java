package com.ict.edu01;

public class Ex06_main {
		public static void main(String[] args) {
			
			/* Inner01 in01 = new Inner01(); */
			// ����Ŭ���� ������ ��ü �����ȵ�
			
			Ex06 e6 = new Ex06();
			System.out.println(e6.name);
			e6.sound();
			System.out.println("==============================================================");
			// 1. ����Ŭ������ �����ϴ� �޼ҵ带 ����
			
			e6.play();
			System.out.println("===================�ܺθ޼ҵ峡=====================");
			// ����Ŭ������ �����ϴ� �޼ҵ� ������ ������ ����Ŭ���� ����Ҽ� ����
			
			
			/* Ex06.class Inner01 in01 = e6.new Inner01(); */
			// Member ����Ŭ���� ����� ������� ��ü ���� ����
			
			
			
			
		}
}
