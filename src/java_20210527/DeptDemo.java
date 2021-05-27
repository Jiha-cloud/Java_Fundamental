package java_20210527;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();

		/*
		 * boolean success = dao.insert(new DeptDTO(50, "Development", "LA")); if
		 * (success) { System.out.println("insert 성공"); } else {
		 * System.out.println("insert 실패"); }
		 */

		/*
		 * boolean success = dao.update(new DeptDTO(50, "Development1", "LA1")); if
		 * (success) { System.out.println("update 성공"); } else {
		 * System.out.println("update 실패"); }
		 */

		int num = 50;
		boolean success = dao.delete(num);
		if (success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}

		/*
		 * ArrayList<DeptDTO> list = dao.select(0, 10); for (DeptDTO dto : list) { int
		 * no = dto.getNo(); String name = dto.getName(); String loc = dto.getLoc();
		 * System.out.printf("%d %s %s \n", no, name, loc); }
		 */

	}
}
