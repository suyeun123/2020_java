package com.ict.edu01;


// ������(enum) : ����� �ϳ��� ��ü�� �ν��ϰ�, �������� ��� ��ü���� �� ���� ��� ��
//                �ϳ��� ����(��ü)
public class Ex01 {
	
		static final int JAVA = 200;   // ��� (�������� ���� ��ü��޵�)
		static final int HTML = 1000;
		
		public enum Lesson {
			//static final ����
			JAVA, JSP, SPRING, ANDROID, HTML
		}
		
		
		public static void main(String[] args) {
			// enum���� �ϳ� ����
			Lesson s1 = Lesson.JAVA;
			System.out.println("s1 : " + s1);           // ��ü
			System.out.println("JAVA : " + Ex01.JAVA);	// ������
			System.out.println("=============================");
			System.out.println("JAVA : " + Ex01.HTML);  // ������
			System.out.println("JAVA : " + Lesson.HTML);  // ��ü�� �ν� 
			System.out.println("=============================");
			// �ѹ��� ����
			Lesson[] items = Lesson.values();
			
			
			// ordinal : index()
			for (Lesson k : items) {
				System.out.println(k + ":"+ k.ordinal());
			}
			
		}
		
}
