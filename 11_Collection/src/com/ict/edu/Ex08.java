package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex08 {
		public static void main(String[] args) {
			
			// List �������̽� : �迭�� ����� ����, ����, ����, �߰��� �����Ӵ�.
			//					 ũ�⸦ �̸� ������ �ʾƵ� �ȴ�.
			
			// ���� Ŭ���� : Stack, ArrayList, Vector;
			// Strack : LIFO(Last In First Out) : �������� ���� �����Ͱ� ���� ������ ����
			// add, push, addElement => �߰�
			// add(Index, E)         => ����
			// pop : ������ �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
			// peek : ������ �����ϴ� ��ü�� ��ȯ
			// search : �˻�(������1����)
			// indexOf : �˻�(����0����)
			// elementAt(index) : ���� (����0����)
			// get(index) : ����(����0����)
			// firstElement() => ��ó����� ����
			// lastElement() => ��������� ����
			// setElement(Element, index) => ġȯ
			
			Stack<String> st = new Stack<String>();
			st.add("���");
			st.addElement("��θ�");
			st.push("�뽴��");
			System.out.println(st);
			
			
			
			st.add(0, "�뵵��");
			st.add(3, "������");
			System.out.println(st);
			
			
			// ��������ü ���� : pop(����), peek
			System.out.println(st.peek());
			System.out.println(st);
			
			System.out.println(st.pop());
			System.out.println(st);
			
			System.out.println("===================================================================");
			
			if(st.contains("���")) {
				System.out.println(st.indexOf("���")+"��°��ġ");
				System.out.println(st.search("���")+"��°��ġ");
				System.out.println(st.get(3));
				System.out.println(st.elementAt(3));
				System.out.println(st.firstElement());
				System.out.println(st.lastElement());
				System.out.println(st.size()+"��");
			}else {
				System.out.println("����");
			}
			
			st.setElementAt("��츮",2);
			System.out.println(st);
			System.out.println("===================================================================");
			
			
			// �ߺ� ����
			st.add("���");
			st.add(3,"���");
			System.out.println(st);
			
			System.out.println("===================================================================");
			
			// ���
			
			for (String k : st) {
				System.out.println(k);
			}
			
			System.out.println("===================================================================");
			
			Iterator<String> it = st.iterator();
			
			while (it.hasNext()) {
				String k = (String) it.next();
				System.out.println(k);
			}
			System.out.println("===================================================================");
			
			
			// �Ųٷ� �����鼭 �����ϱ�
			while (! st.isEmpty()) {
				String k = st.pop();
				System.out.println(k+" ? ������, ũ���" + st.size() + " �̴�~~!��");
			}
			
			
		}
}
