package com.ict.edu5;

public abstract class Animal {

			// �߻� Ŭ���� : �߻�޼ҵ带 ������ �ִ� Ŭ������ �߻� Ŭ������� �Ѵ�.
			//				 �Ϲ����� ����ʵ�� ����޼ҵ嵵 ������ ���� �� �ִ�.
	
			// �߻� �޼ҵ� : body�� ���� �޼ҵ�{(���೻��)�� ���� �޼ҵ�}��
            //               �߻� �޼ҵ��� �Ѵ�.
			//				 �ݵ�� abstract ���� ����Ѵ�.
			// 
	
			int su1 = 10 ;                     // �ν��Ͻ� ����
			static int su2 = 20;	           // static ����
			final int SU3 = 30;		          // �ν��Ͻ� ���
			static final int SU4 = 40 ;       // static���
			
			// �ν��Ͻ� �޼ҵ�
			public void play() {
				su1++;
				su2++;
				/*SU3++;*/  // ����� �������� �ȵ�
				/* SU4 */   // ����� �������� �ȵ�
			}
		
					// static �޼ҵ�	
					public static void prn() {
					int k1 = 100;
					// �������� static ����� �� ����.
					// static int k2 = 200; 
					
					// static �޼ҵ�� ������������ static�� ��밡��
					/* System.out.println(su1); */
					System.out.println(su2);
					/* System.out.println(SU3); */
					System.out.println(SU4);
					
				}
	
					// �߻� �޼ҵ�, �߻�޼ҵ� �ݵ�� abstract�� �ٿ��� �Ѵ�.
					// �ݵ�� Ŭ�������� abstract�� �ٿ��� �Ѵ�.
					public abstract void like () ;
					
				
					
					
					
					
}
