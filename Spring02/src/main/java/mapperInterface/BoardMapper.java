package mapperInterface;

import java.util.List;

import domain.BoardDTO;

public interface BoardMapper {

	// ** 답글등록
	int rinsert(BoardDTO dto);
	int stepUpdate(BoardDTO dto);

	// ** selectList
	List<BoardDTO> selectList();

	// ** selectOne
	BoardDTO selectOne(BoardDTO dto);

	// ** insert 적용
	int insert(BoardDTO dto);

	// ** Update 적용
	int update(BoardDTO dto);

	// ** Delete 적용
	int delete(BoardDTO dto);
	
}
