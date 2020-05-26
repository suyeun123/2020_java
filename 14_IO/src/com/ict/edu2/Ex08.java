package com.ict.edu2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
		public static void main(String[] args) {
			
			
			String pathname 
			="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO03.txt";  
			File file = new File(pathname);
			
			FileInputStream fis = null;
			// �ӵ� ����� ���� Buffer���, ȥ�ڼ��� ��� ����
			BufferedInputStream bis = null;
			
			
			try {
				// ��Ʈ�� ü�� ���
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
//				int m = bis.read();
//				System.out.println(m + ":"+ (char)(m));
				
				// ������ ��� ���� �б� : 
				// 1. while ����
//				int m = 0;
//				while((m = bis.read()) != -1) {
//					System.out.print((char)(m));
//				}
				
//				// 2. �迭
//				byte[] b = new byte[(int) file.length()];
//				bis.read(b);
//				for (byte k : b) {
//					System.out.print((char)(k));
//				}
				
				// 3. String
				
				byte[] b = new byte[(int) file.length()];
				bis.read(b);
				
				String msg = new String(b);
				System.out.println(msg);
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(bis != null) bis.close();
					if(fis != null) fis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
		}
}
