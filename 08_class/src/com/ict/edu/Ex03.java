package com.ict.edu;

import java.util.Random;

// Random Ŭ������ ��ӹ޾Ƽ� ��� 
// ������ �̹������ ����� �����ʴ´�. ��ȿ������
public class Ex03 extends Random{
	public static void main(String[] args) {
		// main �޼ҵ嵵 static�̱� ������ static ���������� �� �����.
//		static int num = nextInt(10)+1; ; 1-10
		
		
		/* static �޼ҵ尡 �ƴ϶� ���Ұ� */
		/* int num = nextInt(10)+1; ; 1-10 */
		/* System.out.println(); */
		
		/* play()�� ����ϱ� ���ؼ��� ����Ŭ������ ��ü�� ������ �ȴ�. */
		
		Ex03 e3 = new Ex03();
		e3.play();
	}
	
	public void play() {
		int num = nextInt(10)+1; ;
		System.out.println(num);
	}
	
}
