package servlet03_flow;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcTest.StudentDTO;
import mvcTest.StudentService;

@WebServlet("/login")
public class Ex04_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex04_Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청분석
		// => 한글, request 의 Parameter 처리
		request.setCharacterEncoding("UTF-8");
		
		String uri = "index.jsp"; // 성공시
		
		int sno = 0;
		if (request.getParameter("sno") !=null && request.getParameter("sno").length() > 0) {
			sno = Integer.parseInt(request.getParameter("sno"));
		}
		String name = request.getParameter("name");
		
		// 2. 서비스 처리
		// => Service, DTO 객체 생성
		// => sno 로 확인 ( selectOne 메서드 )
		// => 존재하면 name 확인 ( DTO 의 name 과 Parameter 로 전달된 name 과 )
		StudentService service = new StudentService();
		StudentDTO dto = new StudentDTO();
		dto.setSno(sno);
		dto = service.selectOne(dto); // 의 결과에 따라 ~~
		if (dto != null && dto.getName().equals(name)) {
			// => dto 객체에는 해당학생의 Detail 정보가 모두 담겨있음
			// => name 의 일치 확인
			// => 성공 : index.jsp 로
			// => ~~님 : index 화면에 항상 이름이 표시 되도록
			// => 그러므로 로그인 정보 보관 (session 에)
			request.getSession().setAttribute("loginName", name);
			request.getSession().setAttribute("loginID", sno);
			System.out.println("** 로그인 성공 **");
		} else {
			// => 실패 : loginForm 으로 (재로그인 유도)
			// => loginForm 에 "로그인 실패! 다시 하세요 ~~" 출력
			//    String message = "로그인 실패! 다시 하세요 ~~";
			// => 이러한 값들을 다른 서블릿 또는 jsp 문서와 공유하기 위한 방법이 Attribute
			//    이 Attribute 값이 메모리에서 유지되는 시간이 4종류 -> Scope
			// => Scope 4종: page < Request < Session < Application
			request.setAttribute("message", "로그인 실패! 빨리 다시 하세요 ~~");
			
			uri = "servletTestForm/flowEx04_LoginForm.jsp";
		}

		// 3. View (Response) : Forward
		request.getRequestDispatcher(uri).forward(request, response);
		
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("** doPost 실행 **");
		doGet(request, response);
	}

} //class
