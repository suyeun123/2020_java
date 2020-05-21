package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	
		public static void main(String[] args) {
	
			// ������, �־��ִ� ��� : �⺻�����ڷ� ���� setter()
			Ex03 p1 = new Ex03();
			p1.setName("�Ѹ�");
			p1.setAge(24);
			p1.setWeight(105.4);
			
			// ������, �־��ִ� ��� :  ���ڰ� �ִ� �����ڿ� ���� �־��ش�.
			Ex03 p2 = new Ex03("����", 3, 40.5);
			Ex03 p3 = new Ex03("����Ŭ", 23, 55.5);
			
			// ��ü�� �����ϴ� ��� : �迭, �÷���
			
			// 1. �迭
			Ex03[] arr = new Ex03[3];
			arr[0] = p1 ;
			arr[1] = p2 ;
			arr[2] = p3 ;
			
			// �̸� ������ : �迭�� ������ for
			for (Ex03 k : arr) {
				System.out.println(k.getName());
			}
				
			System.out.println("===================================");
			
			
			// 2. �÷���
			HashSet<Ex03> set1 = new HashSet<Ex03>();
			set1.add(p1);
			set1.add(p2);
			set1.add(p3);
			set1.add(new Ex03("������", 21, 45.5));
			
			
			
			// �̸� ������ : for , iterator
			
			for (Ex03 k : set1) {
				System.out.println(k.getName());
			}
			System.out.println("=====================");
			
			
			
			// �̸� ������ : for , iterator
			Iterator<Ex03> it = set1.iterator();
			
			while (it.hasNext()) {
				Ex03 res = (Ex03) it.next();
				System.out.println(res.getName());
			}
			System.out.println("=====================");
			
			// ���Կ��� : contains
			if(set1.contains(p1)) {
				System.out.println("�ִ�.");
			}else {
				System.out.println("����.");
			}
			
			System.out.println("=====================");
			
			// ũ�� ���ϱ�
			System.out.println("set1�� ���� �� ũ�� : " + set1.size());
			
			
			// �̸� �������� ��ü�� �ִ��� �˾ƺ���, ����(remove)�ϱ�
			for (Ex03 k : set1) {
				if(k.getName().contains("������")){
					set1.remove(k);
					break; //set1�� ������ ����Ǿ��� ������ ���̻� for���� �����ϸ� �ȵ�
				}
			}
			
			// ũ�� ���ϱ�
						System.out.println("set1�� ���� �� ũ�� : " + set1.size());
			
			
					System.out.println("=======================");
				for (Ex03 k : set1) {
					System.out.println(k.getName());
				}
					
				// ��� ���� : clear(), // ����ֳ�? isEmpty()
				set1.clear();
				System.out.println("��� ������ ũ���? " + set1.size());
				
				boolean result = set1.isEmpty();
				if (result) {
					System.out.println("����");
				}else {
					System.out.println("�����������");
				}
				
					
				}
		
			
			
			
		}
		

