package com.ict.edu3;


//Runnable �������̽��� �߻�޼ҵ� run()�� ������ �ִ�.
public class Ex02 implements Runnable{
				
			@Override
			public void run() {
					for (int i = 0; i < 100; i++) {
						System.out.println(Thread.currentThread().getName()+": aaaaaa");	
					}
					play();
						
			}

			
			public void play() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+": ########");		
			
				}			
}
}