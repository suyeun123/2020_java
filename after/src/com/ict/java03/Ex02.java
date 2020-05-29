package com.ict.java03;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// Calendar 는 new 객체 생성을 하지 않는다. 
		Calendar now = Calendar.getInstance();
		
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); // 0-11
		System.out.println(now.get(Calendar.DATE));
		
		System.out.println("=====================================");
		
		System.out.println(now.get(Calendar.HOUR));
		
		int res = now.get(Calendar.HOUR);
		
		if(res == 0) {
			System.out.println("오전 :" + now.get(Calendar.HOUR));
		}else if (res == 1)
			System.out.println("오후 :" + now.get(Calendar.HOUR));
		
		
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));

		
		System.out.println("=====================================");
		
		
		// 요일 : 일요일 (1) - 토요일이(7)
		int result = now.get(Calendar.DAY_OF_WEEK);
		switch (result) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;

		default:
			break;
		}
		
		
		
		
		
	}
	
	
	
	
	
}
