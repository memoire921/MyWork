package service;

import java.util.List;

import domain.JoDTO;

public interface JoService {

	// ** selectList
	List<JoDTO> selectList();

	// ** selectOne
	JoDTO selectOne(JoDTO dto);

	// ** insert 적용
	int insert(JoDTO dto);

	// ** Update 적용
	int update(JoDTO dto);

	// ** Delete 적용
	int delete(JoDTO dto);

}