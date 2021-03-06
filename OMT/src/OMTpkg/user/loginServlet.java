package OMTpkg.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;


/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  	
		
		//catch email and password from the form
		String Email = request.getParameter("uemail");
		String Password = request.getParameter("upassword");
		
		boolean loginTrue; 
		
		if(Email=="admin@gmail.com" && Password=="admin" ) {
			response.sendRedirect("admin/adminhome.jsp");
		}else {
			loginTrue = userDBUtil.validate(Email, Password);//get boolean return value from userDBUtil.java
			
			if (loginTrue == true) {
				List<user> userDetails = userDBUtil.getuser(Email);
				 request.setAttribute("userDetails", userDetails);
				 
				 HttpSession session=request.getSession();  
			     session.setAttribute("email",Email);  
				 
			
				RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp"); //to navigate another page
				dis.forward(request, response);
			} else {
				response.sendRedirect("login.jsp?msg=invalid");
			}
		}
	}

}
