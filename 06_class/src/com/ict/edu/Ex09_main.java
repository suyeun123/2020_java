package com.ict.edu;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
		// 5���� �̸�, ����, ����, ������ �Է¹޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������
		
		// ������ ������ main���� ����
		Scanner sc = new Scanner(System.in);
		
		// �ѻ���� ������ ������ �ִ� Ŭ������ Ex09�̴�.
		// 5���� ������ ���� �� �ִ� �迭�� ������
		
		Ex09[] arr = new Ex09[5];
		for (int i = 0; i < arr.length; i++) {
			Ex09 person = new Ex09();
			System.out.print("�̸� : ");
			//String name = sc.next();
			// person.setName(sc.next());  //�̸��� Ex09�� ������ѳ���
			person.setName(sc.next());
			
			
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			// �հ�
			person.s_sum(kor, eng, math);
			
			// ���
			person.s_avg();
			
			// ����
			person.s_hak();
//			
			arr[i] = person ;
		}
		
		
		// ������ ����, ���
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
	
	// ����
	// �ӽ����� Ŭ����
		Ex09 tmp = new Ex09(); 
		
	
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}		
		
		
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"  ");
			System.out.print(arr[i].getSum()+"  ");
			System.out.print(arr[i].getAvg()+"  ");
			System.out.print(arr[i].getHak()+"  ");
			System.out.println(arr[i].getRank()+"  ");
			
			
		}
		
		
	
		
		
			
			
		
}
}