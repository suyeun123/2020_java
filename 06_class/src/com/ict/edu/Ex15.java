package com.ict.edu;

public class Ex15 {

	// static 초기화
	// static{
	//		내용;
	//		}
	
	int s1 = 100;
	static int s2 = 200;
	static int k2 = 2;
	
	// static 초기화
	static {
		s2 = 10000;
		s3 = 20000;
		s4 = 30000;
	}
	
	
	
	
	static int s3 = 2;
	static int k3 = 2;
	static int k4  ;
 	static int s4 ; // 선언을 나중에 해도 오류가 안난다.
	
	public static void main(String[] args) {
//		System.out.println(s1);  // 메소드안에서는 static아니면 못쓴다.
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("======================");
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
	}
	
	
	
}
