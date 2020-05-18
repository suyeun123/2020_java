package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
		public static void main(String[] args) {
			// ��¥ ���� Ŭ���� : ���� ����ϰ� �ִ� ��ǻ�ͱ���
			// 1. Date Ŭ���� : Date Ŭ����(deprecate => �������� ������ ���� �� �ִ�.)
			// 2. Calendar Ŭ���� = > DateŬ���� ��� ��� ���� Ŭ���� 
			
			// 1. DateŬ����
			Date date = new Date();
			System.out.println(date);
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
			System.out.println(sdf.format(date));
			
			
			System.out.println("===========================================================");
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yy. M. dd hh:mm:ss");
			System.out.println(sdf2.format(date));
			
			System.out.println("===========================================================");
			
			System.out.println(date.getYear()+ "��"); // 2020-1900 = 120
			
			System.out.println("===========================================================");
			 
			System.out.println(date.getYear()+1900+ "��"); // 2020-1900 = 120
			System.out.println(date.getMonth()+1+ "��");   // 0 - 11,
			
			System.out.println(date.getDate()+"��");         
			System.out.println(date.getHours()+"��");
			System.out.println(date.getMinutes()+"��");
			System.out.println(date.getSeconds()+"��");
			
			
			int k = date.getDay(); // 0-6, 0 => �Ͽ���, 6=>�����
			switch (k) {
			case 0: System.out.print("�Ͽ���");break;
			case 1: System.out.print("������");break;
			case 2: System.out.print("ȭ����");break;
			case 3: System.out.print("������");break;
			case 4: System.out.print("�����");break;
			case 5: System.out.print("�ݿ���");break;
			case 6: System.out.print("�����");break;

			}
			System.out.println();
			
			System.out.println("===========================================================");
			
			// Calendar Ŭ���� : new ���� ������� �ʰ� ��ü ������ �Ѵ�.
			// ��, ��, ��, ��, �� ȣ���� : get(��������.�ʵ� �Ǵ� Calender.�ʵ�)
			
			// new ���� ������� �ʰ� ��ü ������ �Ѵ�.
			Calendar now = Calendar.getInstance();
			
			System.out.println(now.get(Calendar.YEAR)+"��");
			System.out.println(now.get(Calendar.MONTH)+1+"��"); // 0 - 11
			System.out.println(now.get(Calendar.DATE)+"��");
			System.out.println(now.get(Calendar.DAY_OF_MONTH)+"��");
			System.out.println("===========================================================");
			
			
			System.out.println(now.get(Calendar.HOUR));			// 12�ð���
			System.out.println(now.get(Calendar.HOUR_OF_DAY));   // 24�ð���
			
			// AM = > 0 , PM => 1;
			System.out.println("===========================================================");
			
			int res = now.get(Calendar.AM_PM);
			if(res==0) {
				System.out.println("AM " + now.get(Calendar.HOUR)+"��");
			}else if(res ==1)
				System.out.println("PM " + now.get(Calendar.HOUR)+"��");
			
			System.out.println("===========================================================");
			
			System.out.println(now.get(Calendar.MINUTE)+ "��");
			System.out.println(now.get(Calendar.SECOND)+ "��");
			
			// ����(1 - �Ͽ���, 7 - �����)
			res = now.get(Calendar.DAY_OF_WEEK);
			
			switch (k) {
			case 1: System.out.print("�Ͽ���");break;
			case 2: System.out.print("������");break;
			case 3: System.out.print("ȭ����");break;
			case 4: System.out.print("������");break;
			case 5: System.out.print("�����");break;
			case 6: System.out.print("�ݿ���");break;
			case 7: System.out.print("�����");break;
			}
			
			
			
			
			
			
		}
}
