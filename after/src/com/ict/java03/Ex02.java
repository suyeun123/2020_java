package com.ict.java03;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// Calendar �� new ��ü ������ ���� �ʴ´�. 
		Calendar now = Calendar.getInstance();
		
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); // 0-11
		System.out.println(now.get(Calendar.DATE));
		
		System.out.println("=====================================");
		
		System.out.println(now.get(Calendar.HOUR));
		
		int res = now.get(Calendar.HOUR);
		
		if(res == 0) {
			System.out.println("���� :" + now.get(Calendar.HOUR));
		}else if (res == 1)
			System.out.println("���� :" + now.get(Calendar.HOUR));
		
		
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));

		
		System.out.println("=====================================");
		
		
		// ���� : �Ͽ��� (1) - �������(7)
		int result = now.get(Calendar.DAY_OF_WEEK);
		switch (result) {
		case 1: System.out.println("�Ͽ���"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("ȭ����"); break;
		case 4: System.out.println("������"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�ݿ���"); break;
		case 7: System.out.println("�����"); break;

		default:
			break;
		}
		
		
		
		
		
	}
	
	
	
	
	
}
