package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		
		// ������ �迭 ; 1���� �迭�� ������ ���� ��
		// �������� �迭 : 1���� �迭 �ȿ� �����ϴ� �迭�� ���� ����
		
		// ����� ������ �ѹ���
//		char[][] ch ;
//		ch = new char[3][2];
		// ������ ���� (�������̿����� ����)
		char[][] ch = new char[3][2];
		
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
				
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		// ����ϱ�
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) { //ch�� ������ ��
				System.out.println(ch[i][j]);
				
			}
			
		}
		
		System.out.println("==================================================");
		
		// ����, ����, ������ ���� �ѹ���
		// int[][] k1 = new int[3][2];
		int[][] k1 = {{1,2},{10,20},{100,200}};
		char[][] k2 = {{'a','A'},{'b','B'},{'c','C'}};
		String[][] k3 = {{"java","jsp","andorid"},{"html","css","js"}};

		
		System.out.println("==================================================");
		
		// 1�����迭�� ���� �迭�� �ֱ�(��������, �������� ��� ��밡��)
		int[][] su = new int[2][4];
		
		int[] s1 = {1,2,3,4};
		int[] s2 = {10,20,30,40};
		
		su[0] = s1;
		su[1] = s2;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
			
		}
		

}

}

