package com.ict.edu4;

import java.lang.annotation.Target;


// ���� ������ : �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������
// 				 �Ϲ� �����尡 �����ϸ� ���� ������� ���������� ���� ��.
public class Ex01 implements Runnable{
		boolean autoSave = false ;
		
		@Override
		public void run() {
			while(true) {
				try {
					// 3�ʸ��� ��� ����
					Thread.sleep(1000*3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(1);
							}
		}
		public void autoSave() {
			System.out.println("�۾������� �ڵ� �����մϴ�.");
		}
			public static void main(String[] args) {
				Ex01 e1 = new Ex01();
				Thread thread = new Thread(e1);
//				thread.setDaemon(true);           //���ѷ����� ��������
				thread.start();
				
				for (int i = 1; i < 15; i++) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
					System.out.println(i);
				}
				
					System.out.println("���α׷� ����");
			}
	
}
