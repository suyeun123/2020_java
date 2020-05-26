package com.ict.edu13_9;

import java.util.ArrayList;
import java.util.List;

// �ڵ��� ���� ����
public class Car {
	private List<String> carList = null;
	public Car() {
			carList = new ArrayList<String>();
	}
	
	// �������� �ڵ��� �����ϱ�
	public String getCar() {
		
		String carName = null;
		
		switch ((int)(Math.random()*3)){
			case 0 : carName = "SM5" ; break;
			case 1 : carName = "�ű׳ʽ�" ; break;
			case 2 : carName = "ī����" ; break;
		}
		return carName;
	}
	// �ڵ��� �Ǹ�
	public synchronized String pop() {
		String carName=null;
		
		// �ڵ��� â�� ��� ������ �Ǹ����� ����
		if(carList.size() == 0) {
			try {
				System.out.println("���� ����� �����Ҷ� ����"+ "��ٸ�����");
				this.wait();  //����
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ��� �������� ���� ���߿� �� ���� ����(�Ǹ�)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�.."+ "�մ��� ������ ���̸���=>\"" + carName + "\"");
		return carName;
	}
	
	
	// �ڵ��� â�� �� �ֱ�
	public synchronized void push(String car) {
		// ���� �ڵ����� ���� (carList) �ֱ�
		carList.add(car);
		System.out.println("���� ����� �����ϴ�." + "�� �̸��� \"" + car + "\"");
		
		// ��� ���� ��  wait()�� ������ �ٽ� �����Ű��
		if(carList.size() == 5) {
			this.notify();  //  �����
		}
	}
	
}
