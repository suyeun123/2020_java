package com.ict.java02;

import java.util.Scanner;

public class Sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person[] arr = new Person[5];
		
	
		
		for (int i = 0; i < arr.length; i++) {
			
			Person person = new Person();
			
			
			System.out.print("�̸� : ");
			String name = sc.next();
			
			person.setName(name);
			
			System.out.print("���� : ");
			int kor = sc.nextInt();
			
			
			System.out.print("���� : ");
			int eng = sc.nextInt();
			
			System.out.print("���� : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			person.setSum(sum);
			
			double avg = (int)(sum/0.3*10)/10.0;
			person.setAvg(avg);
			
			String hak = "";
			
			if (avg >= 90) {
				hak = "A";
			}else if (avg >= 80 ) {
				hak = "B";
			}else if (avg >= 70) {
				hak = "C";
			}else {
				hak = "F";
			}
			person.setHak(hak);
			
			
			arr[i] = person ;
			
			
			
		} // for�� ��
		
		// ���� ���ϱ� ��(i) �� ��(j) �� ���ؼ� ������ ū���� ������ �� ��� �����Ѵ�.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum());
				arr[i].setRank(arr[i].getRank()+1);
			}
		}
		// ���� : ��(i) �� ��(j) �� ���ؼ� ������ �������� ������ �ڸ��� �ٲ۴�.
		
		//		 �ڸ������� ���ؼ��� �ӽ� ������ �ʿ��ϴ�.
		
	   Person tmp = new Person();
	   
	   for (int i = 0; i < arr.length-1; i++) {
		 for (int j = i+1; j < arr.length; j++) {
			if(arr[i].getRank() > arr[j].getRank()) {
				tmp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = tmp;
				
			}
		}
	}
		
		
		
		//���
		for (Person k : arr) {
		     System.out.print(k.getName() + " ");
		     System.out.print(k.getSum() + " ");
		     System.out.print(k.getAvg() + " ");
		     System.out.print(k.getHak() + " ");
		     System.out.print(k.getRank());
		     
		}
		
	}
	
	
}
