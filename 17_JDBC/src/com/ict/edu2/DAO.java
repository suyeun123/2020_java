package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// DAO : Data Access Object 
// DataBase�� data�� �����ϱ� ���� ��ü
// - CRUD �۾�(insert, update, delete, select)
//   �� ó���ϴ� �޼ҵ带 ���� �����Ѵ�.

public class DAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	int result ;
	
	// �̱��� ���� : �ϳ��� �ν��Ͻ����� �����ϰ� ����� �� �ִ�.
	// �ϳ��� ��ü�� �����ϰ� ����ؾ� �Ҷ�, ������ �� �ִ�����.
	
	//
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
		return dao;
				
	}
	
	
	// ����
	public Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.67:1521:xe";
			String user = "c##happysuyeun";
			String password = "1212";
			conn = DriverManager.getConnection(url, user, password);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
	}
	// select
	public void getSelect() {
		try {
			conn = getConnection();
			
			String sql  = "select * from members order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.println(rs.getString(6).substring(0, 10));
			}
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}
	}
	// insert
	
	public void getInsert(String m_id, String m_pw, String m_name, String m_age) {
		try {
			conn = getConnection();
			
			String sql = "insert into members "
					+ "values(members_seq.nextval," + m_id + "," + m_pw + "," + m_name + "," + m_age + ", sysdate)";
			
					stmt = conn.createStatement();
					int result = stmt.executeUpdate(sql);
					if(result>0) {
						getSelect();
					}else {	
						System.out.println(" ���� ���� ");
					}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// delete
		public void getDelete(String idx) {
			try {
				conn = getConnection();

				String sql = "delete from members where idx = " + idx;

				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					getSelect();
				} else {
					System.out.println("���� ���� ");
				}
			} catch (Exception e) {
				System.out.println("���� ���� 2");
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		// update
		public void getUpdate(String idx, String age) {
			try {
				conn = getConnection();

				String sql = "update members set m_age = "+ age +" where idx = " + idx;

				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					getSelect();
				} else {
					System.out.println("���� ���� ");
				}
			} catch (Exception e) {
				System.out.println("���� ���� 2");
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
