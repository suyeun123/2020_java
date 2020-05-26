package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1. ����Ʈ ��Ʈ�� : ��� ó���� 1byte�� ó��
//��� : byte�� �̷���� ��� ����(������, ����, �׸�, �Ҹ�, ������)
//�ֻ��� Ŭ���� : InputStream(�Է�), OutputStream(���)
//

//FileInputStream �ֿ� �޼ҵ�
// - read() : int => ����� ����(�ƽ�Ű�ڵ�)�ϳ� ����, 
//					 char�� ����ȯ�ؼ� ���ڷ� �����ؾ� �Ѵ�.

// - read(byte[] b) : int   => �迭 ũ�⸦ �����ؾ� �ȴ�.
//                              1byte�� �迭�� �����ϰ�, �д� ����ŭ ��ȯ

//-  close() : ��Ʈ���� �ݱ� (finally �� ó��)
public class Ex03 {
			
			public static void main(String[] args) {
				

				String pathname ="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO01.txt";  
				File file = new File(pathname);
				
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(file);
					 
					// �� ���� �о� ���� : read()  => ���ڷ� ���´�.
					// int k = fis.read();
					// Sytem.out.println(k + ":" + (char)(k));
					
					// �ѱ��ھ� ��� �д� ��� : �׸�, �Ҹ� �������� �д� ���(�񿵾���� ������)
//					int k2 = 0;					
//					while(true) {
//						k2 = fis.read();
						// �о�� ���� -1�̸� ���̻� ���� �� ����.
//						if(k2 == -1)break;
//						System.out.println(k2 + ":" + (char)(k2) + " ");
//					}
					
					// �迭�� �о���� ���
//					byte[] b = new byte[20];
					
					// �񿵾�� �ȵ�
//					byte[] b = new byte[(int) file.length()];
					
					
					//�о byte[]�� �־��ش�. (�迭 ũ�⸸ŭ�� �־��ش�.)
//					fis.read(b);
//					for (byte k : b) {
//						System.out.print((char)(k));
//					}
					
					
					//  String �̿��ϴ� ��� : �񿵾�� ���
					byte[] b = new byte[(int) file.length()];
					fis.read(b);
					String str = new String(b);
					System.out.println(str);
					
										
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
							if(fis != null) fis.close();
					} catch (Exception e2) {
					}
				}
				
					
					}
				}
				
				
				
