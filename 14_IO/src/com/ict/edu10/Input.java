package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.ict.edu8.VO;

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
					
					ArrayList<VO> list = (ArrayList<VO>) oos.readObject();
					
					for (VO k : list) {
						System.out.print(k.getName() + "");
						System.out.print(k.getSum() + "");
						System.out.print(k.getAvg()+ "");
						System.out.println(k.getHak());
					}
					
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
