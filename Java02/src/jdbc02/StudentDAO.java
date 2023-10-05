package jdbc02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc01.DBConnection;

//** DAO(Data Access Object)
//=> SQL 구문 처리
//=> CRUD 구현 
//   Create(Insert), Read(selectList, selectOne), Update, Delete

//=> 첫번째 예제 Ex01_~~~ 와 DAO 와 다른점
//  - 요청 처리 결과를 제공
//  - 즉, 메서드의 역할별로 처리결과를 return 해야함
//  - 그러므로 특히 select 결과를 전달하기위해 결과를 담는 작업이 필요함 

public class StudentDAO {
	// ** 전역변수 정의
	private static Connection cn = DBConnection.getConnection();
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private static String sql;

	// ** selectList
	public List<StudentVO> selectList() {
		sql = "select * from student";
		List<StudentVO> list = new ArrayList<StudentVO>();		
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);					
			if (rs.next()) {
				// => selectList 결과 존재
				// => 결과를 list 에 담기
				//     - list = re; 불가능, 1 Row 단위로 옮겨야함
				//     - 1 Row 는 StudentVO Type				
				do {
					StudentVO vo = new StudentVO();
					vo.setSno(rs.getInt(1));
					vo.setName(rs.getString(2));
					vo.setAge(rs.getInt(3));
					vo.setJno(rs.getInt(4));
					vo.setInfo(rs.getString(5));
					vo.setPoint(rs.getDouble(6));
					vo.setBirthday(rs.getString(7));
					list.add(vo);					
				} while(rs.next());				
			} else {
				System.out.println("** selectList: 출력 Data 가 1건도 없음 **"); 
				list = null;
			}			
		} catch (Exception e) {
			System.out.println("** selectList Exception => " + e.toString());
			list = null;
		}		
		return list;
	} //selectList
	
	// ** selectOne
	public StudentVO selectOne(StudentVO vo) {
		sql = "select * from student where sno = ?";
		 try {
			 pst = cn.prepareStatement(sql);
			 pst.setInt(1, vo.getSno());
			 rs = pst.executeQuery();
			 if(rs.next()) {
				 // => Data 존재: re 을 VO 에 담아서 return
					vo.setName(rs.getString(2));
					vo.setAge(rs.getInt(3));
					vo.setJno(rs.getInt(4));
					vo.setInfo(rs.getString(5));
					vo.setPoint(rs.getDouble(6));
					vo.setBirthday(rs.getString(7));
					return vo;				 
			 } else {
				 return null;
			 }
		} catch (Exception e) {
			System.out.println("** selectOne Exception => " + e.toString());
			return null;
		}
	} //selectOne
	
	// ** Group 적용
	public List<GroupDTO> groupList() {
		sql = "select jno, count(*), sum(age), avg(age), max(age), min(age) "
				+ "from student Group by jno Order by jno";
		List<GroupDTO> list = new ArrayList<>();
		try {
			pst = cn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				do {
					GroupDTO dto = new GroupDTO();
					dto.setJno(rs.getInt(1));
					dto.setCount(rs.getInt(2));
					dto.setSum(rs.getInt(3));
					dto.setAvg(rs.getInt(4));
					dto.setMax(rs.getInt(5));
					dto.setMin(rs.getInt(6));
					list.add(dto);
				} while(rs.next());
			} else list = null;
		} catch (Exception e) {
			System.out.println("** groupList Exception => " + e.toString());
			list = null;
		}
		return list;
	} //groupList
	
	// ** Insert
	
	// ** Update
	
	// ** Delete
	
	
} //class
