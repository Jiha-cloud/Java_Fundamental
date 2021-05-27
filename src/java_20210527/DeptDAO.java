package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {
	private static DeptDAO single;
	private boolean success = false;
	private Connection con = null;
	private PreparedStatement pstmt = null;

	private DeptDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println(" 드라이브 로드 성공 ");
		} catch (ClassNotFoundException e) {
			System.err.println(" 드라이브 로드 실패 ");
		}
	}

	public static DeptDAO getInstance() {
		if (single == null) {
			single = new DeptDAO();
		}
		return single;
	}

	public boolean insert(DeptDTO dto) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");
			System.out.println(" 데이터 베이스 연결 성공 ");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept(deptno, dname, loc) ");
			sql.append("VALUES (?, ?, ?) ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getLoc());
			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
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

	public boolean update(DeptDTO dto) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");

			System.out.println(" 데이터 베이스 연결 성공");

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ? ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());
			pstmt.setInt(index, dto.getNo());
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

	public boolean delete(int no) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");

			System.out.println(" 데이터 베이스 연결성공");

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM dept ");
			sql.append("WHERE deptno= ? ");
			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, no);
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

	public ArrayList<DeptDTO> select(int start, int len) {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");

			System.out.println(" 데이터 베이스 연결 성공");

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno ");
			sql.append("LIMIT ?, ? ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index, len);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%d %s %s \n", no, name, loc);
				list.add(new DeptDTO(no, name, loc));

			}
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
		return list;
	}
}
