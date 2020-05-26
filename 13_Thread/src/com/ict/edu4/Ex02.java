package com.ict.edu4;

public class Ex02 {
			public static void main(String[] args) {
				
				System.out.println("���� : " + Thread.currentThread().getName());
				
				Ex03 e3 = new Ex03();
				Thread thread = new Thread(e3);
				thread.start();
				
				// join() : ���� ������� join()�� ȣ���� �����尡 ����������
				//			�����·� ���� �ִٰ� join()�� ȣ���� �����尡 ������
				//     		�ٽ� �����Ѵ�.
				// 			��, join()�� ȣ���� �����尡 ������ ������ �� �ִ�.
				try {
					thread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���� : " + Thread.currentThread().getName());
				
			}
}
