package ict.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.JUnit.Ex01;


// JUnit : ���� �׽�Ʈ(�޼ҵ� ������ �׽�Ʈ) ����, ��Ŭ�������� �⺻������ ����
// ���ڽ� �׽�Ʈ : �Է°��� �־ ������ ������ ����,
//                   ������ ��ġ���� ������ ����
// assertEquals : �⺻�� ���� �Ǵ� ��ü�� ���� ���󰪰� ��ġ���� �˻��ϴ� �޼ҵ�
// assertSame   : �� ��ü�� ���� ��ü���� �˻� (�ּҰ� ����?)
// assertNull   : null���� �˻�
// asserNoNull : null�ƴ��� �˻�
// assertTrue(a) : a�� ������ �˻�
// asserArryEquals(a,b) : �迭a, �迭b�� ��ġ���� Ȯ��



public class Ex01_Test {

	Ex01 t1 ;
	
	// �׽�Ʈ �� : ������ �޼ҵ��� Ŭ������ ��ü ��������
	@Before      // �ֳ����̼� : �ּ��� �������� �����Ϸ����� ���ø� ������ ��
	public void testBefore() {
		System.out.println("���� Ŭ������ ��ü ��������");
		t1 = new Ex01();
		
	}
	
	// �׽�Ʈ�� �����ϴ� �޼ҵ�
	@Test
	public void test() {
		// �޼ҵ带 ������ ���� 
		int res = t1.add(10, 20);
		// expected => ����, => �����
		assertEquals(30, res);
	}
	
	@Test
	public void subTest() {
		// �޼ҵ带 ������ ���� 
		int res = t1.sub(1, 5);
		// expected => ����, => �����
		assertEquals(-4, res);
	}
	
	
	
	// �׽�Ʈ ���� ��
	@After
	public void tAfter() {
		System.out.println("�׽�Ʈ ���� �� �޼ҵ� ����");
	}
	

}
