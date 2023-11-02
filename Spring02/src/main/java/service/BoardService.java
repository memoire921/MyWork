package service;

import java.util.List;

import criTest.SearchCriteria;
import domain.BoardDTO;

public interface BoardService {
	
	// ** Board_Cri_Paging
	List<BoardDTO> bcriList(SearchCriteria cri); // 출력할 Data 만 select
	int criTotalCount(SearchCriteria cri); // 출력대상인 전체 rows 갯수
	
	// ** 답글등록
	int rinsert(BoardDTO dto);

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