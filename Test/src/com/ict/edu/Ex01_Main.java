package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex01_Main {

	  public static void main(String[] args) {
		
		  
		  Scanner sc = new Scanner(System.in);
		  
		  HashSet<Ex01> person = new HashSet<Ex01>();
		  
		  while(true) {
			  
			  Ex01 p = new Ex01();
			  
			  System.out.print("�̸�:");
			  String name = sc.next();
			  
			  System.out.print("����");
			  int kor = sc.nextInt();
			  
			  System.out.print("����");
			  int eng = sc.nextInt();
			  
			  System.out.print("����");
			  int math = sc.nextInt();
			  
			  p.getSum();
			  p.s_sum(kor, eng, math);
			  
			  person.add(p);
			  
			  System.out.print("����ұ��? (y/n) >>");
			  String str = sc.next();
			  
			  if(str.equalsIgnoreCase("n"))break;
			  
		  }
		  //����
		  
		  for (Ex01 k : person) {
			for (Ex01 j : person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank());
				}
			}
		}
		  
		  
		  
		  //���
		  
		  for (Ex01 k : person) {
			System.out.print(k.getName() + "");
			System.out.print(k.getSum() + " ");
			System.out.print(k.getAvg() + " ") ;
			System.out.print(k.getHak() + " ");
			System.out.println(k.getRank());
			
		}
		  
		  
		  
		  
		  
	}
	
}
