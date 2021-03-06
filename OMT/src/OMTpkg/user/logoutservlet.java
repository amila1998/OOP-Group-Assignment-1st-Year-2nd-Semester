package OMTpkg.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class logoutservlet
 */
@WebServlet("/logoutservlet")
public class logoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			          
	           
				HttpSession session=request.getSession();  //session invalidating 
	            session.invalidate();
	            
	            response.sendRedirect("login.jsp?msg=successfullyLogout"); //to navigate another page                   

            
		}catch (Exception e){
			e.printStackTrace();
		}


}
}