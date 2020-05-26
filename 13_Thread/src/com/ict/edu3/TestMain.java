package com.ict.edu3;

public class TestMain {
			public static void main(String[] args) {
				
				Ex01 testA = Ex01();
				Ex02 testB = Ex02();
				
				
				// testA. testB�� Runnable�� ������ �����Ͽ����Ƿ�,
				// start()�� ����.
				// start() => run() ���� ���� ������ ������ ó���� �ƴϴ�.
				
				// start()�� Thread Ŭ������ ������ �����Ƿ�
				// Thread Ŭ������ Ȱ���ؾߵȴ�.
				
				// ���1 : Runnable�� ��ӹ��� ��ü�� Thread�����ڿ� �־��ش�.
				Thread thread = new Thread(testA);
				thread.start();
				
				new Thread(testB).start();
				// ���2 : �ȵ���̵忡�� ����ϴ� ���(�͸���Ŭ����) 
				new Thread(new Runnable() {
					
					@Override
					public void run() {
							while(true) {
								System.out.println(Thread.currentThread().getName()+": ��������");
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
