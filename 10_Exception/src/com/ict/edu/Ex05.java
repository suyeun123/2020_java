package com.ict.edu;

import java.util.Scanner;

// finally : ����ó���� ������� �ݵ�� �����ؾ� �Ǵ� ������ ó���Ҷ� ���
//			����Ÿ���̽�, I/O, ��Ʈ��ũ���� �ַ� ���ȴ�.
// try{
// ���ܹ߻� ������ �����;
// 	} catch(���ܰ�ü e) {
//	���ܰ�ü ó�� ����;
//	} catch(���ܰ�ü e) {
//  ���ܰ�ü ó������;
// } finally{
//    ������ ���� �ؾ��ϴ� ����
//  }

public class Ex05 {
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
					int var = 50;
					System.out.print("�����Է� : >>");
					int su = sc.nextInt();
					System.out.println("���� :" + (var / su));

				} catch (Exception e2) {
					System.out.println("������ �Է��ض�");
					return ;
					
				} finally {
					System.out.println("�ݵ��~~~~~~~~~~");
				}
					System.out.println("~ ~ ��~ ~");
			
			
			
		}}

