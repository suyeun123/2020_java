package com.ict.edu;

public class Ex07_main {
		public static void main(String[] args) {
			
			Ex07 t1 = new Ex07();
			
//			System.out.println(t1.name);
//			System.out.println(t1.price);
			
			String name = t1.getName();
			int price = t1.getPrice();
			System.out.println(name);
			System.out.println(price);
			
			// Ŀ�ǿ����� ���� ������ �����ؼ� ���
			t1.setName("�������");
			
			
			name = t1.getName();
			System.out.println(name);
			
			System.out.println("==================================");
			
			
			Ex07 t2 = new Ex07();
			name = t2.getName();
			System.out.println(name);
			
		}
}
