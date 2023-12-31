package service;

import java.util.List;

import domain.MemberDTO;
import model.MemberDAO;

public class MemberService {
	// ** 전역변수 정의
	MemberDAO dao = new MemberDAO();
	
	// ** selectList
	public List<MemberDTO> selectList() {
		return dao.selectList();
	}
	
	// ** selectOne
	public MemberDTO selectOne(MemberDTO dto) {
		return dao.selectOne(dto);
	}
	
	// ** insert 적용
	public int insert(MemberDTO dto) {
		return dao.insert(dto);
	}
	
	// ** Update 적용
	public int update(MemberDTO dto) {
		return dao.update(dto);
	}
	
	// ** Delete 적용
	public int delete(MemberDTO dto) {
		return dao.delete(dto);
	}
	
} //class
