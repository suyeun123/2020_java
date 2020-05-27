package com.ict.edu7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Output {

			public static void main(String[] args) {
				
				
				
				String pathname
				="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO10.txt";  
				File file = new File(pathname);
				
				
				FileOutputStream fos = null;
				BufferedOutputStream bos =null;
				ObjectOutputStream oos = null;
				
				
				
				
				try {
					fos = new FileOutputStream(file);
					bos = new BufferedOutputStream(fos);
					oos = new ObjectOutputStream(bos);
					
					
					// ¿©·¯°³ÀÇ °´Ã¼ Á¤º¸¸¦ ´ã¾Æº¸ÀÚ
					VO vo1 = new VO("Æë¼ö",6,70.4,true);
					VO vo2 = new VO("Æëµµ",9,4.4,false);
					VO vo3 = new VO("Æëµµ¸®",2,72.4,true);
					VO vo4 = new VO("Æë¼ö¸®",12,78.4,false);
					VO vo5 = new VO("Æëµµ¶óÀÌ",112,79.4,true);
					
					ArrayList<VO> list = new ArrayList<VO>();
					list.add(vo1);
					list.add(vo2);
					list.add(vo3);
					list.add(vo4);
					list.add(vo5);
					
					
					// °´Ã¼ Á÷·ÄÈ­
					oos.writeObject(list);
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
