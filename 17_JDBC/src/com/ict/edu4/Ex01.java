package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// �ڹٿ� ����Ŭ�� �����ϱ� ���� ���̺귯���� ������Ʈ�� ����ϱ�

public class Ex01 {

		public static void main(String[] args) {
		
			// 1. java�� ����Ŭ�� ���� �� �� �ֵ��� �����ִ� Ŭ����
			Connection conn = null;
			// 2. SQL �ۼ�, ���� ����
			Statement stmt = null;
			
			PreparedStatement pstmt = null;
			
			// 3. select ���� ����� �� ����� �޴� Ŭ����
			//    select ���� ����� �׻� ���̺� �����̴�. ������, ���ڷ� �޴´�.
			ResultSet rs = null;  // select�� �϶� ���
			int result = 0;			// select�� ������ �� ���
			
			// 4. jdbc ����̹� �ε� : ����Ŭ, Mysql �� DBMS ���� ������ �ٸ���.
			
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
//				Class.forName("org.mariadb.jdbc.Driver");
				
				// �����ϱ� ���� ���� ����
				String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
				String user = "c##happysuyeun" ;
				String password = "1212";
				
				// 5. ����Ŭ ����
				conn = DriverManager.getConnection(url, user, password);
				
				// 6. sql �ۼ�
				String sql = "select * from members";
				
				// 7. sql �� ��Ƽ� ���� ���� ����
//				stmt = conn.createStatement();
				
				pstmt = conn.prepareStatement(sql);
				
				
				
				// 8. sql ������ sql�� ��Ƽ� ������ ����� �޴´�.
				// sql ���� select �϶�
//					rs = stmt.executeQuery(sql);
//				rs = pstmt.executeQuery();
					
					
				// sql ���� select�� �ƴҶ�
//					result = stmt.executeUpdate(sql);
					
					result = pstmt.executeUpdate();
				
				
					while(rs.next()) {
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.print(rs.getString(4)+"\t");
						System.out.print(rs.getInt(5)+"\t");
						System.out.println(rs.getString(6));
						
						
						/*
						System.out.print(rs.getInt("idx")+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.print(rs.getString(4)+"\t");
						System.out.print(rs.getInt(5)+"\t");
						System.out.println(rs.getString(6)+"\t");
						*/
					}
			} catch (Exception e) {
				
			}finally {
				try {
				rs.close();
				stmt.close();
				conn.close();
				pstmt.close();
				} catch (Exception e2) {
				}
			}
		}
}
