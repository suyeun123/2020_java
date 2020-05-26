package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {

	
	public static void main(String[] args) {
		
		
		String pathname ="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO02.txt";  
		File file = new File(pathname);
		
		
		Ex04 sc = new Ex04();
		String str = new String();
		System.out.println(str);
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			String str1 = new String(b);
			System.out.println(str1);
			
			
			
		} catch (Exception e) {
		}finally {
		
		}		
		
	}
		
	
	
}
