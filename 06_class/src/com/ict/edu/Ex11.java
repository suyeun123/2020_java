package com.ict.edu;

public class Ex11 {
		// ������ : Ŭ������ ��ü�� ȣ���Ҷ� �ڵ����� �ѹ� ȣ��ȴ�.
		//   ���� : ����ʵ���(������ ���)�� �ʱ�ȭ\
		//    Ư¡ : 
		// 			 - ������ �̸��� Ŭ���� �̸��� ����.
		//			 - ��ȯ���� ���� �޼ҵ�� ����.
		// 			 - �����ڵ� �����ε��� ����
		// 			   (�� Ŭ�����ȿ� �������� �����ڰ� ������ �� �ִ�.)
		//		     - �����ڰ� ������ ������ �⺻�����ڰ� ���� �ִ� ���̴�.
		//			 - �⺻�����ڶ� ���ڰ� ���� �������̴�.
		//			   ��, Ŭ���� �̸�()
		//			 - ���࿡ Ŭ�����ȿ� �����ڰ� �����ϸ� �⺻�����ڴ� �������.
		//			 - �̶��� Ŭ�����ȿ� �����ϴ� �����ڷ� ��ü�� �����ؾ� �Ѵ�.
		//			
		
		private String name = "������";
		private int age = 24;
		private String addr = "��û��";
		
		
		// ������ �����ε� :
		//������
		public Ex11() {	}
		public Ex11(String name) {
			this.name = name;
		}
		
		
		
	
		public Ex11(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}
		
		
		
		
		
		//������ ����  getter / setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		


}
