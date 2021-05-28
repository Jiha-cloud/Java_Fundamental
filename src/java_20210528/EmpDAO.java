package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private boolean success = false;
	private static EmpDAO single;
	private Connection con = null;
	private PreparedStatement pstmt = null;

	private EmpDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("로드 실패");
		}
	}

	public static EmpDAO getInstance() {
		if (single == null) {
			single = new EmpDAO();
		}
		return single;
	}

	public boolean insert(EmpDTO dto) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");

			System.out.println("데이터 베이스 연결 성공");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate,sal, comm,deptno) ");
			sql.append("VALUES (?, ?, ?, ?, curdate(), ?, ?, ?) ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index, dto.getDeptNo());
			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public boolean update(EmpDTO dto) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");
		
		
		System.out.println("데이터 베이스 연결 성공");

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE emp ");
		sql.append("SET ename = ?, job = ?, mgr = ?, hiredate = curdate(), sal = ?, comm= ?, deptno = ? ");
		sql.append("WHERE empno = ? ");

		pstmt = con.prepareStatement(sql.toString());
		
		int index = 1;
		pstmt.setString(index++, dto.getName());
		pstmt.setString(index++, dto.getJob());
		pstmt.setInt(index++, dto.getMgr());
		pstmt.setString(index++, dto.getName());
		pstmt.setString(index++, dto.getName());
		pstmt.setString(index++, dto.getName());
		pstmt.setString(index++, dto.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	public boolean delete(int no) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");
		

		System.out.println("데이터 베이스 연결 성공");

		StringBuilder sql = new StringBuilder();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	public ArrayList<EmpDTO> select(int start, int len) {
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");
		

		System.out.println("데이터 베이스 연결 성공");

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT empno, ename, job, mgr, DATE_FORMAT(hiredate, '%Y/%m/%d'), sal, nvl(comm,0), deptno ");
		sql.append("FROM emp ");
		sql.append("ORDER BY hiredate ");
		sql.append("LIMIT ?, ? ");
		
		pstmt = con.prepareStatement(sql.toString());
		
		int index = 1;
		pstmt.setInt(index++, start);
		pstmt.setInt(index, len);
		
		rs = pstmt.executeQuery();
		while(rs.next()) {
			index = 1;
			int no = rs.getInt(index++);
			String ename = rs.getString(index++);
			String job = rs.getString(index++);
			int mgr = rs.getInt(index++);
			String hiredate = rs.getString(index++);
			double sal = rs.getDouble(index++);
			double comm = rs.getDouble(index++);
			int deptno = rs.getInt(index);
			
			list.add(new EmpDTO(no, ename, job, mgr, hiredate, sal, comm, deptno));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		success = true;
		return list;
	}
}
