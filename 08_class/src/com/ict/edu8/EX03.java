package com.ict.edu8;


// �������̽� ���
// 1. �Ϲ�Ŭ������ ��ӹ����� �ݵ�� �������̵� �ؾ� �ȴ�.
class EX03 implements EX01{
			
	@Override
	public void play () {}
	@Override
	public void sound () {}
}	
	// 2. �߻�Ŭ������ ��� ������ �������̵� �� �ʿ䰭����.
	abstract class Ex04 implements EX01{
		
	int k1 = 10; 	// �ν��Ͻ� ����
	
	public abstract void leftsound();
	}
	
	
	abstract class Ex05 implements EX01{
		int k1 = 10; // �ν��Ͻ� ����
	}
	
	
	
	// 3.�������̽��� ����� ������ �������̵� �� �ʿ䰡 ����.
	
	interface Ex06 extends EX01{
		int k1 = 10 ; // static final
		
	}
	
	// 2.3 ���� ���߿��� �Ϲ� Ŭ������ ��ӹ����� ��� �������̵� �ؾߵȴ�.
	class Ex07 extends Ex05{

		public void play() {}

		public void sound() {}
		
	}
	
	class Ex08 extends Ex04{

		@Override
		public void play() {}
		@Override
		public void sound() {}
		
		@Override
		public void leftsound() {}
		
	}
