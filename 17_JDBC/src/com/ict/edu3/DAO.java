package com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
			
		}
		return conn;
	}
	// select
		public ArrayList<VO> getSelect() {
			// vo�� ���� �÷��� ����� 
			ArrayList<VO> list = new ArrayList<VO>();
			try {
				conn = getConnection();
				String sql = "select * from members order by idx";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					//�����͸� VO�� ��´�.
					VO vo = new VO();
					vo.setIdx(rs.getString(1));
					vo.setM_id(rs.getString(2));
					vo.setM_pw(rs.getString(3));
					vo.setM_name(rs.getString(4));
					vo.setM_age(rs.getString(5));
					vo.setM_reg(rs.getString(6).substring(0, 10));
					list.add(vo);
				}
				// ����� main�޼ҵ忡�� ���� 
			} catch (Exception e) {
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
			return list;
		}

		// insert
		public ArrayList<VO> getInsert(String m_id, String m_pw, String m_name, String m_age) {
			ArrayList<VO> list = null;
			try {
				conn = getConnection();
				String sql = "insert into members " + "values(members_seq.nextval," + m_id + "," + m_pw + "," + m_name + ","
						+ m_age + ", sysdate)";
				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				
				if (result > 0) {
					list = getSelect();
				} else {
					System.out.println(" ���� ���� ");
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
			return list;
		}

		// delete
		public ArrayList<VO> getDelete(String idx) {
			ArrayList<VO> list = null;
			try {
				conn = getConnection();
				String sql = "delete from members where idx = " + idx;
				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				
				if (result > 0) {
					list = getSelect();
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
			return list;
		}

		// update
		public ArrayList<VO> getUpdate(String idx, String age) {
			ArrayList<VO> list = null;
			try {
				conn = getConnection();
				String sql = "update members set m_age = "+ age +" where idx = " + idx;
				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				
				if (result > 0) {
					list = getSelect();
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
			return list;
		}
	}
