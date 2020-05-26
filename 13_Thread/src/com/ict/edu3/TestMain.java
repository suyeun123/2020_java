package com.ict.edu3;

public class TestMain {
			public static void main(String[] args) {
				
				Ex01 testA = Ex01();
				Ex02 testB = Ex02();
				
				
				// testA. testB는 Runnable를 가지고 구현하였으므로,
				// start()가 없다.
				// start() => run() 으로 가지 않으면 스레드 처리가 아니다.
				
				// start()는 Thread 클래스가 가지고 있으므로
				// Thread 클래스를 활용해야된다.
				
				// 방법1 : Runnable를 상속받은 객체를 Thread생성자에 넣어준다.
				Thread thread = new Thread(testA);
				thread.start();
				
				new Thread(testB).start();
				// 방법2 : 안드로이드에서 사용하는 방법(익명내부클래스) 
				new Thread(new Runnable() {
					
					@Override
					public void run() {
							while(true) {
								System.out.println(Thread.currentThread().getName()+": 가가가가");
							}
					}
				}).start();
				
			}

			private static Ex01 Ex01() {
				// TODO Auto-generated method stub
				return null;
			}

			private static Ex02 Ex02() {
				// TODO Auto-generated method stub
				return null;
			}
}
