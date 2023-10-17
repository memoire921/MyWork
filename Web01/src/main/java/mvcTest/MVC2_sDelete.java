package mvcTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class MVC2_sDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_sDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청분석 & Service
		// => 삭제할 대상 ( request 의 Parameter 로 전달됨)
		int sno = Integer.parseInt(request.getParameter("sno"));  
		StudentService service = new StudentService();
		StudentDTO dto = new StudentDTO();
		dto.setSno(sno);
		
		// 2. 결과
		// => 삭제 성공/실패 -> list 출력 ( "list2" 로 Forward ) 
		// => message 출력
		if (service.delete(dto) > 0 ) {
			// 성공
			request.setAttribute("message", sno+" 님 삭제 성공 ~~");
		} else {
			// 실패
			request.setAttribute("message", sno+" 님 삭제 실패 ~~");
		}
		request.getRequestDispatcher("list2").forward(request, response);
	} //doGet

} //class
