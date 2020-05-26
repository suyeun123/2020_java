package com.ict.edu2;

import java.io.File;
import java.io.FileOutputStream;

public class Ex04 {

	public static void main(String[] args) {
		
		String pathname ="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO02.txt";  
		File file = new File(pathname);
		
		
		FileOutputStream fis = null;
		
		try {
			fis = new FileOutputStream(file);
			String str = "Phone : 010-9777-1111 \n이름 : 홍길동 \n 나이 : 99 ";
			byte[] b= str.getBytes();
			fis.write(b);
			fis.flush();
		} catch (Exception e) {
		} finally {
			try {
				if (fis != null)fis.close(); {
					
				}
			}catch (Exception e2) {
		}
		
		
		
	
		
		
		}}
	
	
}
