package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.BoardDTO;

//** DAO(Data Access Object)
//=> SQL 구문 처리
//=> CRUD 구현 
//   Create(Insert), Read(selectList, selectOne), Update, Delete

@Repository
public class BoardDAO {
	// ** 전역변수 정의
	private static Connection cn = DBConnection.getConnection();
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private static String sql;

	// ** selectList
	public List<BoardDTO> selectList() {
		sql = "select * from board order by seq desc";
		List<BoardDTO> list = new ArrayList<BoardDTO>();		
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);					
			if (rs.next()) {
				// => selectList 결과 존재
				// => 결과를 list 에 담기
				do {
					BoardDTO dto = new BoardDTO();
					dto.setSeq(rs.getInt(1));
					dto.setId(rs.getString(2));
					dto.setTitle(rs.getString(3));
					//dto.setContent(rs.getString(4));
					dto.setRegdate(rs.getString(5));
					dto.setCnt(rs.getInt(6));
					list.add(dto);					
				} while(rs.next());				
			} else {
				list = null;
			}			
		} catch (Exception e) {
			System.out.println("** selectList Exception => " + e.toString());
			list = null;
		}		
		return list;
	} //selectList
	
	// ** selectOne
	public BoardDTO selectOne(BoardDTO dto) {
		sql = "select * from board where seq = ?";
		 try {
			 pst = cn.prepareStatement(sql);
			 pst.setInt(1, dto.getSeq());
			 rs = pst.executeQuery();
			 if(rs.next()) {
				 // => Data 존재: rs 을 dto 에 담아서 return
				 	dto.setSeq(rs.getInt(1));
					dto.setId(rs.getString(2));
					dto.setTitle(rs.getString(3));
					dto.setContent(rs.getString(4));
					dto.setRegdate(rs.getString(5));
					dto.setCnt(rs.getInt(6));
					return dto;				 
			 } else {
				 return null;
			 }
		} catch (Exception e) {
			System.out.println("** selectOne Exception => " + e.toString());
			return null;
		}
	} //selectOne
	
	// ** Insert
	// => 입력 컬럼: id, title, content
	//    default 값: regdate, cnt
	// => Auto_Inc: seq (계산: auto 보다 max(seq) 를 이용해서 직접 계산) 
	public int insert(BoardDTO dto) {
		sql = "insert into board(seq, id, title, content) values("
				+ " (select * from (select IFNULL(max(seq), 0) + 1 from board) as temp)"  // seq값 계산
				+ ", ?, ?, ?)";
		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getTitle());
			pst.setString(3, dto.getContent());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** insert Exception => " + e.toString());
			return 0;
		}
	} //insert
	
	// ** Update
	// => title, content 만 수정
	public int update(BoardDTO dto) {
		sql = "update board set title = ?, content = ? where seq = ?";
		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getTitle());
			pst.setString(2, dto.getContent());
			pst.setInt(3, dto.getSeq());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** Update Exception => " + e.toString());
			return 0;
		}
	} //Update
	
	// ** Delete
	// => seq 로 삭제
	public int delete(BoardDTO dto) {
		sql = "delete from board where seq = ?";
		try {
			pst=cn.prepareStatement(sql);
			pst.setInt(1, dto.getSeq());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** Delete Exception => " + e.toString());
			return 0;
		}
	} //delete
	
} //class
