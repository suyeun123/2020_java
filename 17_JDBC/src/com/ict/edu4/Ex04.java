package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
		public static void main(String[] args) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int result = 0;
			
			
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				
				// ��������
				String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
				String user = "c##happysuyeun" ;
				String password = "1212";
				
				conn = DriverManager.getConnection(url, user, password);
				
				
				// SQL��
				String sql = "delete from members where idx = ?";

				
				// ���� ����
				pstmt = conn.prepareStatement(sql);
				
				// ���ε� ���� ä���
				pstmt.setString(1, "101");
				
				
				result = pstmt.executeUpdate(sql);
				if(result > 0) {
					sql = "select*from members order by idx";
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					
					while(rs.next()) {
					
						System.out.print(rs.getString(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.print(rs.getString(4)+"\t");
						System.out.print(rs.getString(5)+"\t");
						System.out.println(rs.getString(6));
					}
					
					
				}else {
					System.out.println("���� ����");
				}
				
				
				
			} catch (Exception e) {
				System.out.println(e);
			}finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
}
