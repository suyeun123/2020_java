package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
			public static void main(String[] args) {
				
				// Map �������̽� : key�� Value�� �����ϴ� ������ �̷����
				// 					key�� �ߺ��� �� ����.
				//					key�� ȣ���ϸ� Value�� ���´�.
				//					key�� ������ ���� => keySet()
				//					add()�� �߰� ����
				//					put(key, value) �߰��Ѵ�.
				
				
				// Map���� (key���ڷ� �����.)
				HashMap<Integer, String>map1 = new HashMap<Integer, String>();
				
				// �߰� : add X, put(k,v)
				map1.put(0, "�ѱ�");
				map1.put(1, "�̱�");
				map1.put(2, "������");
				map1.put(3, "��Ż����");
				map1.put(4, "����ũ");
				map1.put(5, "�ѱ�");    // value�� �ߺ��� �������.
				map1.put(4, "���ζ�");  //key�ߺ��� ���������.
				
			 System.out.println(map1);
				
			 // �ϳ��� ��� (get(key) => value�� ���´�.)
			 System.out.println(map1.get(2));
			 System.out.println(map1.get("�ѱ�"));
			 System.out.println("=======================================");
				
			 // �Ϻη� key�� ������� ������� ������ for���� ����� �� �ִ�.
			 // map���� value�� ȣ���ϴ� ��� ; get(key)
			 for (int i = 0; i < map1.size(); i++) {
				System.out.println(map1.get(i));
			}
				
			 System.out.println("=======================================");
			 // 1���������� �ʾƵ�, ������ ��Ģ�� ���̵� ���
			 for (Integer k : map1.keySet()) {
				System.out.println(map1.get(k));
			}
			 System.out.println("=======================================");
				
			 // Map���� (Key�� ���ڿ�(String)�� ����� => �Ϲ����� ���)
			  HashMap<String, String> map2 = new HashMap<String, String>();
			  map2.put("�̸�", "�뵵��");
			  map2.put("����", "100");
			  map2.put("�ּ�", "�˷���ī ���Ͻ�");
			  map2.put("����", "�߼�");
			  map2.put("���", "��ġ����");
			  
			  System.out.println(map2.get("�̸�"));
			  System.out.println(map2.get("����"));
			  System.out.println(map2.get("�ּ�"));
			  System.out.println(map2.get("����"));
			  System.out.println(map2.get("���"));
			  System.out.println("=======================================");
			  
			  
			  
			  for (String k : map2.keySet()) {
				System.out.println(map2.get(k));
				
				
				
			  System.out.println("=======================================");		  
				
			  Iterator<String> it = map2.keySet().iterator();
			  while (it.hasNext()) {
				String res = (String) it.next();
				System.out.println(map2.get(res));
			}
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			}
			  
			  
			
				
			}
}
