package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
	public static void main(String[] args) {
		// 1. 드라이버 로드

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("@@@ 드라이버 로드 성공 @@@");

			// 2. 데이터 베이스와 연결하는 Connection 객체 생성

			Connection con = null;
			PreparedStatement pstmt = null;
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
				pstmt.setInt(index++, 0);
				pstmt.setInt(index, 2);
				
				// 5. sql문 전송하여(executeQuery) ResultSet 객체 생성

				rs = pstmt.executeQuery();

				// 6. ResultSet에서 데이터 추출 -> getXXX(index)

				while (rs.next()) {
					int num = rs.getInt(1); // or rs.getInt("칼럼명")
					String name = rs.getString(2); // or rs.getString("칼럼명")
					String addr = rs.getString(3); // or rs.getString("칼럼명")
					System.out.printf("%d, %s, %s \n", num, name, addr);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(con != null)
				if(pstmt != null)
					try {
						con.close();
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} 

		// 7. 모든 권한을 반납 시킴.
	}
}
