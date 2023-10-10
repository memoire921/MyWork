package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/select")
public class Ex04_Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex04_Select() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) 요청분석 
		// => 한글처리, Parameter처리
		request.setCharacterEncoding("UTF-8");
		
		// => job: 단일값 처리
		
		// => interest: 배열 처리
		
		String[] job =	request.getParameterValues("job");
		String[] interest =	request.getParameterValues("interest");
		
		// 2) Service : add 연산
		// 3) View 처리 : 연산결과 출력
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>** Select Test **</h2>");
		
		// => 선택여부를 확인 후 출력 
		if ( job!=null ) {
			// 선택
			for (String s:job) {
				out.print(s+"<br>");
			} //for
		} else {
			out.print("<h2>=> 선택항목이 없음</h2>");
		} //else
		
		out.print("<br><br><h2><a href='javascript:history.go(-1)'>다시 입력하기</a></h2><br>");
	
	} //doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("* Post Test **");
		doGet(request,response);
	} //doPost	

}//class
