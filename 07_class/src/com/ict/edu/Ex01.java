package com.ict.edu;

public class Ex01 {

	// String 클래스 주요 메소드
	public static void main(String[] args) {
	
		// String 객체 생성
		String str1 = "abc";
		
		char data[] = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = {97,98,99};
		String str3 = new String(data2);
		
		String data3 = "ABC";
		String str4 = new String(data3);
		
		String str5 = new String("ABC");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("=====================================");
		
		// 같다
		// char, int, double 등 숫자를 저장하는 자료형은
		// '같다'라는 표현을 '==' 사용한다.
		// 그러나 문자열(String)은 '==='을 사용하면 안됨
		
		if(str1==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("====================");
		if(str4==str5) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
			
		System.out.println("====================");
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		System.out.println("====================");
		if(str3.equals(str4)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		System.out.println("====================");
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
	}
}
