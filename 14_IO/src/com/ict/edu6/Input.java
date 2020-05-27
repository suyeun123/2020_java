package com.ict.edu6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// ObjectInputStream : 객체 입력 스트림, 바이트 스트림
// readObject() => 역직렬화 메소드
// 받아서 읽는다. Input, VO클래스가 필요
public class Input {
		public static void main(String[] args) {
			
			String pathname
			="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO09.txt";  
			File file = new File(pathname);
			
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			ObjectInputStream oos=null;
			
			
			try {
				
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				oos = new ObjectInputStream(bis);
				
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
					bis.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
			
			
			
			
			
		}
}
