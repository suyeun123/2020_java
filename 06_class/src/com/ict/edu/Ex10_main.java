package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {
	
	public static void main(String[] args) {
		

	// 5���� �̸�, ����, ����, ������ �Է¹޾Ƽ�
	// �̸�, ����, ���, ����, ������ ���ϰ� ��������

	// ������ ������ main���� ����
	Scanner sc = new Scanner(System.in);

	// �ѻ���� ������ ������ �ִ� Ŭ������ Ex09�̴�.
	// 5���� ������ ���� �� �ִ� �迭�� ������

	Ex10[] arr = new Ex10[5]; 
	
	for(int i = 0;i<arr.length;i++) {
		Ex10 person = new Ex10();
		System.out.print("�̸� : ");
		// String name = sc.next();
		// person.setName(sc.next()); //�̸��� Ex09�� ������ѳ���
		person.setName(sc.next());

		System.out.print("�������� : ");
		int kor = sc.nextInt();

		System.out.print("�������� : ");
		int eng = sc.nextInt();

		System.out.print("�������� : ");
		int math = sc.nextInt();

		// �հ�
		// ������ Ex10Ŭ������ ó���� ������ ����������
		// ó���� ������ ������ �Ҷ� ���� ���Ǵ� ���
		int sum = person.s_sum(kor, eng, math);
		person.setSum(sum);

		// ���
		double avg = person.s_avg();
		person.s_avg();

		// ����
		String hak = person.s_hak();
		person.s_hak();
//				
		arr[i] = person;
	}

	// ������ ����, ���
	// ����
	for(
	int i = 0;i<arr.length;i++)
	{
		for (int j = 0; j < arr.length; j++) {
			if (arr[i].getSum() < arr[j].getSum()) {
				arr[i].setRank(arr[i].getRank() + 1);
			}
		}
	}

	// ����
	// �ӽ����� Ŭ����
	Ex10 tmp = new Ex10();

	for(
	int i = 0;i<arr.length-1;i++)
	{
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i].getRank() > arr[j].getRank()) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}

	// ���
	for(
	int i = 0;i<arr.length;i++)
	{
		System.out.print(arr[i].getName() + "  ");
		System.out.print(arr[i].getSum() + "  ");
		System.out.print(arr[i].getAvg() + "  ");
		System.out.print(arr[i].getHak() + "  ");
		System.out.println(arr[i].getRank() + "  ");

	}

}}