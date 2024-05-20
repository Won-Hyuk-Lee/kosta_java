package com.kosta.sample.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.kosta.sample.jdbc.EmpVO;


import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class BoardJDBCTest {
	//오라클 연결 메서드 = give : parameter
	//              = take  : return

	private static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String DB_ID = "it";
	private static final String DB_PW = "0000";

	
	/**
	 * -------------------------------------------------------------
	 * DBCP(DataBase Connection Pool) 
	 * 	 - DB connection을 미리 만들어 풀로 관리하는 서비스
	 *   - Database connection pooling services.
	 * DataSource
	 * 	 - 어플리케이션과 데이터베이스의 인터페이스
	 *   - DataSource를 사용해 DBCP(pool)에 있는 connection 사용
	 *   - javax.sql.DataSource 
	 * -------------------------------------------------------------   
	 * java.lang.Object
	 *   -- [i]implements javax.sql.DataSource
	 *	    -- [c] OracleDataSource
	 *	        --[c] OracleConnectionPoolDataSource
     * * -------------------------------------------------------------
     */


	public DataSource myOracleDataSource() {
		OracleConnectionPoolDataSource ds = null;
		try { 
			ds = new OracleConnectionPoolDataSource();
			ds.setURL(DB_URL);
			ds.setUser(DB_ID);
			ds.setPassword(DB_PW);
		} catch( SQLException e) {
			e.printStackTrace();
		}
		return ds;			
	}	
	
	
	public Connection oracleConn () {

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
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}


	public void oracleClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs!=null) rs.close();
			if (pstmt!=null) pstmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void oracleClose(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt!=null) pstmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void oracleClose(Connection conn, Statement stmt) {
		try {
			if (stmt!=null) stmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	//public ArrayList<EmpVO> boardSelect(Connection conn) {
	public ArrayList<EmpVO> boardSelect() {	
		Connection conn = null;
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		DataSource ds = null;
		try {
			//conn = oracleConn();  //---------------------메서드 호출을 통해 conn 받아오기
			
			//---------------DBCP를 사용한 DB 연결 -----------------------
			ds = myOracleDataSource();
			conn = ds.getConnection();  //javax.sql.DataSource
			                            //OracleConnectionPoolDataSource.getPooledConnection()
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs =  pstmt.executeQuery();

			//------------------------------------------------------
			// ArrayList(EmpVO) 
			//------------------------------------------------------
			//while(rs.next() == true) {
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracleClose(conn, pstmt, rs);
		}
		return list;
	}

//	public void createTableTest() {
//		Connection conn = null;
//		Statement stmt  = null;
//		try {
//			conn = oracleConn();  //---------------------메서드 호출을 통해 conn 받아오기
//			String sql = "create table MYTEST2(seq number, id varchar2(10))";
//			stmt = conn.createStatement();
//			stmt.executeUpdate(sql);
//		} catch (SQLException e) {
//			System.out.println("이미 테이블이 생성되어 있습니다.");
//			e.printStackTrace();
//		} finally {
//			
//			oracleClose(conn, stmt);
//		}
//	}
/**
	----------------------------------------------------------------------------------
		Statement createStatement()  		vs.  PreparedStatement prepareStatement()
	----------------------------------------------------------------------------------
파라미터  "select * from emp where empno="+no 		 "select * from emp where empno=?"
컴파일    실행시점에 컴파일                            사전컴파일(DB는 컴파일없이 바로 실행) - 재사용,캐시
속도                                              효율적
바이너리데이터    X                                  O
주사용처   SQL문의 변경이 거의 없는 경우(DDL)            SQL문의 변경이 빈번한 경우(DML의 조건절 등) 
문법 	     stmt = conn.createStatement(); 		 pstmt = conn.prepareStatement(sql);
												 pstmt.setInt(1, empno);  //--------런타임시 : 동적 바인딩
		 stmt.executeUpdate(sql);				 delCount =  pstmt.executeUpdate();
		 
보안      상당히 취약(SQL Injection)  
         "select * from user where id='" + id + "'";  
         id : __ or id is not null
           -> select * from user where id='' or id is not null;  
              
	---------------------------------------------------------------
*/
	
	
	/**
    java.sql.Interface Connection
	public interface Connection {
	       public abstract PreparedStatement prepareStatement(String sql); 
	       public int                        executeUpdate();  
	       
	       public abstract Statement createStatement(); ***
	       pubic  int      executeUpdate(String sql);   ***
	}
	*/
	
//	public int boardDelete(int empno) {
//		Connection conn = null;
//		Statement stmt  = null;
//		int delCount = 0;
//		try {
//			conn = oracleConn();  //---------------------메서드 호출을 통해 conn 받아오기
//			//String sql = "delete from emp where empno=" + empno;
//			String sql = "delete from emp where empno="+empno;
//			stmt = conn.createStatement();
//			delCount =  stmt.executeUpdate(sql);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			oracleClose(conn, stmt);
//		}
//		return delCount;
//	}
	
//	---------------------------------------------------------------
//	PreparedStatement prepareStatement()
//	---------------------------------------------------------------
	/**
    java.sql.Interface Connection
	public interface Connection {
	       public abstract PreparedStatement prepareStatement(String sql); *** 
	       public int                        executeUpdate();              *** 
	       
	       public abstract Statement createStatement(); 
	       pubic  int      executeUpdate(String sql);  
	}
   */
	public int boardDelete(int empno) {
		Connection conn = null;
		PreparedStatement pstmt  = null;
		int delCount = 0;
		try {
			conn = oracleConn();  //---------------------메서드 호출을 통해 conn 받아오기
			
			String sql = "delete from emp where empno=?";  //인덱스에서 누락된 IN 또는 OUT 매개변수:: 2
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);  //--------런타임시 : 동적 바인딩
									 // set바인딩값타입(1번째물음표에 , 바인딩될값) 							
			delCount =  pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracleClose(conn, pstmt);
		}
		return delCount;
	}

	public static void main(String[] args) {
		BoardJDBCTest obj = new BoardJDBCTest();
		//테이블 생성 테스트
		//obj.createTableTest();
		
		int delCount =  obj.boardDelete(7499);
		System.out.println("총 삭제:" + delCount);

		ArrayList<EmpVO> list = obj.boardSelect();
		System.out.println("총:" + list.size()); 
		for(int i=0; i<list.size(); i++) {
			int a    = list.get(i).getEmpno();
			String b = list.get(i).getEname();
			System.out.println(a + "\t" + b);
		}

	}



}
