package com.ict.edu;

public class Ex04 {
		int k1 = 10 ;
		String str = "";
		
		
		// ����(�Ű�����) : �ܺο��� ������ �޾Ƽ� ���
		// �޼ҵ� �̸��� ������ �ڷ����� �ٸ��� ���� �� ����
		// => �����ε�
		public void add() {
			k1++;
			}
		
		public void add(int s) {
			k1 = k1 + s ;
				}
		public void add(int s1,  int s2) {  // �̸��� �Ȱ����� ���ڰ� �ٸ��� �������Ȼ���
			k1 = s1 + s2;					// �����ε�
		}
		
		
		public void add(String s) {
			str = s;
		}
		
		public void add(String s2, int s1) {  // ������ ������ Ʋ���� ������ �Ȼ���
			k1 = s1;
			str = s2;
						}
		
		public void add(int s1, String s2) {
			k1 = s1;
			str = s2;
					
		}
		
		public void plus(int s) {
			k1 = k1 + s ;
				}
		
		
		public void calc(int s1, int s2) {
			k1 = s1 + s2 ;
			}
		
		public void s_add(String s) {
			str = s ;
		}
		
}
