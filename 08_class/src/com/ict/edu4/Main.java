package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// �����ε�   : �� Ŭ�����ȿ��� ���� �̸��� �޼ҵ尡 ������ �����ϴ� �� 
		// 				(������ �ڷ����̳� ������ �ٸ���)
		
		// �������̵� : ��Ӱ��迡�� �θ�޼ҵ�� �ڽĸ޼ҵ尡 ���� ��.
		//				�̶� �ڽ�Ŭ������ �θ�޼ҵ带 ���� ���� ��ſ�
		//				������ �ڱ⿡ �°� �����ؼ� ����ϴ� ��.
		//				(��üƯ¡)* �θ�޼ҵ尡 ��������. (����ȭ, = ĸ��ȭ)
		//				* ���� �޼ҵ带 ȣ���ص� �ٸ������� �����Ѵ�.
		
		Animal d  = new Dog();
		Animal c  = new Cat();
		
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println("==============================");
		
		
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.like();
		c.sound();
		
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϼ��� >> 1. �����, 2. ������");
		int su = sc.nextInt();
//		
//		if(su==1) {
//				Cat cat = new Cat();
//				cat.sound();
//				cat.like();
//				cat.hobby();
//		}else if (su==2) {
//				Dog dog = new Dog();
//				dog.sound();
//				dog.like();
//				dog.hobby();
//	}
		Animal a = null;
		if(su==1) { 
			a = new Cat();
			
		}else if (su==2) {
			a = new Dog();
			
		}
		a.sound();  //�θ�, �ڽ�
		a.like();	//�θ�
		// a.hobby();  -> �ڽ��� ������ �־ ��� ����
		
		
		
		
		
		
		
		
		
		
}
}