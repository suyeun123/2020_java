package com.ict.edu13_9;

// �Һ���
public class Customer implements Runnable{
	private Car car;
	

	public Customer (Car car) {
		// �����ڿ��� ���� ���ڸ� ���������� ����
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
