package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_Main {
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				HashSet<Ex04> person = new HashSet<Ex04>();
				
				
				while(true) {
					
					Ex04 p = new Ex04();
					
					System.out.print("이름");
					String name = sc.next();
					
					System.out.print("국어");
					int kor = sc.nextInt();
					
					System.out.print("영어");
					int eng = sc.nextInt();
					
					System.out.print("수학");
					int math = sc.nextInt();
					
					p.getName();
					p.s_sum(kor, eng, math);
					
					person.add(p);
					
					System.out.print("계속할까요?<y/n>");
					String str = sc.next();
					
					if(str.equalsIgnoreCase("n")) break;
					
					
					
				}
				
				for (Ex04 k : person) {
					for (Ex04 j : person) {
						if(k.getSum() < j.getSum()) {
							k.setRank(k.getRank());
					}
				}
				
				}
				
				
				
				
				for (Ex04 k : person) {
					System.out.print(k.getName()+ "");
					System.out.print(k.getSum()+ "");
					System.out.print(k.getHak()+ "");
					System.out.print(k.getAvg()+ "");
					System.out.println(k.getRank());
				}
				
				
			}

}
