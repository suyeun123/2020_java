package com.ict.edu2;

public class main {
		public static void main(String[] args) {
			
			Dcaphone dca = new Dcaphone();
			dca.call();    // �θ�
			dca.sms();	   // �θ�
			dca.dca();	   // �ڽ�
			
			System.out.println("========================");
			
			Mp3phone mp3 = new Mp3phone();
			mp3.call();    // �θ�
			mp3.sms();	   // �θ�
			mp3.sound();   // �ڽ�
			
			System.out.println("==================");
			
			
			// �ڽ�Ŭ���� = �ڽ�Ŭ���� ������ ()
			GamePhone gp = new GamePhone();
			gp.call();    // �θ�
			gp.sms();	 // �θ�
			gp.play();	// �ڽ�
			System.out.println("==================");

			// �θ�Ŭ���� = new �ڽ�Ŭ���� ������()
			phone p1 = new Dcaphone();
			p1.call();    // �θ�
			p1.sms();	 // �θ�
			/* p1.play(); */	// �ڽ� , �����߻�
			
			
			
			
			
		}
}
