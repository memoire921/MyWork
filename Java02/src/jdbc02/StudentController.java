package jdbc02;

import java.util.List;

//** Controller
//=> 요청 : 요청분석 -> 담당 Service -> Service 는 DAO 
//=> 결과 : DAO -> Service -> Controller
//=> View : Controller -> View 담당 (Java: Console // Web: JSP, Html.., React) 

public class StudentController {
	// ** 전역변수 정의
	StudentService service = new StudentService();
	
	// ** View 역할 메서드 
	public void printList(List<StudentVO> list) {
		System.out.println("------------------------------------------------");
		System.out.println("** Student List **");
		System.out.println("------------------------------------------------");
		if ( list!=null ) {
			// ** list 출력
			for (StudentVO s:list) {
				System.out.println(s);
			} //for			
		} else {
			System.out.println("** selectList: 출력 Data 가 1 도 없음 **");
		}
	} //printList
	
	// => selectOne 호출
	public void printDetail(StudentVO vo) {
		System.out.println("------------------------------------------------");
		System.out.println("** Student printDetail **");
		System.out.println("------------------------------------------------");
		if (vo!=null) {
			System.out.println(vo);			
		} else {
			System.out.println("** selectOne: 출력할 Data가 없음 **");
		}
	} //printDetail
	
	// => group List 호출
	public void printGroup(List<GroupDTO> list) {
		System.out.println("------------------------------------------------");
		System.out.println("** 조별 통계 List **");
		System.out.println("------------------------------------------------");
		if ( list!=null ) {
			// ** list 출력
			for (GroupDTO g:list) {
				System.out.println(g);
			} //for			
		} else {
			System.out.println("** groupList: 출력 Data 가 1 도 없음 **");
		}
	} //printGroup
	
	public static void main(String[] args) {
		// ** StudentController 인스턴스 생성
		StudentController sc = new StudentController();
		
		// ** Student_List
		// => 요청에 해당하는 service.selectList() 메서드 실행
		// => 위의 결과를 view 에 처리하도록 전달
		sc.printList(sc.service.selectList());
		
		// ** Student_Detail
		StudentVO vo = new StudentVO();
		vo.setSno(22);
		sc.printDetail(sc.service.selectOne(vo));
		
		// ** Group 적용
		sc.printGroup(sc.service.groupList());
		
		
	} //main
	
} //class
