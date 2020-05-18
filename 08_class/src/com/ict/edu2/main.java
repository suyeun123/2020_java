package com.ict.edu2;

public class main {
		public static void main(String[] args) {
			
			Dcaphone dca = new Dcaphone();
			dca.call();    // 부모
			dca.sms();	   // 부모
			dca.dca();	   // 자식
			
			System.out.println("========================");
			
			Mp3phone mp3 = new Mp3phone();
			mp3.call();    // 부모
			mp3.sms();	   // 부모
			mp3.sound();   // 자식
			
			System.out.println("==================");
			
			
			// 자식클래스 = 자식클래스 생성자 ()
			GamePhone gp = new GamePhone();
			gp.call();    // 부모
			gp.sms();	 // 부모
			gp.play();	// 자식
			System.out.println("==================");

			// 부모클래스 = new 자식클래스 생성자()
			phone p1 = new Dcaphone();
			p1.call();    // 부모
			p1.sms();	 // 부모
			/* p1.play(); */	// 자식 , 오류발생
			
			
			
			
			
		}
}
