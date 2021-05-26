package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		
		// 1. 드라이버를 로드한다.

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("$$$$$$$드라이버 로드 성공$$$$$$$");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패 : " + e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 2. 데이터베이스와 연결하는 Connection 객체 생성
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", // url
					"kpc12", // user
					"kpc1212"); // password
			System.out.println("$$$$$$$데이터 베이스 연결 성공$$$$$$$");
			
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?,?,?)"); // 세미콜론 붙이면 안됨.
			
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수 설정하기
			pstmt.setInt(1,11);
			pstmt.setString(2, "두테르테");
			pstmt.setString(3, "필리핑");
			
			// 5. sql문을 전송한다.
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수: " + resultCount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null)
			if(pstmt != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
