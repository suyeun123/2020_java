package com.ict.edu8;

public class Ex02 {
		public static void main(String[] args) {
			// 객체생성없이 호출 가능 -> static 이라는 증거
			System.out.println(EX01.su1);
			System.out.println(EX01.su2);
			System.out.println(EX01.SU3);
			System.out.println(EX01.SU4);
			
			
			
			// 값 변경이 안된다. (final)
//			System.out.println(EX01.su1++);
//			System.out.println(EX01.su2++);
//			System.out.println(EX01.SU3++);
//			System.out.println(EX01.SU4++);

		}
}
