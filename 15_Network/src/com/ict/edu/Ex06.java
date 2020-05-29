package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// ���̽� : �Ӽ�-�� �� �Ǵ� "Ű-�� ��"���� �̷���� ������ ������Ʈ��
//          �����ϱ� ���� �ΰ��� ���� �� �ִ� �ؽ�Ʈ�� ����ϴ� ������ ǥ�� �����̴�.
//          �񵿱� ������/���� ��� (AJAX)�� ����, �аԴ� XML(AJAX�� ���)�� ��ü�ϴ� �ֿ� ������ �����̴�.

public class Ex06 {
	private static final Object row = null;

	public static void main(String[] args) {
		BufferedReader br = null;
		
		// ���Ϸ� ����
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "������.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = 
				new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				// System.out.println(msg);
				sb.append(msg+"\n");
			}
			System.out.println("=========================================");
			//  json ���� �б� : json�� �д� �ܺζ��̺귯�� �����ϱ�
			// �ش�������Ʈ���� ���콺 ������ - Build path -
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject)obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");
			
			StringBuffer sb2 = new StringBuffer();
/*
			for (Object k : j_arr) {
				System.out.println(k);
				sb2.append(k+"\n");
			}
	*/		
		
			
			
			
			
//			// ���Ϸ� �����ϱ�
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb2.toString());
			bw.flush();
			
			
		} catch (Exception e) {
		} finally {
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
