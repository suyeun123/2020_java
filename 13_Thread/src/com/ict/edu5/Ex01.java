package com.ict.edu5;

// �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
//			  ���� �������� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ��
//			  ������ �߻��Ѵ�.
// 			  �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�.

// ����ȭ ó�� : �Ӱ迵���� synchronized ���� ����ϸ� �ȴ�.
//				 ���� �������� �����尡 ���������� �ٸ� ������� ������ �� ����.
//

public class Ex01 implements Runnable{
			
	int x ;
	
	@Override
			public synchronized void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName()+": " + (x++));
				}
			}
			
	
}
