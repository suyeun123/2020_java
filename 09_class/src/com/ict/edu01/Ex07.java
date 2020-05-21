package com.ict.edu01;


// �߻�Ŭ���� : �߻� �޼ҵ带 ������ �ִ� Ŭ����

abstract class Abs {
	int data = 10000;
	public abstract void printData();

	
}
//�������̽�
//interface class Abs {
//	int data = 10000;
//	public abstract void printData();
//
//	
//}

// -> �������̽��϶�
//class AbsTest implements Abs{
//	@Override
//	public void printData() {
//		System.out.println("data1 : " + data);
//	}
//}





class AbsTest extends Abs{
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}


class AbsTest2{
	static // �߻�Ŭ������ ��ӹ��� �ʰ� �ٷ� ��ü ����
	Abs abs = new Abs() {
		
	@Override
	public void printData() {
		System.out.println("data2 : " + data);
	}		
	};
}

class AbsTest3{
	
	public void play() {
		new Abs() {
			@Override
			public void printData() {
				System.out.println("data3 : " + data);
	}		
	}.printData();
}
}

public class Ex07 {

	
	public static void main(String[] args) {
		AbsTest absTest = new AbsTest();
		absTest.printData();
		System.out.println("=================");
		
		AbsTest2 absTest2 = new AbsTest2();
		absTest2.abs.printData();
		System.out.println("=================");
		
		AbsTest3 absTest3 = new AbsTest3();
		absTest3.play();
	}
	
}

