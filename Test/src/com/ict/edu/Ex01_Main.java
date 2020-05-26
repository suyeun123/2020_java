package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex01_Main {

	  public static void main(String[] args) {
		
		  
		  Scanner sc = new Scanner(System.in);
		  
		  HashSet<Ex01> person = new HashSet<Ex01>();
		  
		  while(true) {
			  
			  Ex01 p = new Ex01();
			  
			  System.out.print("이름:");
			  String name = sc.next();
			  
			  System.out.print("국어");
			  int kor = sc.nextInt();
			  
			  System.out.print("영어");
			  int eng = sc.nextInt();
			  
			  System.out.print("수학");
			  int math = sc.nextInt();
			  
			  p.getSum();
			  p.s_sum(kor, eng, math);
			  
			  person.add(p);
			  
			  System.out.print("계속할까요? (y/n) >>");
			  String str = sc.next();
			  
			  if(str.equalsIgnoreCase("n"))break;
			  
		  }
		  //순위
		  
		  for (Ex01 k : person) {
			for (Ex01 j : person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank());
				}
			}
		}
		  
		  
		  
		  //출력
		  
		  for (Ex01 k : person) {
			System.out.print(k.getName() + "");
			System.out.print(k.getSum() + " ");
			System.out.print(k.getAvg() + " ") ;
			System.out.print(k.getHak() + " ");
			System.out.println(k.getRank());
			
		}
		  
		  
		  
		  
		  
	}
	
}
