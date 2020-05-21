package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
		private static final Character Character = null;

		public static void main(String[] args) {
			
			// Set �������̽��� ������ Ŭ���� : HashSet, TreeSet;
			// Ư¡ : �ߺ��Ƴ��, ���ľȵ� (TreeSet�� �׻� �������� ����)
			
			// �÷��� ���� : HashSet<���״�=��üŸ��=Ŭ����> �������� = new	HashSet<���״�>();
			HashSet<Integer> h1 = new HashSet<Integer>(); //���ľȵ�
			HashSet<Double> h2 = new HashSet<Double>();   // ���ľȵ�
			HashSet<Boolean> h3 = new HashSet<Boolean>();  //���ľȵ�
			TreeSet<Character> h4 = new TreeSet<Character>();
			TreeSet<String> h5 = new TreeSet<String>();
			
			
			// �ش� �÷��ǿ� ��ü�� ���� �� �־�� �ȴ�.)
			// 1. ��ü�� �����
			Integer k1 = new Integer(10); // �ڽ�
			Integer k2 = new Integer("20");
			
			// 2. �÷��ǿ� �ֱ�(add)
			h1.add(k1);
			h1.add(k2);
			h1.add(new Integer(30));
			h1.add(new Integer("40"));
			h1.add(50);   // ����ڽ� : �ڷ��� int 10�� �ڵ����� ��ü�� ���� �־��ش�.
			h1.add(60);	  // ����ڽ� : �ڷ��� int 10�� �ڵ����� ��ü�� ���� �־��ش�.
			
			
			// Double �ֱ�
			Double d1 = new Double(10);
			Double d2 = new Double("20");
			
			h2.add(d1);
			h2.add(d2);
			
//			h2.add(10);   => �������� ū�� �����ִ� ������ �ƴ� �Ȱ��ƾ� ����<����ڽ�>
			h2.add(10.0);
			
			h3.add(true);
			h3.add(false);
			h3.add(true);		// ������ ����������, �ߺ��� ����� ��������.
			
			h4.add('j');
			h4.add('a');
			h4.add('v');
			h4.add('a');		// ������ ����������, �ߺ��� ����� ��������.
			
			h5.add("�뽴");
			h5.add("���");
			h5.add("���");
			h5.add("���");
			h5.add("�뵵");
			
			
			System.out.println("============================================");
			
			System.out.println("��ü�����");
			
			System.out.println(h1);
			System.out.println(h2);
			System.out.println(h3);
			System.out.println(h4);
			System.out.println(h5);
			
			

			System.out.println("============================================");
			
			System.out.println("�ϳ������� <������ for, iterator>");
			for (Integer k : h1) {
				System.out.print(k+" ");
			}
			System.out.println();
			
			// ��ڽ� : ��ü�� �Ϲ������� ����ϴ� �ڷ������� ��ȯ
			for (int k : h1) {
				System.out.print(k+" ");
			}
			System.out.println();
			System.out.println("============================================");
			
			System.out.println("�ϳ������� <iterator>");
			
			Iterator<Double> it = h2.iterator();
			
			// hasNext() = > ������ü�� �����ϸ� true
			while (it.hasNext()) {
				// ������ü�� ������ ���ؼ� �̵��� ��ȯ�Ѵ�.
			double res = (double) it.next();
				System.out.print(res);
			}
			
			System.out.println();
			System.out.println("============================================");
			
			//h4����ϱ�
			// for��Ȱ��
			for (char k : h4) {
				System.out.println(k);
			}
			//while��Ȱ��
			Iterator<Character> it2 = h4.iterator();
			while (it2.hasNext()) {
				char res = (char) it2.next();
				System.out.print(res);
			}
			System.out.println();

			//h5����ϱ�
			// for��Ȱ��
			for (String k : h5) {
				System.out.println(k);
			}
			//while��Ȱ��
			Iterator<String> it3 = h5.iterator();
			while (it2.hasNext()) {
				String res = (String) it3.next();
				System.out.print(res);
			}
			
			
			
			
			
		}
}
