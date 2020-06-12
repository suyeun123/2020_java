package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			// ��������
			String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
			String user = "c##happysuyeun";
			String password = "1212";

			conn = DriverManager.getConnection(url, user, password);

			// SQL��
			String sql = "update members set m_pw = 'p1111' where idx = 3";

			// ���� ����
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			
			if(result > 0) {
				
				System.out.println("���ż���");
				
				sql = "select * from members order by idx";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6).substring(0,10));
				}
				
				
			}else {
				System.out.println("���� ����");
			}
			
		} catch (Exception e) {
				System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}

	}
}
