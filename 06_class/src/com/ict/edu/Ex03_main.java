package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(1);
		// Ex03 Ŭ������ ��ü�� ������
		// Ex03�� �����ڰ� ������ �⺻������ ���
		Ex03 e3 = new Ex03();
		
		System.out.println(2);
		//��ȯ���� �����Ƿ� �޾Ƽ� ������ �͵� ����.
		e3.add();
		System.out.println(3);
		int res = e3.mul();
		System.out.println(4);
		System.out.println(res);
		
		
	}
}
