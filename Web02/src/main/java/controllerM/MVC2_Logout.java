package controllerM;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class MVC2_Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_Logout() {
        super();
    }

    // ** Logout
    // => session 무효화, index.jsp (redirect)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청분석
		String uri = "index.jsp";
		
		// 2. 서비스 처리
		// => session 무효화
		request.getSession().invalidate();
		
		// 3. View (Response) : Redirect
		response.sendRedirect(uri);
		
	} //doGet

} //class
