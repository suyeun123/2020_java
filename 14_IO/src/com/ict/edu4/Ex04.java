package com.ict.edu4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// BufferedReader : �ӵ����
//  readLine() => ���پ� �д´�. ���̻� ���� �� ������ null �̵ȴ�. 
public class Ex04 {
			public static void main(String[] args) {
				
				String pathname
				="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO07.txt";  
				File file = new File(pathname);
				
				FileReader fr = null;
				BufferedReader br = null;
				
				
				try {
					
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					
					// �����б�
//					String msg = br.readLine();
//					System.out.println(msg);
					
					// �����б�
					
					String msg = null;
					String str = "";
					// String�� ���� �����ؼ� �������� �ʴ°��� ����.
					
					StringBuffer sb = new StringBuffer(); 
					while((msg = br.readLine()) != null) {
						
						// ����
//						System.out.println(msg);
						
						// �����ϱ�
//						str += str  + msg + "\n" ;
//						str = str.concat(msg+"\n");
					
						sb.append(msg+"\n");
						
						
						
					}
					System.out.println(sb.toString());
					
				} catch (Exception e) {
					System.out.println(e);
				
				}finally {
					try {
						br.close();
						fr.close();
					} catch (Exception e2) {
						System.out.println(e2);
					}
				}
				
				
				
				
				
				
				
				
			}
}
