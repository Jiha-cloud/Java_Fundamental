package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDeleteDemo {
	public static void main(String[] args) {
		// 1. 드라이버를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = null;
			PreparedStatement pstmt = null;
			System.out.println("@@@ 데이터 베이스 로드 성공 @@@");

			// 2. 데이터베이스와 연결할 수 있는 connection 객체 생성
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 3. sql을 전송할 수 있는 PreparedStatement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num= ? ");

			// 4. 바인딩 변수를 설정
			int index = 1;
			try {
				pstmt.setString(index, String.valueOf(11));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			int resultCount = 0;
			try {
				resultCount = pstmt.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("갱신된 행의 수 : " + resultCount);
			try {
				pstmt = con.prepareStatement(sql.toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (con != null)
					if (pstmt != null)
						try {
							con.close();
							pstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터 베이스 로드 실패");
		}

		// 5. sql문 전송
		// 6. 모든 자원을 반납
	}
}
