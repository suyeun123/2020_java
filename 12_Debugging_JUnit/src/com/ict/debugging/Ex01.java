package com.ict.debugging;

public class Ex01 {
			// �����(����: debugging) �Ǵ� �����(����: debug)�� ��ǻ�� ���α׷� ���� �ܰ� �߿�
			// �߻��ϴ� �ý����� ������ ������ �������� ����(����)�� ã�Ƴ���
			// �� ������ ������ �����ϴ� �۾� ������ ���Ѵ�. 
			// breakpoint(�ߴ���) : ����� ����� �ڵ����� ������ �ߴܵǾ� �ش�
			// 						������ ���� ���� �� �� �ִ� Ư�� ������ ���Ѵ�.
	
			// F8 : �ߴ������� �ߴ������� �̵�
			// F5 : �ѹ��徿 ����, �޼ҵ带 ������ ������ ����
			// F6 : �ѹ��徿 ����, �޼ҵ带 ������ �ǳʶڴ�.
			
		public static void main(String[] args) {
			int total = 0;
			
			for (int i = 0; i < 11; i++) {
				total = total + i;
				System.out.println("i = " + i + ",total = " + total);
				
			}
			System.out.println("�� : " + total);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
