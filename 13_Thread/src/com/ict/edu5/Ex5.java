package com.ict.edu5;


// 5. �ΰ��� �����带 �����Ͽ� ù��° �������� ����� 1-50���� ����ϰ�,
//    �ι�° �������� ����� 51-100���� ����ϰ�
//    �ٽ� ù��° �����尡 101-150���� ���,
//	  �ι�° �����尡 151-200 ����϶� (synchronized���)

public class Ex5 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
	
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+":"+ ++x);
				if(x==50 || x == 100) {
					try {
						wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
					}else {
						notify();
					
				}
			}
	}
		public static void main(String[] args) {
				
				Ex5 t = new Ex5();
				new Thread(t, "tiger").start();
				new Thread(t, "tiger").start();
				
				
		}
}
