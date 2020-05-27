package com.ict.edu9;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Input {
		public static void main(String[] args) {
			
			
			String pathname
			="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO13.txt";  
			File file = new File(pathname);
			
			
			FileInputStream fos = null;
			BufferedInputStream bos = null;
			ObjectInputStream oos = null;
			
			
			
			
			try {
				
				fos = new FileInputStream(file);
				bos = new BufferedInputStream(fos);
				oos = new ObjectInputStream(bos);
				
				VO vo = (VO) oos.readObject();
				
				System.out.println(vo.getName());
				System.out.println(vo.getAge());
				System.out.println(vo.getWeight());
				System.out.println(vo.isGender());
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					oos.close();
					bos.close();
					fos.close();
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
			
		}
}
