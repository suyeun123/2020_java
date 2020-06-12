package com.ict.edu3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	// ������ ���̽� ���� ���
		public static void listPrn(ArrayList<VO> list) {
			System.out.println();
			System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
			for (VO vo : list) {
				System.out.print(vo.getIdx()+"\t");
				System.out.print(vo.getM_id()+"\t");
				System.out.print(vo.getM_pw()+"\t");
				System.out.print(vo.getM_name()+"\t");
				System.out.print(vo.getM_age()+"\t");
				System.out.println(vo.getM_reg());
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�����Ͻÿ�");
			System.out.println("1. ���̺� ������ ����");
			System.out.println("2. ���̺� ������ ����");
			System.out.println("3. ���̺� ������ ����");
			System.out.println("4. ���̺� ������ ����");
			System.out.print(">>>   ");
			int su = sc.nextInt();
			
			ArrayList<VO> list = null; 
			switch (su) {
				case 1: 
					list = DAO.getInstance().getSelect();
					listPrn(list);
					break;
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
					
					list  = DAO.getInstance().getInsert(m_id, m_pw, m_name, m_age);
					listPrn(list);
					break;
				case 3:    
					list = DAO.getInstance().getSelect();
					listPrn(list);
					System.out.println();
					System.out.print("������ IDX : ");
					System.out.println();
					String idx = sc.next();
					list = DAO.getInstance().getDelete(idx);
					listPrn(list);
					break;
				case 4:    
					list = DAO.getInstance().getSelect();
					listPrn(list);
					System.out.println();
					System.out.print("������ IDX : ");
					String idx2 = sc.next();
					System.out.print("������ ���� : ");
					String age = sc.next();
					System.out.println();
					list = DAO.getInstance().getUpdate(idx2, age);
					listPrn(list);
					break;
			}
			
			System.out.println();
			System.out.println();
			System.out.println("���� �ϼ̽��ϴ�.");
		}
	}
