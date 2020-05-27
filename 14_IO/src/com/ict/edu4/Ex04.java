package com.ict.edu4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// BufferedReader : 속도향상
//  readLine() => 한줄씩 읽는다. 더이상 읽을 수 없을때 null 이된다. 
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
					
					
					// 한줄읽기
//					String msg = br.readLine();
//					System.out.println(msg);
					
					// 전부읽기
					
					String msg = null;
					String str = "";
					// String은 원래 누적해서 저장하지 않는것이 좋다.
					
					StringBuffer sb = new StringBuffer(); 
					while((msg = br.readLine()) != null) {
						
						// 찍어보기
//						System.out.println(msg);
						
						// 저장하기
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
