package com.ict.java03;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		// Random Ŭ������ Ȱ���ؼ� ���� 1-10 ������ �� ���� ���Ͻÿ�
		// 1. ���� �߻� : Random, Math.random()

		// Random Ŭ����

		Random ran = new Random();

		// boolean�� ����
		System.out.println(ran.nextBoolean());

		// ���� ���� ����
		System.out.print(ran.nextInt());

		// �Ǽ� ���� ���� (0.0 �̻���� 1.0 �̸�)
		System.out.println(ran.nextDouble());

		// Ư�������� ������ ����

		System.out.println(ran.nextInt(10) + 1); // (0 - 9) + 1

		System.out.println((int) (ran.nextDouble() * 10) + 1); // 0-9 +1

		// Math.random() => 0.0 �̻���� 1.0�̸�

		System.out.println(Math.random());

		// Ư������ ������ �� �ִ�.
		System.out.println((int) (ran.nextDouble() * 10) + 1); // (0-9)+1

		System.out.println("==================================================================");

		// 2. MathŬ�������� �ø�, �ݿø�, ������ �����ϴ� �� �� �޼ҵ带 ���ÿ�

		// �ø�
		System.out.println(Math.ceil(14.45));
		System.out.println(Math.ceil(14.55));
		System.out.println(Math.ceil(14.65));

		// �ݿø�
		System.out.println(Math.round(14.45));
		System.out.println(Math.round(14.55));
		System.out.println(Math.round(14.65));

		// ����
		System.out.println(Math.floor(14.45));
		System.out.println(Math.floor(14.55));
		System.out.println(Math.floor(14.65));
		System.out.println("==================================================================");
		// String Ŭ�������� substring()�� ���ؼ� ���ÿ�
		// String Ŭ�������� valueOf()�� ���ؼ� ���ÿ�

		//
		// String ���ٴ� ǥ�ø� '==' ǥ�ø� ����ϸ� �ȵ�
		// �ݵ�� equals �� equalsIngnoreCase()�� ���ٴ� ǥ�ø� �ؾߵȴ�.
		// ������ : equals() (��ҹ��ڱ���), equalsIngnoreCase() (��ҹ��ڸ� �������� �ʴ´�)

		// getBytes() : byte[]
		// �ش繮�ڿ��� byte[] �����. (I/O)

		// indexOf(char c), indexOf(String s) :
		// ���� ����, ���ڿ��� ��ġ���� �˷��ش�.
		// ������ -1 ���´�.

		String str = "BufferedReader";

		// 'r' �� ��ġ ã�ƶ�
		int k = str.indexOf('r');
		System.out.println(k);

		// 'er'�� ��ġ ã�ƶ�
		k = str.indexOf("er");
		System.out.println(k);

		// 'f'�� ��ġ ã�ƶ�
		k = str.indexOf("f");
		System.out.println(k);

		// �ι�° 'f' ã�ƶ�
		k = str.indexOf("f", str.indexOf("f") + 1);
		System.out.println(k);

		// ����° 'e' ã�ƶ�
		k = str.indexOf("e", str.indexOf("e", str.indexOf("e") + 1) + 1);
		System.out.println(k);
		
		
		System.out.println("==================================================================");
		// length() : ���ڿ��� ���� ����
		
		String msg = "���� Korea 121";
		System.out.println(msg.length());
		
		// replace : ġȯ
		String str2 = "���ѹα�";
		String str3 = str2.replace("��", "han");
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("==================================================================");	
		
		// substring(������ġ) : ������ġ���� ������
		// Substring(������ġ, ����ġ) : ������ġ���� ����ġ ������
		String str4 = "010-9732-9110";
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4,8));
		System.out.println(str4.substring(0,3));  // ��3����
		System.out.println(str4.substring(9));  // ��4����
		
		// ��� ���ڸ� �빮�ڷ� ���� : toUpperCase()
		// ��� ���ڸ� �ҹ��ڷ� ���� :  toLowerCase()
		String str5 = "KoreaSeoul";
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		
		System.out.println(str5.substring(0,5).toUpperCase()+str5.substring(5).toLowerCase());
		
		// valueOf(���� �ڷ���) => ���ڷ� ���� ���� �ڷ������� ���ڿ�(String)�� �����.
		boolean b1 = true;
		char c1 = 'k';
		int n1 = 24;
		double n2 = 34.1 ;
		
//        System.out.println(b1 +1);		 ���� boolean�� +1�� �� �� ����.
		System.out.println(String.valueOf(b1)+1);
        		
		System.out.println(n1+1); //25
		System.out.println(String.valueOf(n1)+1); //241    [���ڿ���]
		
		System.out.println(n2+1); //35.1
		System.out.println(String.valueOf(n2)+1); //34.11
		
		// ���� �ڷ��� ó�� ���� ���ڿ��� ��¥ ���� �ڷ������� ����
		String st1 = "true";
		String st2 = "24";
		String st3 = "34.1";
		
		
		// ���ڿ� => boolean : Boolean.parseBoolean()
		System.out.println(st1+1);
//		System.out.println(Boolean.parseBoolean(st1)+1);   ���� boolean�� +1�� �� �� ����.
		
		
		// ���ڿ� => ���� Integer.parseInt()
		System.out.println(st2+1);   //241
		System.out.println(Integer.parseInt(st2)+1);   //25
		
		
		// ���ڿ� => �Ǽ� Integer.parseInt()
		System.out.println(st3+1);   //34.11
		System.out.println(Double.parseDouble(st3)+1);   //35.1
		
		// ���״� - �÷���(set,list,queue,map)�� � ��ü��� �̷������ ǥ���ϴ� ��ü(Ŭ����)Ÿ��
		// �÷��� - ��ü���� ��Ƽ� �����ϴ� �������̽�
		
		

	}

}
