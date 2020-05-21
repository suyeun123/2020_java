package com.ict.edu01;

import java.util.Iterator;

enum Type2{
	//��� ("������ ����")
	WALK("��ŷȭ", 270), 
	RUN("����ȭ",250),
	TRACK("Ʈ��ŷȭ",260),
	HIKING("���ȭ",240);
	
	final private String name;
	final private int size;
	
	//������ ������ �Ѵ�.
	private Type2(String name, int size) {
		this.name = name ;
		this.size = size ;
	}

	//���ڸ� �޾ƿ��� �Լ�
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	
}

public class Ex03 {
		public static void main(String[] args) {
			for(Type2 k : Type2.values()) {
				
				System.out.println(k.name() + ":" + k.getName()+ k.getSize());
			}
		}
}
