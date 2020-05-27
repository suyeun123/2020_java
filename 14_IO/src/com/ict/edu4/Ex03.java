package com.ict.edu4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// FileInputStream : read() : int(아스키코드) => char형 변환, read(byte[] b)  
// FileReader      : read() : int(유니코드) => char형 변환, read(char[] b)

public class Ex03 {
		public static void main(String[] args) {
			
			
			
			String pathname
			="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO06.txt";  
			File file = new File(pathname);
			
			
			FileReader fr = null;
			
			
			try {
				fr = new FileReader(file);
				
				// 한 글자 읽기 : 모든 글자를 읽어 올 수 있다.
				
//				int k = fr.read();
//				System.out.println(k+":"+(char)(k));
				
				
				// 전체 읽기
				
//				int k = 0;
//				while ((k = fr.read()) != -1) {
//					System.out.print((char)(k));
//				}
				
//				// char[]
//				char[] c = new char[(int) file.length()];
//				fr.read(c);
//				for (char k : c) {
//					System.out.print(k);
//				}
//				
				
				// String 
				char[] c = new char[(int) file.length()];
				fr.read(c);
				
				String msg = new String(c);
				System.out.print(msg);
				
							
			} catch (Exception e) {
			}finally {
				try {
					fr.close();
				} catch (Exception e2) {
				}
			}
			
			
			
			
			
			
			
			
		}
}
