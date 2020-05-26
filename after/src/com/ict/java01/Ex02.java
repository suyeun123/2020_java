package com.ict.java01;

public class Ex02 {
		public static void main(String[] args) {
			
			
			// 근무시간~
			
			int dan = 8590;
			int work = 10;
			int money = 0;
			
			if (work > 8) {
				money = (int)((8*dan) + (work-8) * dan*1.5);
			} else {
			money = dan*work;
			}
			
			System.out.println();
			
		}
}
