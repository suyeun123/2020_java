package com.ict.edu2;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�����Ͻÿ�");
		System.out.println("1. ���̺� ������ ����");
		System.out.println("2. ���̺� ������ ����");
		System.out.println("3. ���̺� ������ ����");
		System.out.println("4. ���̺� ������ ����");
		System.out.print(">>>   ");
		int su = sc.nextInt();
		
		switch (su) {
			case 1:  DAO.getInstance().getSelect();  break;
			case 2:   
				System.out.println("������ �Է��ϼ���");
				System.out.print("���̵� : ");
				String m_id = sc.next();
				
				System.out.print("�н����� : ");
				String m_pw = sc.next();
				
				System.out.print("�̸� : ");
				String m_name = sc.next();
				
				System.out.print("���� : ");
				String m_age = sc.next();
				
				DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
				
				break;
			case 3:    
				DAO.getInstance().getSelect();
				System.out.println();
				System.out.print("������ IDX : ");
				System.out.println();
				String idx = sc.next();
				DAO.getInstance().getDelete(idx);
				break;
			case 4:    
				DAO.getInstance().getSelect();
				System.out.println();
				System.out.print("������ IDX : ");
				String idx2 = sc.next();
				System.out.print("������ ���� : ");
				String age = sc.next();
				System.out.println();
				DAO.getInstance().getUpdate(idx2, age);
				break;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
