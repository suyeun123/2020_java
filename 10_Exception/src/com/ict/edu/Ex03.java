package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
// 다중 catch 문 : try문 안에 예외발생이 여러개 될 수 있는 경우
// 주의사항 : Exception 사용할때는 반드시 아래쪽 catch문에 사용
//
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// InputMismatchException
		// ArithmeticException
		/*
		 * try { int var = 50; System.out.print("좀수입력 : >>");
		 * 
		 * int su = sc.nextInt(); System.out.println("정답 :" + (var / su));
		 * 
		 * 
		 * } catch (InputMismatchException e2) { System.out.println("정수만 입력해라"); }catch
		 * (ArithmeticException e1) {
		 * 
		 * System.out.println("0은안된다~~~~"); }
		 */
	
		try {
			try {
				int var = 50;
				System.out.print("좀수입력 : >>");

				int su = sc.nextInt();
				System.out.println("정답 :" + (var / su));

			} catch (InputMismatchException e2) {
				System.out.println("정수만 입력해라");
			} catch (ArithmeticException e1) {

				System.out.println("0은안된다~~~~");
			}

		} catch (Exception e) {
			System.out.println("~ ~ 즐~ ~");
		}

	}

}
