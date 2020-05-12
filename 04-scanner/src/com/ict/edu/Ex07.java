package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 입금액과 메뉴를 입력받고
		// 메뉴 : 1. 커피음료(3500), 2. 이온음료(2500), 3. 물(1500) 4. 과일쥬스(4000)
		// 선택한 음료, 입금액, 잔돈 출력 (부가세 10%포함)
		Scanner sc = new Scanner (System.in);
		esc:while(true) {
				//정보입력
			System.out.println("입금액 :");
			int input = sc.nextInt();
			
			System.out.print("메뉴를 선택하세요\n1.커피음료(3500)\n2.이온음료(2500)"
					+ "\n3.물(1500)\n4.과일쥬스(4000) >> ");
			int menu = sc.nextInt() ;
			
			// 정보 가공
			String drink = " ";
			int dan = 0;
			int su = 1;
			switch (menu) {
			case 1 : drink = "커피음료"; dan = 3500; break;
			case 2 : drink = "이온음료"; dan = 2500; break;
			case 3 : drink = "물"; dan = 1500; break;
			case 4 : drink = "과일쥬스"; dan = 4000; break;
			}
			
		 int total = dan*su;
		 int vat = (int)(total*0.1);
		 int output = input - (total + vat);
			
		 // 정보 출력
		 System.out.println("선택한 음료 : " + drink);
		 System.out.println("입금액 : " + input);
		 System.out.println("잔  돈 : " + output);
		 
		 while(true) {
			 System.out.println("계속할까요(1.예/2.아니요) >>");
			 int answer = sc.nextInt();
			 if (answer == 1) {
				 continue esc;
			 }else if(answer == 2) {
				 	break esc;
			 }else {
				 	System.out.println("제대로 입력하세요");
				 	continue;
			}
		 }
		}
		 System.out.println("수고하셨습니다.");
		 
		 
		 
		}
		
		
		
		
	}

