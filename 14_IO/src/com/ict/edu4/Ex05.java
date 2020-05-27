package com.ict.edu4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

//  PrintWriter : ����Ʈ��Ʈ��, ���ڽ�Ʈ�� ��� ���ڷ� ���� �� �ִ�.

public class Ex05 {
	
		public static void main(String[] args) {
			
			String pathname
			="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO08.txt";  
			File file = new File(pathname);
			
			
			FileWriter fw = null;
			BufferedWriter bw = null;
			PrintWriter pw = null;
			
			try {
			
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				
				pw.println("PrintWriter�� ������ �����Ѵ�.");
				pw.print(true);
				pw.print(12345);
				
				pw.flush();
				
			} catch (Exception e) {
			}finally {
				try {
					fw.close();
					bw.close();
					pw.close();
				} catch (Exception e2) {
						
				}
			}
			
			
			
		}
}
