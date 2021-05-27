package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private boolean success = false;
	private Connection con = null;
	private PreparedStatement pstmt = null;

	// 1. MemberDAO 변수인 single을 static 변수로 설정
	private static MemberDAO single;

	// 2. 생성자의 접근한정자를 private으로 설정
	// 이유 : 외부에서 객체생성 못하게 하기 위함
	private MemberDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("@@@@드라이브 로드 성공@@@@");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패");
		}
	}

	// MemberDAO의 객체는 getInstance() 메서드로만 생성
	// getInstance() 메서드의 구현은 MemberDAO 객체를
	// 한개만 생성할 수 있도록 만들어야함
	// static 메서드로 구현한 이유는 MemberDAO 객체를 외부에서
	// 생성할 수 없기 때문이다.
	public static MemberDAO getInstance() {
		if (single == null) {
			single = new MemberDAO();
		}
		return single;
	}

	public boolean insert(MemberDTO dto) {
		// 2. 데이터베이스와 연결하는 Connection 객체 생성
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", // url
					"kpc12", // user
					"kpc1212"); // password
			System.out.println("$$$$$$$ 데이터 베이스 연결 성공 $$$$$$$");

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?,?,?)"); // 세미콜론 붙이면 안됨.
			pstmt = con.prepareStatement(sql.toString());


			// 4. 바인딩 변수 설정하기
			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getAddr());
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

	public boolean update(MemberDTO dto) {
		try {
			// 2. 데이터 베이스와 연결할 수 있는 Connection 객체를 생성

			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			System.out.println("@@@@데이터베이스 연결 성공@@@@");

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 설정
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setInt(index, dto.getNum());
			pstmt.executeUpdate();
			success = true;
			// 5. SQL문을 전송

			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수" + resultCount);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 6. 모든 자원을 반납

		finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return success;
	}

	public boolean delete(int num) {
		// 2. 데이터베이스와 연결할 수 있는 connection 객체 생성
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			// 3. sql을 전송할 수 있는 PreparedStatement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num= ? ");
			pstmt = con.prepareStatement(sql.toString());
			// 4. 바인딩 변수를 설정
			int index = 1;
			pstmt.setInt(index, num);
			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	public ArrayList<MemberDTO> select(int start, int len) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3. sql문을 전송할 수 있는 PreparedStatement 객체 생성

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT num, NAME,addr ");
		sql.append("FROM member ");
		sql.append("ORDER BY num desc ");
		sql.append("LIMIT ?,? ");

		try {
			pstmt = con.prepareStatement(sql.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. 바인딩 변수 설정
		try {
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index, len);

			// 5. sql문 전송하여(executeQuery) ResultSet 객체 생성

			rs = pstmt.executeQuery();

			// 6. ResultSet에서 데이터 추출 -> getXXX(index)

			while (rs.next()) {
				int num = rs.getInt(1); // or rs.getInt("칼럼명")
				String name = rs.getString(2); // or rs.getString("칼럼명")
				String addr = rs.getString(3); // or rs.getString("칼럼명")
				System.out.printf("%d, %s, %s \n", num, name, addr);
				list.add(new MemberDTO(num, name, addr));
			}
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
		return list;
	}

}
