package com.kosta.sample.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.DriverManager;

public class JDBCCallTest {
	static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	static final String DB_ID = "it";
	static final String DB_PW = "0000";
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			if(conn != null) {
				System.out.println("conn ok");
			} else {
				System.out.println("faild");
			}
			
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs =  pstmt.executeQuery();
			
			//------------------------------------------------------
			// ArrayList(EmpVO) 
			//------------------------------------------------------
			ArrayList<EmpVO> list = new ArrayList<EmpVO>();
			while(rs.next() == true) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				list.add(vo);
			}
			
			System.out.println("총:" + list.size()); 
			for(int i=0; i<list.size(); i++) {
				int a    = list.get(i).getEmpno();
				String b = list.get(i).getEname();
				System.out.println(a + "\t" + b);
			}
			
			
			//------------------------------------------------------
			// ArrayList(HashMap)
			//------------------------------------------------------
//			ArrayList<HashMap<String,Object>> 밥상 = new ArrayList<HashMap<String,Object>>();
//			while(rs.next() == true) {
//				HashMap<String,Object> 식판 = new HashMap<String,Object>();
//				식판.put("empno", rs.getInt("empno"));
//				식판.put("ename", rs.getString("ename"));
//				밥상.add(식판);
//				//int    eno  = rs.getInt("empno");
//				//String name = rs.getString("ename");
//				//System.out.println(eno + "\t" + name);
//			}
//			
//			System.err.println("총:" + 밥상); //[{ename=SSSSMITH, empno=7369}, {ename=ALLEN, empno=7499}...]
//			System.out.println(밥상.size());
//			for(int i=0; i<밥상.size(); i++) {
//				int a    = (int)밥상.get(i).get("empno");
//				String b = (String)밥상.get(i).get("ename");
//				System.out.println(a + "\t" + b);
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			 
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		

	}

}
