package com.ict.edu;

public class Ex14 {

	// static : ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ�
	// Ŭ������ ������������ ����� �� ����.
	// : ��������(��� ��ü�� ����� �� �ִ�)
	// : static ���� �̶�� ���� �����ϰ� �������

	int su = 10; // �ν��Ͻ� ����

	static int num = 10; // static����, Ŭ��������

	public Ex14() {
		su++;
		num++;
	}

	public void sum(int k1, int k2) {
		// static�� ���������� ����� �� ����.
		// static double p1 = 3.14 ;
		su = k1 = k2;
	}

		// static �޼ҵ� : static ������ �������� ���
	public static void add(int k1, int k2) {
		// �ν��Ͻ� �������� ���Ұ�
//		su = k1 + k2 ;
		num = k1 + k2; // static ����
		
		double p = 3.14 ; // static ��������
		// static�� ���������� ����� �� ����.
//		static double p1 = 3.14 ;
	}
	
}
