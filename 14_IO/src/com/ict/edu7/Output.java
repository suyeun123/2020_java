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
					
					
					// �������� ��ü ������ ��ƺ���
					VO vo1 = new VO("���",6,70.4,true);
					VO vo2 = new VO("�뵵",9,4.4,false);
					VO vo3 = new VO("�뵵��",2,72.4,true);
					VO vo4 = new VO("�����",12,78.4,false);
					VO vo5 = new VO("�뵵����",112,79.4,true);
					
					ArrayList<VO> list = new ArrayList<VO>();
					list.add(vo1);
					list.add(vo2);
					list.add(vo3);
					list.add(vo4);
					list.add(vo5);
					
					
					// ��ü ����ȭ
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
