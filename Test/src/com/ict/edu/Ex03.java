package com.ict.edu;



public class Ex03 {
	//�ٹ��ð��� 8�ð������� �ð��� 8590�̰� 
	//8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�. 
	// ���� �ٹ��� �ð��� 10�̴�. 
	// �󸶸� �޾ƾ� �ϴ°�? ( IF~else�� ����Ͻÿ�)		
	public static void main(String[] args) {
		

		
		int time = 10;
		int dan = 8590;
		int pay = 0;
		
		if (time > 8) {
			pay = (time*dan)+(int)((time-8)*dan*1.5);
		}
		
		System.out.println("������ : "+ pay);
		
		
		
	}
	
}
