package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
		public static void main(String[] args) {
			// ����Ŭ������ ������ ��ü ������ �� �� ����.
			
			/* Inner01 inner01 = new Inner01(); */
			// �ܺ�Ŭ������ ���� ��ü ���� �ؾ��Ѵ�.
			
			Ex05 e5 = new Ex05();
			
			System.out.println(e5.name);
			
			
			// private�̹Ƿ� ����
			/* System.out.println(e5.age); */
			
			
			e5.play();
			
			System.out.println("==============================================================");

			// Member ����Ŭ����
			Ex05.Inner01 inner01 = new Ex05().new Inner01(); // �̷������ ��õ��������.
			System.out.println("==============================================================");
			Ex05.Inner01 inner02 = e5.new Inner01();
			inner02.prn();
			
			System.out.println("==============================================================");
			
			// static ����Ŭ���� ȣ��
			System.out.println(Inner02.a3);
			System.out.println(Inner02.a4);
			Inner02.go2();
			
			// static ����Ŭ������ �ܺ�Ŭ������ ������ �ʰ� ���� �� �ִ�.
			Inner02 test = new Inner02();
			System.out.println(test.a1);
			System.out.println(test.a2);
			test.go();
			
			
			
		}
}
