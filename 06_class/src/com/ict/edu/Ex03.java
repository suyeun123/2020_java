package com.ict.edu;

public class Ex03 {
    // ����޼ҵ� : ���, ���
	// ��ȯ�� : �޼ҵ带 ȣ���ϸ� �ش� �޼ҵ尡 �����ϰ� ȣ���� ������ �ǵ��ư� 
	//			���� �� �ǵ��� ���� ����� ������ �� ��� 
	//			����� ���� �ڷ����� ���Ѵ�.
	// 			���࿡ ����� ������ ���� ������ void ����� ���
	
	int sound = 10 ;
	double sound2 = 10.0;
	public void add() {
		System.out.println("add_1");
		sound++ ;
		System.out.println("add_2");
	}
	
	public void sub() { 
		sound--;
		return;
	}

		public int mul() {
			System.out.println("mul_1");
			return sound;
		}
		
//		�ڷ����� �ٸ��� ����
//		pullic int div() {
//			return sound2: 
//		}
		
		// �ڷ����� �ٸ����� ��ȯ���� ũ�� �����ƴ�
		public double plus() {
			return sound2; 
		}
		
		
		
}
