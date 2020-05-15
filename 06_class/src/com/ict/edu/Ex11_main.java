package com.ict.edu;

public class Ex11_main {
		public static void main(String[] args) {
			// ∞¥√º ª˝º∫
			Ex11 t1 = new Ex11("µ—∏Æ");
			
			System.out.println(t1.getName());
			System.out.println(t1.getAge());
			System.out.println(t1.getAddr());
			
			System.out.println("============================");
			// t1 ¿« µ•¿Ã≈Õ∏¶ ∫Ø∞Ê«œ¿⁄
			// ∆Îæ•, 9, ∫œ±ÿ¿∏∑Œ ∫Ø∞Ê«œ¿⁄
			
			t1.setName("∆Îæ•");
			t1.setAge(9);
			t1.setAddr("∫œ±ÿ");
			System.out.println(t1.getName());
			System.out.println(t1.getAge());
			System.out.println(t1.getAddr());
			
			System.out.println("============================");
			
		
			Ex11 t2 = new Ex11();
			
			System.out.println(t2.getName());
			System.out.println(t2.getAge());
			System.out.println(t2.getAddr());
			
			System.out.println("============================");
			
			Ex11 t3 = new Ex11("¿Â±ÊªÍ",47,"∫œ«—");
			System.out.println(t3.getName());
			System.out.println(t3.getAge());
			System.out.println(t3.getAddr());
			
		}
}
