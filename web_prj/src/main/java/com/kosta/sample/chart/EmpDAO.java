package com.kosta.sample.chart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.kosta.sample.board.BoardVO;
import com.kosta.sample.common.MyOracleConnection;

public class EmpDAO {
	public ArrayList<EmpVO> empSelect() {
		Connection conn = null;
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection();  //클래스 분리시켜놓아서 인스턴스 생성해서 사용
		try {
			//---------------DBCP를 사용한 DB 연결 -----------------------
			//conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();  
			String sql = "select empno, ename, nvl(sal,0) as sal from emp";
			pstmt = conn.prepareStatement(sql);
			rs =  pstmt.executeQuery();
			while(rs.next()) {
				EmpVO evo = new EmpVO();
				evo.setEmpno(rs.getInt("empno"));
				evo.setEname(rs.getString("ename"));
				evo.setSal(rs.getInt("sal"));
				list.add(evo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt, rs);
		}
		return list;
	}
	
//	public static void main(String[] args) {
//		EmpDAO dao = new EmpDAO();
//		ArrayList<EmpVO> list = dao.empSelect();
//		System.out.println("총:" + list.size());
//		for(EmpVO evo  : list) {
//			System.out.println(evo.getSal());
//		}
//	}
}
