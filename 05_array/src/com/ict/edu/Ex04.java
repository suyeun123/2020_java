package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		// ���� ���ϱ�
		// 1. ��� ����� ������ 1������ �ʱⰪ �ο�
		// 2. ��� ������ ���ؾ� �ȴ�.
		// 3. ��(i)���� ��(j)�� ũ�� �������� ���� ��Ų��.
		
		int[] su = {90, 85, 70, 90, 95, 80};
		int[] rank = {1, 1, 1, 1, 1, 1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				
				if (su[i] < su[j]) {
					rank[i]++;
				}
				
			}
		}
	
	for (int k : rank) {
		System.out.print(k+" ");
	}
	
	System.out.println();
	
	}
	
	
	
}
