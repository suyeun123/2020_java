package com.ict.test;

import com.ict.edu.Ex05;

public class Ex05_main {
	public static void main(String[] args) {
		// 패키지가 달라도 public은 사용가능 (import를해서)
		System.out.println(Ex05.k1);
		// protected와 생략은 패키지가 다르면 사용 불가
//		System.out.println(Ex05.k2);
//		System.out.println(Ex05.k3);
	
		
// 		static이더라도 private는 접근못함
//		System.out.println(Ex05.k4); 
		
		// 패키지가 달라도 public은 사용가능 (import를해서)
		Ex05 e5 = new Ex05();
		// protected와 생략은 패키지가 다르면 사용 불가
//		System.out.println(e5.s1);
//		System.out.println(e5.s2);
//		System.out.println(e5.s3);
		
		// 객체를 생성해도 private는 접근못함
		// System.out.println(e5.s4);
		
		
		
		
	}
}
