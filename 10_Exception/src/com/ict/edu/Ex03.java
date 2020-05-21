package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���� catch �� : try�� �ȿ� ���ܹ߻��� ������ �� �� �ִ� ���
// ���ǻ��� : Exception ����Ҷ��� �ݵ�� �Ʒ��� catch���� ���
//
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// InputMismatchException
		// ArithmeticException
		/*
		 * try { int var = 50; System.out.print("�����Է� : >>");
		 * 
		 * int su = sc.nextInt(); System.out.println("���� :" + (var / su));
		 * 
		 * 
		 * } catch (InputMismatchException e2) { System.out.println("������ �Է��ض�"); }catch
		 * (ArithmeticException e1) {
		 * 
		 * System.out.println("0���ȵȴ�~~~~"); }
		 */
	
		try {
			try {
				int var = 50;
				System.out.print("�����Է� : >>");

				int su = sc.nextInt();
				System.out.println("���� :" + (var / su));

			} catch (InputMismatchException e2) {
				System.out.println("������ �Է��ض�");
			} catch (ArithmeticException e1) {

				System.out.println("0���ȵȴ�~~~~");
			}

		} catch (Exception e) {
			System.out.println("~ ~ ��~ ~");
		}

	}

}
