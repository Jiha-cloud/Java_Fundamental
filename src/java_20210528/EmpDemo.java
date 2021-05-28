package java_20210528;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		
		/*
		 * boolean success = dao.insert(new EmpDTO(9003, "KIM", "MANAGER", 7839, null,
		 * 50000.0, 40000.0, 30)); if(success) { System.out.println("insert 성공"); }else
		 * { System.out.println("insert 실패"); }
		 */
		
		/*
		 * ArrayList<EmpDTO> list = dao.select(0, 10); for(EmpDTO dto : list) {
		 * System.out.printf("%d, %s, %s, %d, %s, %.1f, %.1f, %d \n", dto.getNo(),
		 * dto.getName(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(),
		 * dto.getComm(), dto.getDeptNo()); }
		 */
	}
}
