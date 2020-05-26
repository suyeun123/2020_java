package com.ict.edu;

import java.util.LinkedList;

public class Ex10 {
			public static void main(String[] args) {
				
				// Queue(ť) �������̽� : FIFO(First-In-First-Out) => �������� ������ ���� ����
				// ���� Ŭ���� : LinkedList
				
				LinkedList<String> list = new LinkedList<String>();
				//�߰�, ���� : add, addFirst, addLast, offerFirst, offerLast
				
				
				list.add("���");
				list.offer("�덏");
				list.addFirst("��浿");
				list.offerFirst("�뵵��");
				
				list.addLast("��浿");
				list.offerLast("�뵵��");
				
				System.out.println(list);
				System.out.println("===================================");
				
				// �˻�
				if(list.contains("���")) {
					System.out.println(list.indexOf("���")+"��°��ġ");
					System.out.println(list.lastIndexOf("���")+"��°��ġ");
					System.out.println(list.getFirst());
					System.out.println(list.getLast());
					System.out.println(list.get(list.indexOf("�덏")));
					
					
				}
				// ���� : remove(Object), remove(index), removeFirst(), removeLast();
				list.removeFirst();
				list.remove("��浿");
				list.remove(2);
				list.removeLast();
				
				System.out.println(list);
				
				//���
				for (String k : list) {
					System.out.println(k);
				}
				
				
				
			}
}
