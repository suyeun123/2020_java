package com.ict.edu;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);   // Ű���忡 �Է�
	int[][] arr = new int[5][5];
	
	// �Է�
	for (int i = 0; i < arr.length; i++) {
			System.out.print("��ȣ : ");
			int no = sc.nextInt();
			System.out.print("��������: ");
			int kor = sc.nextInt();
			System.out.print("��������: ");
			int eng = sc.nextInt();
			System.out.print("��������: ");
			int math = sc.nextInt();
			int sum = kor + eng + math ;   //���� ���հ�
			int avg = sum / 3 ;   // ��հ� ���ϱ�
			int hak = 0 ;    //����
			if (avg >= 90) {
				hak = 'A';
			}else if (avg>=80) {
				hak = 'B';
			}else if (avg>=70) {
				hak = 'C';
			}else {
					hak = 'F';
			}
			// ������ ���� ���̸����ϱ�
			int rank = 1;
			arr[i][0] = no;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
			}
	
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
					
				}
			}
		}
			
		// ����
		// �ӽ�����
		int[] tmp = new int[5];   //������ ���� ��� �����α�
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
					if (arr[i][4] > arr[j][4]) {
							tmp = arr[i];
							arr[i] = arr[j];
							arr[j] = tmp;
						
					}
			}
			
		}
			
		// ���
		System.out.println("��ȣ\t����\t���\t����\t����");
		for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j==3) {
						System.out.print((char)(arr[i][j])+"\t");
					}else {
						System.out.print(arr[i][j]+"\t");
					}
				}
				System.out.println();
						
					}
					
				}
			
	
			

	
	
	
	
	
		
		
		
	
	
	
}
