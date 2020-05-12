package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 정보를 받아서 
		// 이름, 총점, 평균(소숫점 첫째자리까지), 학점 출력 
		Scanner sc = new Scanner(System.in);
		esc:while(true) {
			// 정보 입력 받기 
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			// 정보 가공
			int sum = kor + eng + math ;
			double avg = (int)(sum/3.0*10)/10.0;
			String hak = "" ;
			if(avg >= 90) {
				hak = "A" ;
			}else if(avg >= 80) {
				hak = "B" ;
			}else if(avg >= 70) {
				hak = "C";
			}else {
				hak = "F";
			}
			
			// 정보 출력
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + hak);
			
			while(true) {
				System.out.print("계속할까요(1.예/2.아니요) >> ");
				int answer = sc.nextInt();
				if(answer == 1) {
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
