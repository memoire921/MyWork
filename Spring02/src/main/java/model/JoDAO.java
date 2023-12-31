package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.JoDTO;

//** DAO(Data Access Object)
//=> SQL 구문 처리
//=> CRUD 구현 
//   Create(Insert), Read(selectList, selectOne), Update, Delete

@Repository
public class JoDAO {
	// ** JDBC 처리를 위한 전역변수정의
	private static Connection cn = DBConnection.getConnection();
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private static String sql;

	// 1. selectList
	// => ver01 : 기본형
	// => ver02 : 조장이름 추가
	//            Outer Join : 조장이 없는 조도 출력 되어야 함
	//            ( LEFT / RIGHT : 출력_자료가 있는쪽 기준 )
	public List<JoDTO> selectList() {
		//sql = "select * from jo"; // -> ver01
		sql = "select j.jno, jname, j.id, m.name, project, slogan"
				+ " from jo j LEFT OUTER JOIN member m ON j.id = m.id "; // ver02
		List<JoDTO> list = new ArrayList<JoDTO>();		
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);					
			if (rs.next()) {
				// => selectList 결과 존재
				// => 결과를 list 에 담기
				do {
					JoDTO dto = new JoDTO();
					dto.setJno(rs.getInt(1));
					dto.setJname(rs.getString(2));
					dto.setId(rs.getString(3));
					dto.setCname(rs.getString(4));
					dto.setProject(rs.getString(5));
					dto.setSlogan(rs.getString(6));
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
	public JoDTO selectOne(JoDTO dto) {
		sql = "select * from jo where jno = ?";
		 try {
			 pst = cn.prepareStatement(sql);
			 pst.setInt(1, dto.getJno());
			 rs = pst.executeQuery();
			 if(rs.next()) {
				 // => Data 존재: rs 을 dto 에 담아서 return
				 	dto.setJno(rs.getInt(1));
					dto.setJname(rs.getString(2));
					dto.setId(rs.getString(3));
					dto.setCname(rs.getString(4));
					dto.setProject(rs.getString(5));
					dto.setSlogan(rs.getString(6));
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
	// => 입력 컬럼: jname, id, project, slogan
	public int insert(JoDTO dto) {
		sql = "insert into jo(jno, jname, id, cname, project, slogan) values("
				+ " (select * from (select IFNULL(max(jno), 0) + 1 from jo) as temp)"  // seq값 계산
				+ ", ?, ?, ?, ?, ?)";
		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getJname());
			pst.setString(2, dto.getId());
			pst.setString(3, dto.getCname());
			pst.setString(4, dto.getProject());
			pst.setString(5, dto.getSlogan());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** insert Exception => " + e.toString());
			return 0;
		}
	} //insert
	
	// ** Update
	// => title, content 만 수정
	public int update(JoDTO dto) {
		sql = "update jo set jname = ?, id = ?, cname = ?, project = ?, slogan =? where jno = ?";
		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, dto.getJname());
			pst.setString(2, dto.getId());
			pst.setString(3, dto.getCname());
			pst.setString(4, dto.getProject());
			pst.setString(5, dto.getSlogan());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** Update Exception => " + e.toString());
			return 0;
		}
	} //Update
	
	// ** Delete
	// => seq 로 삭제
	public int delete(JoDTO dto) {
		sql = "delete from jo where jno = ?";
		try {
			pst=cn.prepareStatement(sql);
			pst.setInt(1, dto.getJno());
			return pst.executeUpdate();  // 처리갯수
		} catch (Exception e) {
			System.out.println("** Delete Exception => " + e.toString());
			return 0;
		}
	} //delete
	
} //class
