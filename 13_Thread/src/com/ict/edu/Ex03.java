package com.ict.edu;


// Thread Ŭ������ start(), run() �� �����Ѵ�.
public class Ex03 extends Thread{

	
			public void go() {
				System.out.println(currentThread().getName() + "go()�޼ҵ�");
			}
	
			public void run() {
				System.out.println(currentThread().getName() + "run()�޼ҵ�");
				System.out.println(currentThread().getName() + "run()�޼ҵ�");
				System.out.println(currentThread().getName() + "run()�޼ҵ�");
				System.out.println(currentThread().getName() + "run()�޼ҵ�");
			}
			
//			public void start() {
//				System.out.println(currentThread().getName() + " start()�޼ҵ�");
//				System.out.println(currentThread().getName() + " start()�޼ҵ�");
//				System.out.println(currentThread().getName() + " start()�޼ҵ�");
//				System.out.println(currentThread().getName() + " start()�޼ҵ�");
//			}
}
