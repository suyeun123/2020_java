package com.ict.edu;



import java.util.HashSet;
import java.util.Scanner;


public class Ex04_Main {

		
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Ex04[] arr = new Ex04[4];
	
	
	
	HashSet<Ex03> set1 = new HashSet<Ex03>();
	
	
	
	for (String k : args) {
		Ex04 person = new Ex04();
		System.out.print("�̸���..>");
		person.setName(sc.next());
		System.out.println("�������� :");
		int kor = sc.nextInt();
		System.out.println("�������� :");
		int eng = sc.nextInt();
		System.out.println("�������� : ");
		int math = sc.nextInt();
		//����
		int sum = person.getSum();
		person.setSum(sum);
		//���
		double evg = person.getAvg();
		person.setAvg(avg);
		//����
		String hak = person.hak();
		person.getHak();
				
		
		
	}
	
	
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (args[i].setSum() < args[j].getRank()+1);
				}
		}
		
		for (int i = 0; i < args.length; i++) {
	
			
		}
		
		
	
	}	
	
}
