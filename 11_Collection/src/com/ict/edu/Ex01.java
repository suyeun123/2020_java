package com.ict.edu;

public class Ex01 {
			
		// ���״а� �÷���(�ڷᱸ��)
		// ���״� : �÷����� � ��ü��� �̷���������� ǥ���ϴ� ��ü Ÿ��(Ŭ����)�� ���Ѵ�.
		// �÷��� : ��ü���� ��Ƽ� �����ϴ� �������̽����� ����
		//	A P I :<T> => ��ü Ÿ��, <E> => ���, �÷��� �ȿ� �����ϴ� ��ü �ϳ��� ���Ѵ�.
		//         Map ���� : <K, V> => Key(Ű��), Value(�����Ͱ�)
		//		   key�� Value�� 1:1 ����, ** key�� ȣ���ϸ� value�� ���´�.
		// ���� : �÷���<���״�> 
	
		// �ֻ��� �÷����� Collection<E>,  Map<K,V>
		// Collection<E>�� ��ӹ��� �ڽĵ� : Set<E>, List<E>, Queue<E>
		
		// Collection�� �ֿ� �޼ҵ�
		// add(E e) : boolean  => �ش� �÷��ǿ� ��ü �߰�, �����ϸ� true, �����ϸ� false
		//                     => ������ ���ϰ��� �� ���� �ʴ´�.
		//
		// addAll(Collection<? extends E> c) : boolean
		//   -> Ư�� �÷��ǿ� �ִ� ��� ��ҵ��� �ٸ� �÷��ǿ� �߰�
		// clear() : void => ��� ��� ����
		// contains(Object o) : boolean => �ش� �÷��ǿ� ���ڷ� ���� ��ü�� ��ü�� �����ϸ� true,
		//									�������� ������ false
		// isEmpty() : boolean => �ش� �÷����� ��������� true, ������� ������ false
		// iterator() : iterator<E> => �÷��� �ȿ� �����ϴ� ��ü���� ������� �����ϱ� ����
		//								iterator ��ü�� ��ȯ,
		//								�÷��� �ȿ� �����ϴ� ��ü�� �ϳ��� ������ �۾��Ҷ� ���
		// remove(Object o) : boolean => ���ڷ� ������ ��ü ����. �����ϸ� true, false
		// size() : int => �÷��� �ȿ� �����ϴ� ��ü�� �� (for������ ���)
		// toArray() :  Object[] -> �÷����� �迭�� ���鶧 ���
	
}