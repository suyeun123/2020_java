package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_Main {
	public static void main(String[] args) {    //1. ���θ޼ҵ� ����
		Scanner sc = new Scanner(System.in);   //2. ��ĳ�� ����
		
		HashSet<Ex05> person = new HashSet<Ex05>();  //3. �÷�������
		// Ex09[] arr = new Ex09[5]
		// for (int i = 0; i < 5; i++) {
		while(true) {       // for�� or while   �׷��� for���� �迭�� �����������־����.�׷��� while�� ����
		    Ex05  p =  new Ex05();  // ����� Ŭ���� ����Ʈ
			
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("���� : ");
			int kor = sc.nextInt();
			
			System.out.print("���� : ");
			int eng = sc.nextInt();
			
			System.out.print("���� : ");
			int math = sc.nextInt();
		    
			p.setName(name);
			p.s_sum(kor, eng, math);
			
			person.add(p);
			
			System.out.print("����ұ��?(y/n)");
			String str = sc.next();
			if(str.equalsIgnoreCase("n")) break;
			// arr[i] = p ;
		}
		// ����
		for (Ex05 k : person) {
			for (Ex05 j : person) {
				if(k.getSum() < j.getSum()) {
					k.setRank(k.getRank()+1);
				}
			}
		}
		// ������ �ȵȴ�.
		
		// ���
		for (Ex05 k : person) {
			System.out.print(k.getName()+"  ");
			System.out.print(k.getSum()+"  ");
			System.out.print(k.getAvg()+"  ");
			System.out.print(k.getHak()+"  ");
			System.out.println(k.getRank());
		}
	}
}
