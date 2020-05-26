package com.ict.edu2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

// 1. ����Ʈ ��Ʈ�� : ��� ó���� 1byte�� ó��
//             ��� : byte�� �̷���� ��� ����(������, ����, �׸�, �Ҹ�, ������)
//      �ֻ��� Ŭ���� : InputStream(�Է�), OutputStream(���)
//      

// FileOutputStream �ֿ� �޼ҵ�
//   -  write(int b) : int b => �ƽ�Ű�ڵ�(����) �ϳ� ���� �ִ�. =>  �ѱ��� ����
//                   int b ��� char �ϳ��� ����� �� �� �ִ�.
//				     ������ ��ҹ���, ����, �Ϻ�Ư������ ���� ����
//					 ��� �� ������ ���ڴ� ��� �Ұ�

//   -  write(byte[] b) : byte �迭����� �� �ִ�.
//   -  flush() : write �� �ݵ�� ���
//   -  close() : open �� ��Ʈ���� �ٱ� (finally �� ó��)
public class Ex02 {
		
			public static void main(String[] args) {
				
				String pathname ="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO01.txt";  
				File file = new File(pathname);
				
				FileOutputStream fos = null;
				try {
					// �ش����Ͼ����� ���������, ������ ������ �ʴ´�.
					// ����� �ȴ�.
					 fos = new FileOutputStream(file); 
					
					// �̾��
					// fos = new FileOutputStream(file, true);
					fos.write(97);  //a
					fos.write(65);  //A
					fos.write(97);  //a
					
					// ���ڴ�ſ� char ���
					fos.write('j');
					fos.write('a');
					fos.write('v');
					fos.write('a');
						
					// �ٺ����ϱ� 13,10
					fos.write(13);
					fos.write(10);
					
					// �迭�� �̿�����
					byte[] b = {'b','o','y','s',13,10,'g','i','r','s',13,10};
					fos.write(b);
					
					// String�� �̿����� : �񿵾�ǵ� ��밡��
					String str = "Hello\n�ȳ�\n123\n����\nWorld";
					
					// ������ byte[]�� �־���.
					byte[] b2 = str.getBytes();
					fos.write(b2);
					
					fos.flush();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
				try {
				if(fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
}
}