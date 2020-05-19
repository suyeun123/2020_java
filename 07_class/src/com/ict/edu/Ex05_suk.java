package com.ict.edu;

import java.util.Random;

public class Ex05_suk {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		
		System.out.println("1~6±îÁö ·£´ı : " + (int)(ran.nextDouble()*7));
		
		for (int i = 7; i < 14; i++) {
			System.out.print("7~13±îÁö ·£´ı :" + i );
		}
		
	}
}
