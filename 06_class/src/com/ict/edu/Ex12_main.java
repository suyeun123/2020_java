package com.ict.edu;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {

		// 5���� �̸�, ����, ����, ������ �Է¹޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������

		// ������ ������ main���� ����
		Scanner sc = new Scanner(System.in);

		// �ѻ���� ������ ������ �ִ� Ŭ������ Ex09�̴�.
		// 5���� ������ ���� �� �ִ� �迭�� ������

		Ex12[] arr = new Ex12[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			
			System.out.print("�̸� : ");
			// String name = sc.next();
			// person.setName(sc.next()); //�̸��� Ex09�� ������ѳ���
			

			System.out.print("�������� : ");
			int kor = sc.nextInt();

			System.out.print("�������� : ");
			int eng = sc.nextInt();

			System.out.print("�������� : ");
			int math = sc.nextInt();

			// ����
			// ������ Ex10Ŭ������ ó���� ������ ����������
			// ó���� ������ ������ �Ҷ� ���� ���Ǵ� ���
			int sum = kor+ eng + math;
			

			// ���
			double avg = (int)(sum/3.0*10)/10.0;
			

			// ����
			String hak = "";
			if(avg>=90) {
					hak = "A";
				}else if(avg>=80) {
					hak = "B";
				}else if(avg>=70) {
					hak="C";
				}else {
					hak = "F";
				}
				Ex12 person = new Ex12(name, sum, avg,hak, 1);
				arr[i] = person;
		}
			


		// ������ ����, ���
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}

		// ����
		// �ӽ����� Ŭ����
		Ex12 tmp = new Ex12();

		for (int i = 0; i < arr.length - 1; i++) {
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
			System.out.print(arr[i].getName() + "  ");
			System.out.print(arr[i].getSum() + "  ");
			System.out.print(arr[i].getAvg() + "  ");
			System.out.print(arr[i].getHak() + "  ");
			System.out.println(arr[i].getRank() + "  ");

		}

	}
}