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
		System.out.print("이름좀..>");
		person.setName(sc.next());
		System.out.println("국어점수 :");
		int kor = sc.nextInt();
		System.out.println("영어점수 :");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		//총점
		int sum = person.getSum();
		person.setSum(sum);
		//평균
		double evg = person.getAvg();
		person.setAvg(avg);
		//학점
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
