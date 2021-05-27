package java_20210528;

import java.util.ArrayList;

public class EmpDAO {
	private boolean success = false;
	private static EmpDAO single;
	
	private EmpDAO() {
	}
	
	public static EmpDAO getInstance() {
		if(single==null) {
			single = new EmpDAO();
		}
		return single;
	}
	
	public boolean insert(EmpDTO dto) {
		
		return success;
	}
	
	public boolean update(EmpDTO dto) {
		
		return success;
	}
	
	public boolean delete(int no) {
		
		return success;
	}
	
	public ArrayList<EmpDTO> select(int start, int len){
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		
		return list;
	}
	}

