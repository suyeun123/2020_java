package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
		// ������ �迭 : 1���� �迭�� ������ ���� ��
		// ���� : ��������, ���� ����
		// �������� : 1���� �迭 �ȿ� �����ϴ� �迭�� ���� ����
		// �������� : 1���� �迭 �ȿ� �����ϴ� �迭�� ���� �������� ������
		
		// �������� �迭
		// 1. ���� : �ڷ���[][] �̸� ;
		int[][] su ;
		
		// 2. ���� : �̸� = new �ڷ���[1���� �迭�� ��][1���� �迭�ȿ� �����ϴ� �迭�� ��]
		su = new int [2][3];
		
		// 3. ������ ����
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
		//�ּ�Ȯ��(����ID Ȯ������)
		
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		

		// ������ ��������(����) �迭�� ���
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		
		
		
	}
}
