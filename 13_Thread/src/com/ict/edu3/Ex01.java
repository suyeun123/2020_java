package com.ict.edu3;


// Runnable �������̽��� �߻�޼ҵ� run()�� ������ �ִ�.
public class Ex01 implements Runnable{
			
			@Override
			public void run() {
					while(true) {
						
						System.out.println(Thread.currentThread().getName()+": 111111");
						
					}
			}
				
}
