package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//�Ľ� : �Ľ��� � ������(����, html ��)���� 
//���� ���ϴ� �����͸� Ư�� �����̳� ������ ������ �����ϴ� ���� ���Ѵ�.

//JSON : JSON(���̽�)�� �Ӽ�-�� �� �Ǵ� "Ű-�� ��"���� �̷���� 
//������ ������Ʈ�� �����ϱ� ���� �ΰ��� ���� �� �ִ� 
//�ؽ�Ʈ�� ����ϴ� ������ ǥ�� �����̴�. 
//�񵿱� ������/���� ���(AJAX)�� ����, �аԴ� XML�� ��ü�ϴ� �ֿ� ������ �����̴�

public class Ex06_01 {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		// ���Ϸ� ����
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "������2.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			URL url = 
					  new URL
					  ("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				// System.out.println(msg);
				sb.append(msg + "\n");
			}
			
			// json ���� �б� : json�� �д� �ܺζ��̺귯�� �����ϱ�
			// �ش�������Ʈ���� ���콺 ������ - Build path-
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject) obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");
			
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < j_arr.size(); i++) {
				JSONObject obj3 = (JSONObject)(j_arr.get(i));
				String name = (String) obj3.get("LBRRY_NAME");
				String phone = (String) obj3.get("TEL_NO");
				String addr = (String) obj3.get("ADRES");
				
				sb2.append(name+"\t"+phone+"\t"+"\n");
				System.out.println(name+"\t"+phone+"\t"+addr+"\n");
				
			}
			// ���Ϸ� �����ϱ�
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb2.toString());
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				fw.close();
				bw.close();
				br.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
