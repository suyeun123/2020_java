package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.ict.edu8.VO;

public class Output {

	public static void main(String[] args) {
		
		
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO14.txt";  
		File file = new File(pathname);
		
		
		FileOutputStream fis = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			fis = new FileOutputStream(file);
			bos = new BufferedOutputStream(fis);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<VO> list = new ArrayList<VO>();
			
			while(true) {
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int kor = sc.nextInt();
				
				System.out.print("���� : ");
				int eng = sc.nextInt();
				
				System.out.print("���� : ");
				int math = sc.nextInt();
				
				VO vo = new VO(name, kor, eng, math);
				list.add(vo);
				
				System.out.print("����Ҳ�?(y/n)");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("n"))break;
				
			}
			oos.writeObject(list);
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
