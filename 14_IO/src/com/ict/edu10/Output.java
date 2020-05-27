package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Output {

	public static void main(String[] args) {
		
		
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO14.txt";  
		File file = new File(pathname);
		
		
		FileOutputStream fis = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		
		
		try {
			
			fis = new FileOutputStream(file);
			bos = new BufferedOutputStream(fis);
			oos = new ObjectOutputStream(bos);
			
//			VO vo = new VO(", , ,");
			
			
			ArrayList<VO> list = new ArrayList<VO>();
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println();
				
				
			}
			
			oos.writeObject(vo);
			oos.flush();
			
			
	
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				oos.close();
				bos.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
