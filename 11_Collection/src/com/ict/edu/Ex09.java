package com.ict.edu;

import java.util.ArrayList;
import java.util.Vector;

public class Ex09 {
		
			public static void main(String[] args) {
				
				// List �������̽� : �迭�� ����� ����, ����, ����, �߰��� �����Ӵ�.
				//					 ũ�⸦ �̸� ������ �ʾƵ� �ȴ�.
				
				// ���� Ŭ���� : Stack, ArrayList, Vector;
				
				// ArrayList : ��Ƽ������ ����ȭ �������� ����
				// Vector : ��Ƽ������ ����ȭ ������
				// ArrayList�� Vector ������ ����.
				
				ArrayList<String> list = new ArrayList<String>();
				//�߰�, ���� : add
				list.add("����ȣ");
				list.add("�����");
				list.add("������");
				list.add(1, "��Ҽ�");
				
				
				System.out.println(list);
				System.out.println("=============================================");
				
				Vector<String> Vector = new Vector<String>();
				Vector.add("��Ҽ�");
				Vector.add("������");
				Vector.add("�����");
				Vector.add(2, "����ȣ");
				
			 System.out.println(Vector);
				
				if (list.contains("��Ҽ�")) {
					System.out.println(list.indexOf("��Ҽ�")+ "��°��ġ");
					System.out.println(list.get(2));
					System.out.println(list.lastIndexOf("��Ҽ�")+ "��°��ġ");
					//����ȣ��� ��÷� ����
					System.out.println(list.set(0, "���"));
					// search, elementAt,firstElement(),lastElement() : ����
					// elementAt,firstElement(),lastElement() : Vector���� ����
					
				} else {
						System.out.println("����");
				}
				
				System.out.println(list);
				System.out.println("=============================================");
				
				if(Vector.contains("��Ҽ�")){
					System.out.println(Vector.indexOf("��Ҽ�")+"��Ҽ� ��ġ");
					System.out.println(Vector.get(2));
					System.out.println(Vector.lastIndexOf("��Ҽ�")+"��° ��ġ");
					System.out.println(Vector.elementAt(1));
					System.out.println(Vector.firstElement());
					System.out.println(Vector.lastElement());
				}
				
				System.out.println("=============================================");
				// ġȯ
				Vector.set(1, "�뵵����");
				Vector.setElementAt("�뵹�뵹", 2);
				System.out.println(Vector);
				
				
				// ũ��
				System.out.println(list.size());
				System.out.println(Vector.size());
				
			}
				
}
