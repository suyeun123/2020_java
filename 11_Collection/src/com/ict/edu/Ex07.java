package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex07 {
		
			public static void main(String[] args) {
				
				// �ζ� ��ȣ : 1 - 45, ����, �ߺ� �ȵ�, 6�ڸ�
				TreeSet<Integer> lotto1 = new TreeSet<Integer>();
				for (int i = 0; i < 6; i++) {
					int k = (int)(Math.random()*45)+1;
					if(! lotto1.add(k));{
					i--;
				}
					}
				System.out.println(lotto1);
			}
	
}
