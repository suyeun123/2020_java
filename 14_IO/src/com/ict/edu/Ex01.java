package com.ict.edu;

import java.io.File;

// File Ŭ���� : Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
// �ֿ������  : File(String ���), File(String �������, String �������)
//				 File(File ���� ���, String ���� ���)
// �ֿ� �޼ҵ� : 
// - createNewFile() : ���� �����ϸ� true,
// - mkdir(), mkdirs() : ���丮 ����
// - delete() : ����, ���丮 ����
// - isDirectory() : ���丮�̸� true
// - isFile() : �����̸� true
// - list() : Ư����ġ�� ���丮���� String[]�� ��� ���� ��
// - length() : ���̰� �ƴ϶� ������ ũ�⸦ byte ǥ��
// - getAbsolutePath() : ������ ǥ��
// - getCanonicalPath() : ����ȭ ��� ǥ��
// - getPath() : ��� ��� ǥ��
public class Ex01 {
			
		public static void main(String[] args) {
			
			// File Ŭ���� �����ڿ� �ֱ� ���ؼ� ���� �����

/*		String pathName = "C:\\Study\\util";     �ü���� windows�϶�
		String pathName = "C:/Study/util";     �ü���� Linux, Unix�϶�
*/			
			
			// �ü���� ������� ����ϴ� ���
			String pathName = "c:"+ File.separator+"Study"+ File.separator+"util";
			
			
			File file = new File(pathName);
			String[] arr = file.list();
			
			for (String k : arr) {
//				 System.out.println(k);
				File file2 = new File(pathName, k);
//				System.out.println(file2);
				if (file2.isDirectory()) {
						System.out.println("���丮 : " + file2 + "ũ�Ⱑ �������� ����" );
				}else {
					System.out.println("���� : " + file2 + ", ũ�� : " + file2.length()+"byte" );
				}
			}
			
		}
	
}
