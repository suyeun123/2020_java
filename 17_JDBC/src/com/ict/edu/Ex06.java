package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);
		
		public static void getSelect() {
			try {
				
				String sql = "select * from members order by idx";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG\t");
				while(rs.next()) {
					
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getString(6).substring(0, 10));
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
		public static void getInsert() {
		
			try {
			System.out.println("정보를 입력하세요");
			System.out.print("아이디 :");
			String m_id = sc.next();
			
			System.out.println("패스워드 : ");
			String m_pw = sc.next();
			

			System.out.println("이름 : ");
			String m_name = sc.next();
			
			
			System.out.println("나이 : ");
			String m_age = sc.next();
			
			String sql = "insert into members" + "values(members_seq.nextval,"
			+ m_id+","+m_name+", "+m_age+",sysdate)";
			
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				getSelect();
				
			}else {
				System.out.println("삽입실패");
			}
			
		} catch (Exception e) {
			System.out.println("삽입실패2");
		}
		}
		public static void getDelete(String idx) {
			
			try {
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
		public static void main(String[] args) {
						
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");

				// 접속정보
				String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
				String user = "c##happysuyeun";
				String password = "1212";

				conn = DriverManager.getConnection(url, user, password);
				
				
				System.out.println("선택하시오");
				System.out.println("1. 테이블 데이터 보기");
				System.out.println("2. 테이블 데이터 삽입");
				System.out.println("3. 테이블 데이터 삭제");
				System.out.println("4. 테이블 데이터 수정");
				System.out.print(">>>    ");
				
				int su = sc.nextInt();
				
				
				switch (su) {
				case 1:   getSelect(); break;
				case 2: break;
				case 3: break;
				case 4: break;

				}
				System.out.println();
				System.out.println();
				System.out.println("수고하셨습니다!");
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					
					rs.close();
					stmt.close();
					conn.close();
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
		}
	
	
	
	
	
}
