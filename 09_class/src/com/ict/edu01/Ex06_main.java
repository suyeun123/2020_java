package com.ict.edu01;

public class Ex06_main {
		public static void main(String[] args) {
			
			/* Inner01 in01 = new Inner01(); */
			// 내부클래스 별도로 객체 생성안됨
			
			Ex06 e6 = new Ex06();
			System.out.println(e6.name);
			e6.sound();
			System.out.println("==============================================================");
			// 1. 내부클래스가 존재하는 메소드를 실행
			
			e6.play();
			System.out.println("===================외부메소드끝=====================");
			// 내부클래스가 존재하는 메소드 실행이 끝나면 내부클래스 사용할수 없어
			
			
			/* Ex06.class Inner01 in01 = e6.new Inner01(); */
			// Member 내부클래스 만드는 방식으로 객체 생성 못함
			
			
			
			
		}
}
