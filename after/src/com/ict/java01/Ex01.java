package com.ict.java01;

public class Ex01 {
			
				public static void main(String[] args) {
					
					
					// 1. �ڹٿ��� ����ϴ� �⺻�ڷ���
					
					// �ڷ���(Data Type) : �ڹٿ��� ����ϴ� ����Ÿ�� ���¸� ����
					
					// �ڷ���    : Ű����
					// boolean�� : boolean : true(��), false(����)
					// ������    : char    :  ���ڰ� ����ȴ�. (a => 97 , A = 65 )
					// ������    : byte, short, int, long : �Ϲ������� ���� int
					// �Ǽ���    : float, double            �Ϲ������� �Ǽ� double
					
					// ���ǻ��� : 
					//			- String �⺻�ڷ��� ó�� ��������� �⺻�ڷ����� �ƴϴ�.
					//          - String ó�� Ŭ������ �ڷ������� ����ϴ� ���� �����ڷ����̶�� �Ѵ�.
					
					
					// 2. ������ 10�� su��� ������ �ְ� ���� su�� �����Ͱ� ������ Ȯ���ϴ�
							int su = 10 ;
							System.out.println(su);
							
							// boolean b1�� ���� ��������
							boolean b1 = true;
							System.out.println(b1);
							
							//  �Ǽ��� 3.14�� d1�� ��������
							double d1 = 3.14;
							System.out.println(d1);
							
					// 3.  a++ �� ++a �� �������� ���ÿ�
					//      a++ : ���� ���������� ������� ���� �� �Ŀ� ���߿� �������� 1���� ��Ų��.
							int a = 10 ;
							System.out.println(a++);
							System.out.println(a);
							
					//      a++ : ���� ������ ���� 1���� ��Ű�� ���� ������ ������ �����Ѵ�.
							
							int b = 10;
							System.out.println(++b);
							System.out.println(b);
							
							
					// 4. �������� AND�� OR�� ���ؼ� ���ÿ�
							
					// AND ( ����, ������, &&) : �־��� ���ǵ��� ��� true�϶� ����� true
					//                         ���࿡ ���ǵ� �� �ϳ��� false�� ������ ����� false
					//						   false�� ������ false �ڿ� ������ ���� �ʴ´�.
							
					// OR (����, ������, ||) : �־��� ���ǵ��� ��� false�϶� ��� false
					//								 ���࿡ ���ǵ� �� �ϳ��� true�Ǹ� ����� true
					//							true�� ������ true�ڿ� ������ ���� �ʴ´�.
							
							boolean b2 = true;
							boolean b3 = true;
							boolean b4 = false;
							boolean b5 = false;
							
							boolean res = b2 && b3 ;
							System.out.println("res = " + res);
							
							res = b3 && b4;
							System.out.println("res = " + res);
							
							res = b4 && b5;
							System.out.println("res = " + res);
							
							System.out.println("======================================================");
							
							res = b2 || b3 ;
							System.out.println("res = " + res);
							
							res = b3 || b4;
							System.out.println("res = " + res);
							
							res = b4 || b5;
							System.out.println("res = " + res);
					
							
							System.out.println("======================================================");
							
							
							// 5. int su = 24 �϶� ���׿����ڸ� Ȱ���ؼ�
							// Ȧ������, ¦������ �Ǻ��� �� �ִ� �ڵ��� ���ÿ�
							// ���׿����� :  
							// �ڷ��� �����̸� = (���ǽ� = boolean) ?  ���϶� ���� : �����϶� ����
							
							// �ڷ��� �����̸�, ���϶� ���� �����, �����϶� ���� ����� ��� ���� �ڷ����̾�� �ȴ�.
							
							int num = 24;
							String msg = (num % 2 == 1 ) ?  "Ȧ��" : "¦��" ;
//							String msg = (num % 2 == 0 ) ?  "¦��" : "Ȧ��" ;
									
							System.out.println(msg);
							
							
					
				}
	
}
