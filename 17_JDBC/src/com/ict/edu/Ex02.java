package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {

		public static void main(String[] args) {
			
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			int result = 0;
			
			
			try {
				
				// 드라이버 로딩
				Class.forName("oracle.jdbc.OracleDriver");
				
				// 접속정보
				String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
				String user = "c##happysuyeun" ;
				String password = "1212";
				
				conn = DriverManager.getConnection(url, user, password);
				
				
				// SQL문
				String sql = "select * from members where idx = 3";
//				String sql = "select * from members where m_name like '펭%'";
				
				// 구문 생성
				stmt = conn.createStatement();
				
				// sql 담아서 보내고 결과받기
				rs = stmt.executeQuery(sql);
				
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
					stmt.close();
					conn.close();
					
				} catch (Exception e2) {
					
				}
			}
			
		}
	
}
