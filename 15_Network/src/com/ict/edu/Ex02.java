package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL (Uniform Resource Locator) 클래스 : 인터넷에서 접근 가능한 자원의 주소
//											원격지 서버 자원의 결과만 가져온다.
// final 클래스이다. (상속안됨)
public class Ex02 {

	public static void main(String[] args) {
		
		// 해당 사이트가서 정보 읽기
		
		InputStream is = null;    //기계접속
		InputStreamReader isr = null;   //내가 보기
		BufferedReader br = null;  //글자받아서 버퍼
		
		// 내 pc에 정보 저장
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"data01.txt";  
		File file = new File(pathname);
		
		FileWriter fw = null;   //파일로쓰겠다.
		BufferedWriter bw = null;  //파일로 저장하겠다.
		
		try {
			URL url = new URL("http://www.naver.com");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("안내 : " + url.getUserInfo());
			System.out.println("------------------------------------------");
			
			is = url.openStream();
			isr = new InputStreamReader(is,"utf-8");
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
//				System.out.println(msg+"\n");
				sb = sb.append(msg+"\n");
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
