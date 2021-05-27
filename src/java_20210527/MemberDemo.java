package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();

		// insert 문

		int num = 15;
		String name = "Choi3";
		String addr = "쌍문동3";
		boolean success = dao.insert(new MemberDTO(num, name, addr));

		// update 문
		/*
		 * int num = 11; String name = "Lee"; String addr = "공릉동" boolean success =
		 * dao.update(new MemberDTO(num, name, addr)); if (success) {
		 * System.out.println("insert 성공"); } else { System.out.println("insert 실패"); }
		 */

		// delete 문

		/*
		 * int num = 10; boolean success = dao.delete(num); if (success) {
		 * System.out.println("delete 성공"); } else { System.out.println("delete 실패"); }
		 */

		// select 문
		/*
		 * int start = 0; int len = 10; ArrayList<MemberDTO> list = dao.select(start,
		 * len); for (MemberDTO dto : list) { int num = dto.getNum(); String name =
		 * dto.getName(); String addr = dto.getAddr(); System.out.printf("%d,%s,%s \n",
		 * num, name, addr); }
		 */

	}
}
