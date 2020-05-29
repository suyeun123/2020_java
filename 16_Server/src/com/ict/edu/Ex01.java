package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// �ڹ������ ���� ���, ������ �б�, ����, ���� �������̽� ���� �̴�.
// ��Ʈ : ���ο� �ܺθ� �����ϴ� ����Ʈ ������ �Ѵ�.
//        0 - 65535, 0-1024�� ����ڰ� �������� �ʴ´�.
// ���� : Serversocket, Ŭ���̾�Ʈ : Socket

public class Ex01 {
			public static void main(String[] args) {
				
				
				try {
					ServerSocket ss = new ServerSocket(7777);
					System.out.println("��������~~^0^~~~");
					
					// Ŭ���̾�Ʈ�� �����Ҷ����� ��ٸ���
					// �������ϸ� �������� �ϳ� �����.
					// ������(s)�� ������ Ŭ���̾�Ʈ�� ������ ������ �ִ�.
					Socket s = ss.accept();
					
					
					// Ŭ���̾�Ʈ�� ���� ���� ���
					String ip = s.getInetAddress().getHostAddress();
					String name = s.getInetAddress().getHostName();
					
					System.out.println("IP :" + ip);
					System.out.println("NAME :" + name);
					System.out.println("���� : ����~");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				
				
				
				
				
			}
}
