package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// �迭 : ���� �ڷ����� �����͵��� �Ѱ��� ��Ƶ� ����
		// 			�ݵ�� ���� �ڷ����̾�߸� �Ѵ�.
		//			�����Ҷ� ũ�⸦ �����ϰ�, ������ ũ��� ���� �Ұ�
		// 			�迭�� ��� �Ҷ��� �Ϲ�������for�� ����Ѵ�.
		
		//�迭 ���� ���� ; ���� -> ���� -> ������ ����
		
		//����� ������ �ѹ���
		
		char [] ch = new char[4] ;
		
		// ������ ����
			ch[0] = 'J';
			ch[1] = 'A';
			ch[2] = 'V';
			ch[3] = 65; // 0 ~ 65535 ������ �� �� �ִ�.
			
			// ���
			
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			
		}
			
		System.out.println("----------------------------");

		for (char k : ch) {
			System.out.println(k);
		}
	
		System.out.println("----------------------------");		
		
		//����, ����, ������ ���� �ѹ���
		char[] ch2 = {'j','a','v','a'};
		int[] k2 = {100,200,300,400};
		double[] d2 = {3.14, 71.0, 42.1};
		String[] str = {"ȫ�浿","�̱浿","��浿","���浿"};
		
		
		for (String k : str) {
			System.out.println(k);
			
		}
		
		
	}
}
