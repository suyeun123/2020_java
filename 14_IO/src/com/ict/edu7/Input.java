package com.ict.edu7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class Input {
	
	public static void main(String[] args) {
		
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO10.txt";  
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream oos=null;
		
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			oos = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) oos.readObject();
			for (VO k : list) {
				System.out.print(k.getName()+ " ");
				System.out.print(k.getAge()+ " ");
				System.out.print(k.getWeight()+ " ");
				System.out.println(k.isGender());
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
	}


	
	
}

