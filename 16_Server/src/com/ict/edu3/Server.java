package com.ict.edu3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {

	ServerSocket ss = null;
	
	// ������ �ޱ� ���� ��Ʈ��
	InputStream in;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	// �������� ������ ������ �޾Ƽ� ó���ϱ� ���� �÷���
	ArrayList<Player> list;
	
	public Server() {
			try {
				list = new ArrayList<Player>();
				ss = new ServerSocket(7788);
				System.out.println("��Ƽ ���� ��� �� ����");
				new Thread(this).start();
				
			} catch (Exception e) {
			}
	}
	
	
	
	@Override
	public void run() {
		try {
			while(true) {
				Socket s = ss.accept();
				Player player = new Player(s, this);
				new Thread(player).start();
				list.add(player);
			}
		} catch (Exception e) {
		}
		
	}

	// ����Ʈ�ȿ� �����ϴ� ��� Ŭ���̾�Ʈ�鿡�� �޽��� �����ϱ�
	public void sendMsg(String msg) {
		try {
			msg += System.getProperty("line.separator");
			for (Player k : list) {
				k.bw.write(msg);
				k.bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	   
	}
	
	public static void main(String[] args) {
		
		new Server();
		
		
		
		
	}
	
	
}
