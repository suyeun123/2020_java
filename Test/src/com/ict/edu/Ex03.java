package com.ict.edu;



public class Ex03 {
	//근무시간이 8시간까지는 시간당 8590이고 
	//8시간을 초과한 시간 만큼은 1.5배 지급한다. 
	// 현재 근무한 시간이 10이다. 
	// 얼마를 받아야 하는가? ( IF~else을 사용하시오)		
	public static void main(String[] args) {
		

		
		int time = 10;
		int dan = 8590;
		int pay = 0;
		
		if (time > 8) {
			pay = (time*dan)+(int)((time-8)*dan*1.5);
		}
		
		System.out.println("받을돈 : "+ pay);
		
		
		
	}
	
}
