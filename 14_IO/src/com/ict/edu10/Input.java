package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Input {
			public static void main(String[] args) {
				
				
				String pathname
				="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO14.txt";  
				File file = new File(pathname);
				
				
				FileInputStream fis = null;
				BufferedInputStream bos = null;
				ObjectInputStream oos = null;
				
				
				try {
					
					
					fis = new FileInputStream(file);
					bos = new BufferedInputStream(fis);
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
						
						fis.close();
						bos.close();
						oos.close();
						
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		
}
