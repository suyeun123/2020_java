package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		// java.lang ��Ű���ȿ� �����ϴ� Ŭ������ �ƹ��� ������� ��밡��
		// �ٸ����� �����ϴ� Ŭ������ �ݵ�� import�� �ؾ� ������ ���� �ʴ´�.
		// import ��� : �ش� Ŭ���� ���� �ڿ���ctrl + space bar�� ������.
		//				�Ǵ� ctrl + shift + o
		
		// Scanner Ŭ���� : Ű���� ������ �Է¹޾Ƽ� ó���ϴ� Ŭ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸� : ");
		
		// �Է��� ������ String�� ��� ó���ϴ� ���
		
		String name = sc.next();
		System.out.println("�Է��� �̸� :" + name);
		
		// �Է��� ������ ����(����)�� ó�� �ϴ� ���
		
//		System.out.print("����� ���� : ");
//		int age = sc.nextInt();
//		System.out.println("�Է��ѳ��� : " + age);
		
		System.out.println();
		
		
		
		
		 System.out.print("����� ���� : ");
		 int age = sc.nextInt();
		 System.out.println("�Է��� ���� : " + age);
		
		
		 System.out.println();
		
		// �Է��� ������ ����(�Ǽ�)�� ó�� �ϴ� ���
		
				System.out.print("����� Ű : ");
				double height = sc.nextDouble();
				System.out.println("�Է��ѳ��� : " + height);
		
				System.out.println("----------------------------------------------------------");
		
				// �Է��� ������ boolean�� ó�� �ϴ� ���
				
				System.out.print("����� ���� �Դϱ�?(true/false) : ");
				boolean gender = sc.nextBoolean();
				if (gender) {
					System.out.println("����� �����Դϴ�");
				}else {
					System.out.println("����� �����Դϴ�");
				}
					
				System.out.println("----------------------------------------------------------");	
				
				// sc���� char ó���� ����. 
				// ���߿� String���� char ó���ϴ� ����� ����ؾ� �Ѵ�.
				
				
				
				
				
	}
}
