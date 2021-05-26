package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		// 1. 드라이브를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("@@@@드라이브 로드 성공@@@@");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패");
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			// 2. 데이터 베이스와 연결할 수 있는 Connection 객체를 생성
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1212");
			System.out.println("@@@@데이터베이스 연결 성공@@@@");
			
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 설정
			int index = 1;
			pstmt.setString(index++, "두테르테2");
			pstmt.setString(index++, "필리핀2");
			pstmt.setInt(index, 11);
			
			// 5. SQL문을 전송
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수" + resultCount);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 6. 모든 자원을 반납
		
		finally {
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		

		
	}
}
