package com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02 {
		public static void main(String[] args) {
			
			String pathName = "c:"+ File.separator+"Study"+ File.separator+"util" + File.separator + "test.txt";
			
			File file = new File(pathName);
			try {
				boolean res = file.createNewFile();
				if(res) {
					System.out.println("���ϻ�������");
				}else {
					System.out.println("���ϻ�������1");
				}
			} catch (IOException e) {
				System.out.println("���ϻ�������2");
				System.out.println("���ϰ�ΰ� Ʋ�Ƚ��ϴ�.");
			}

			
			System.out.println("=============================================");
			
	String pathName2 = "c:"+ File.separator+"Study"+ File.separator+"util" + File.separator + "test";
			
			File file2 = new File(pathName2);
			
				boolean res2 = file2.mkdir();
				if(res2) {
					System.out.println("���丮��������");
				}else {
					// ��ΰ� Ʋ���ų� ���� ���丮�� ������ ����
					System.out.println("���丮��������");
				}
			
				System.out.println("====================����1=========================");
			
				
			// ���� ����, ���丮 ���� => delete()
				
				String pathName3 = "c:"+ File.separator+"Study"+ File.separator+"util" + File.separator + "test.txt";
				
				File file3 = new File(pathName3);
		
					boolean res3 = file.delete();
					if(res3) {
						System.out.println("���� ���� ����");
					}else {
						System.out.println("���� ���� ����");
					}
			
					System.out.println("==========================����2===================");
					
					String pathName4 = "c:"+ File.separator+"Study"+ File.separator+"util" + File.separator + "test";
					
					File file4 = new File(pathName4);
					
						boolean res4 = file2.delete();
						if(res2) {
							System.out.println("���丮��������");
						}else {
							// ��ΰ� Ʋ���ų� ���� ���丮�� ������ ����
							System.out.println("���丮��������");
						}
					
					
					
				
			
		}
}
