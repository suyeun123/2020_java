package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {

		public static void main(String[] args) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			Statement stmt = null;
			ResultSet rs = null;
			int result = 0;
			
			
			try {
				
				// ����̹� �ε�
				Class.forName("oracle.jdbc.OracleDriver");
				
				// ��������
				String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
				String user = "c##happysuyeun" ;
				String password = "1212";
				
				conn = DriverManager.getConnection(url, user, password);
				
				
				// SQL��
				// prepareStatement ������ ���� ������ ������ ���̵� ���� ��� �ϰ�
				// ?�� ǥ���Ѵ�.
				String sql = "select * from members where idx = ?";
//				String sql = "select * from members where m_name like '��%'";
				
				// ���� ����
//				stmt = conn.createStatement();
				pstmt = conn.prepareStatement(sql);
				
				
				// sql ��Ƽ� ������ ����ޱ�
//				rs = stmt.executeQuery(sql);
				
				pstmt = conn.prepareStatement(sql);
				
				// ���ε����� ä���
				// pstmt.setString(? ����, ?�� �� ������);
				pstmt.setString(1, "21");
				
				
				// sql ��Ƽ�����ޱ�
				rs= pstmt.executeQuery();
				
				
				while(rs.next()) {
					System.out.print(rs.getString("idx")+"\t");
					System.out.print(rs.getString("m_id")+"\t");
					System.out.print(rs.getString("m_pw")+"\t");
					System.out.print(rs.getString("m_name")+"\t");
					System.out.print(rs.getString("m_age")+"\t");
					System.out.println(rs.getString("m_reg").substring(0, 10));
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}finally {
				try {
					rs.close();
					pstmt.close();
					stmt.close();
					conn.close();
					
				} catch (Exception e2) {
					
				}
			}
			
		}
	
}
