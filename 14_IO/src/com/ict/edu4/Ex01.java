package com.ict.edu4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 문자스트림 : 모든 처리를 2byte씩 처리
// 		대상  : 세계 모든 언어로 구성된 문서파일을 출력할 때 적합
//  최상위 클래스 : Reader(입력), Writer(출력)

// FileOutputStream : 1byte처리, write(int b), write(byte[] b)
// FileWriter       : 2byte처리, write(int b), write(char[] b), write(String str)
// 아스키코드, 유니코드 => int
public class Ex01 {
				public static void main(String[] args) {
					
					String pathname
					="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO06.txt";  
					File file = new File(pathname);
					
					
					FileWriter fw = null;
					
					try {
							fw = new FileWriter(file);
							// 숫자
							fw.write(97);
							// 숫자대신 char
							fw.write('e');
							// 배열
							char[] c = {'j','a','v','a'};
							fw.write(c);
							//String
							fw.write("korea\n");
							fw.write("대한민국\n");
							fw.write("大韓\n");
							fw.write("12345\n");
						
							fw.flush();
									
					} catch (Exception e) {
					}finally {
						try {
							fw.close();
						} catch (Exception e2) {
						}
					}
					
					
					
					
					
					
					
					
				}
}
