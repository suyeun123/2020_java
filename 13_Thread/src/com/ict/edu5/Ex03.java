package com.ict.edu5;


// �Ӱ迵�� : ��Ƽ������忡�� �������� ��� �Ǵ� ����
//				���� �������� �����尡 ���İ��� �ٸ� �����忡��
//				������� ���ѱ�� ������ �߻��ϴ�.
// 				�ذ�å�� ����ȭ ó����.

// ����ȭ ó�� : �Ӱ迵���� sychronized ���� ����ϹǷ�
//				����ȭ ó���� �����Ѵ�.
//				����������� �����尡 ���������� �ٸ� �������
//				������ �� �� ���� ����(���� �ɸ� ����)�� �ȴ�.

// ����ȭ ó�� �Ҷ� ���� �������� �����带 ������ �����·� ���� ��Ű��
// �޼ҵ尡 �����ϴµ� wait()�̴�.
// �ѹ� wait()�� �����带 Ǯ������ ������ �״�� �����·� ������.
// wait()�� �����带 Ǯ���ִ� ������ notify(), notifyAll()�̴�.



public class Ex03 implements Runnable{
			
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 1; i <51; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(x++));
			if(x==11) {
			try {
				wait();
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}else {
			notify();
		}
		}
	
	}
	
}
