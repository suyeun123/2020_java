package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
	 // switch ~ case : if문과 같이 조건문
	 // if문은 조건식이 boolean형이다. 즉, 비교연산, 논리연산, boolean형을 사용
	 // switch문은 인자값이 byte, short, int, char, String 일때 사용.
	 // swithc(인자값) {
	 // case 조건값1 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
	 // case 조건값2 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
	 // case 조건값3 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
	 // default : 조건값 1,2,3 모두 같지 않을 때 수행할 문장;
	 // }
	 // break 가 없으면 break를 만날때까지 모든 실행문을 실행
	 // break 역할은 현 실행하고 있는 범위를 벗어나는 역할	
		
	// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다 나마저 한국
		
		char k1 = 'B';
		String res ="";
		switch (k1) {
		case 'A': System.out.println("아프리카"); break ;
		case 'B': System.out.println("브라질"); break ;
		case 'C': System.out.println("캐나다"); break ;
			default: System.out.println("한국"); break ;
			}
		
		char k2 = 'B';
		switch (k1) {
		case 'A': res = "아프리카" ; break ;
		case 'B': res = "브라질" ; break ;
		case 'C': res = "캐나다" ; break ;
		default: res = "한국" ; break ;
		}
		System.out.println("결과 : " + res);
		
		
	// char k3이 A, a이면 아프리카, B, b이면 브라질, C, c이면 캐나다 나마저 한국
		
		char k3 = 'c';
		switch (k3) {
		case 'A': 
		case 'a': res = "아프리카" ; break ;
		case 'B':
		case 'b': res = "브라질" ; break ;
		case 'C': 
		case 'c': res = "캐나다" ; break ;
		default: ; res = "한국" ; break ;
		}
		System.out.println("결과 : " + res);
		
		
	// int k4가 1 또는 3이면 남자, 2또는 4이면 여자
		
		int k4 = 1 ;
		
		switch (k4) {
		case 1 :
		case 3 : res = "남자"; break;
		case 2 : 
		case 4 : res = "여자"; break;
		}
		System.out.println("결과 : " + res);
				
		
	// String k5 한국이면 서울, 중국=북경, 일본=동경, 미국=워싱턴
	
		String k5 = "한국";
		switch (k5) {
		case "한국": res = "서울"; break ;
		case "중국": res = "북경"; break ;
		case "일본": res = "동경"; break ;
		case "미국": res = "워싱턴"; break ;
			}
		System.out.println("결과 : " + res);
	
		
		// switch문은 범위가 넓어지면 사용하지말자.
		// int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		
		int k6 = 94 ;
		switch ((int)(k6/10)){
		case 10:
		case 9: res = "A" ; break;
		case 8: res = "B" ; break;
		case 7: res = "C" ; break;
		case 6: res = "F" ; break;
		}
		System.out.println("결과 : " + res);			
		
		
}
}
