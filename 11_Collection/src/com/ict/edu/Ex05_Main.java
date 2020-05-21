package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_Main {
	public static void main(String[] args) {    //1. 메인메소드 먼저
		Scanner sc = new Scanner(System.in);   //2. 스캐너 설정
		
		HashSet<Ex05> person = new HashSet<Ex05>();  //3. 컬렉션정의
		// Ex09[] arr = new Ex09[5]
		// for (int i = 0; i < 5; i++) {
		while(true) {       // for문 or while   그러나 for문은 배열이 딱딱정해져있어야함.그래서 while가 편함
		    Ex05  p =  new Ex05();  // 사용할 클래스 인포트
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
		    
			p.setName(name);
			p.s_sum(kor, eng, math);
			
			person.add(p);
			
			System.out.print("계속할까요?(y/n)");
			String str = sc.next();
			if(str.equalsIgnoreCase("n")) break;
			// arr[i] = p ;
		}
		// 순위
		for (Ex05 k : person) {
			for (Ex05 j : person) {
				if(k.getSum() < j.getSum()) {
					k.setRank(k.getRank()+1);
				}
			}
		}
		// 정렬은 안된다.
		
		// 출력
		for (Ex05 k : person) {
			System.out.print(k.getName()+"  ");
			System.out.print(k.getSum()+"  ");
			System.out.print(k.getAvg()+"  ");
			System.out.print(k.getHak()+"  ");
			System.out.println(k.getRank());
		}
	}
}
