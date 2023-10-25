package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.BoardDTO;
import model.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	// ** 전역변수 정의
	//BoardDAO dao = new BoardDAO();
	@Autowired
	BoardDAO dao;
	
	// ** selectList
	@Override
	public List<BoardDTO> selectList() {
		return dao.selectList();
	}
	
	// ** selectOne
	@Override
	public BoardDTO selectOne(BoardDTO dto) {
		return dao.selectOne(dto);
	}
	
	// ** insert 적용
	@Override
	public int insert(BoardDTO dto) {
		return dao.insert(dto);
	}
	
	// ** Update 적용
	@Override
	public int update(BoardDTO dto) {
		return dao.update(dto);
	}
	
	// ** Delete 적용
	@Override
	public int delete(BoardDTO dto) {
		return dao.delete(dto);
	}
	
} //class
