package mapperInterface;

import java.util.List;

import domain.BoardDTO;
import domain.MemberDTO;

public interface MemberMapper {

	// ** joList
	List<MemberDTO> joList(int jno);

	// ** selectList
	List<MemberDTO> selectList();

	// ** selectOne
	MemberDTO selectOne(MemberDTO dto);

	// ** insert 적용
	int insert(MemberDTO dto);

	// ** Update 적용
	int update(MemberDTO dto);

	// ** Delete 적용
	int delete(MemberDTO dto);
	
}
