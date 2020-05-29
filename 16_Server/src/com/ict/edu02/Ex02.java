package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// ���ڼ��� : ���� ������ �״�� �����ش�.
public class Ex02 implements Runnable{

		ServerSocket ss = null;
		
		// ������ �ޱ����� ��Ʈ�� ó�� (���ڽ�Ʈ��)
		
		InputStream in;
		InputStreamReader isr;
		BufferedReader br;
		
		OutputStream out;
		OutputStreamWriter osw;
		BufferedWriter bw;
		
		
	public Ex02() {

		
		try {
			ss = new ServerSocket(7777);
			System.out.println("���������");
			
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				Socket s= ss.accept();
				
				// Ŭ���̾�Ʈ�� ���ڸ� ������.
				in = s.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				System.out.println(msg);
				System.out.println("�������� :" + msg);
				
				
				// Ŭ���̾�Ʈ���� ������
				out = s.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
				msg += System.getProperty("Line.separator");
				bw.write(msg);
				bw.flush();
				
				
				
			}
		} catch (Exception e) {
				System.out.println(e);
		}
	}

			
	public static void main(String[] args) {
		
		
		new Ex02();
		
		
		
		
		
		
		
	}
	
	
}
