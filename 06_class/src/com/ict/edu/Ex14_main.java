package com.ict.edu;

public class Ex14_main {
	String name = "�±Ǻ���";
	static String addr = "���ֵ�";
	
	public static void main(String[] args) {
		// �ν��Ͻ� �������� ��� ����
//		System.out.println(name);
	
		// static ���� ��� ����
		System.out.println(addr);
		
		Ex14 t1 = new Ex14();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex14.num);
	
		System.out.println("===============================");
		
		Ex14 t2 = new Ex14();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex14.num);
		
		System.out.println("===============================");
		
		Ex14 t3 = new Ex14();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex14.num);
		
	
		
	}
}
