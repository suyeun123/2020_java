package com.ict.edu;

public class Ex02 {
 public static void main(String[] args) {
	// if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
	// 형식 : if(조건식){
	// 조건식이 참일때 실행 문장 ; {
	// 조건식이 참일때 실행 문장 ;
    // } else {
	// 조건식이 거짓일때 실행 문장 ;
	// 조건식이 거짓일때 실행 문장 ;
	// }
	 
	// int k2 이 60 이상이면 합격, 60미만은 불합격
	 int k1 = 60;
	 String str = "" ;
	
	if (k1 >= 60) {
		str = "합격" ;
		}
	else {
		str = "불합격" ;
	}
	 
	System.out.println("결과 :" + str);
	
	// 홀수 짝수 판별
	int k3 = 6 ;
	
	if (k3 % 2 == 0 ) {
		str = "짝수" ;
		}
	else {
		str = "홀수";
	}
		
	System.out.println("결과" + str);
	 
	// 대문자, 소문자 판별
	char k5 = '1';
	
	if (k5 >= 'a' && k5 <= 'z') {
		str = "소문자" ;
		}
	
	else {
		str = "대문자" ;
	}
		
	
	
	System.out.println("결과 : " + str);
	
	 
	// 1 또는 3이면 남자, 아니면 여자 

	int k6 = 1 ;
	
	if (k6 == 1 || k6 == 3) {
		str = "남자" ;
	}
	else {
		str = "여자" ;
		}
	
	System.out.println("결과 : " + str);
	
	
	
	
	// 근무시간이 8시간까지는 시간당 8590이고 
	// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
	// 현재 근무한 시간이 10이다. 
	// 얼마를 받아야 하는가?
	 
	int time = 10 ;
	int dan = 8590 ;
	int pay = 0;
	
	if (time > 8) {
		pay = (8*dan)+(int)((time-8)*dan*1.5);
	} else {
		pay = time * dan ;
	}
	
	System.out.println("결과 :" + pay);
	
	
	// 두 수 중 큰 값을 출력하시오.
	int k7 = 42 ;
	int k8 = 52 ;
	int result = 0 ;
	
	if (k7>k8) {
		result = k7;
		}
		else {
			result = k8;
		}
		System.out.println("결과"+ result);
	}
 }
