package com.ict.edu4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// ���ڽ�Ʈ�� : ��� ó���� 2byte�� ó��
// 		���  : ���� ��� ���� ������ ���������� ����� �� ����
//  �ֻ��� Ŭ���� : Reader(�Է�), Writer(���)

// FileOutputStream : 1byteó��, write(int b), write(byte[] b)
// FileWriter       : 2byteó��, write(int b), write(char[] b), write(String str)
// �ƽ�Ű�ڵ�, �����ڵ� => int
public class Ex01 {
				public static void main(String[] args) {
					
					String pathname
					="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO06.txt";  
					File file = new File(pathname);
					
					
					FileWriter fw = null;
					
					try {
							fw = new FileWriter(file);
							// ����
							fw.write(97);
							// ���ڴ�� char
							fw.write('e');
							// �迭
							char[] c = {'j','a','v','a'};
							fw.write(c);
							//String
							fw.write("korea\n");
							fw.write("���ѹα�\n");
							fw.write("����\n");
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
