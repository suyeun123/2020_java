package com.ict.edu9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Output {

	public static void main(String[] args) {
		
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO13.txt";  
		File file = new File(pathname);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		
		
		try {

			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			VO vo = new VO("�±Ǻ���",25,190.1,true);
			oos.writeObject(vo);
			oos.flush();
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
