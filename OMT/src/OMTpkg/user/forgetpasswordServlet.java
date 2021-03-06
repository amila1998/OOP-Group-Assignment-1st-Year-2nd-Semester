package OMTpkg.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class forgetpasswordServlet
 */
@WebServlet("/forgetpasswordServlet")
public class forgetpasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//catch email and password from the form
		String Email = request.getParameter("uemail");
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		
		boolean validateTrue, isTrue; 
		
		validateTrue = userDBUtil.validateToResetPassword(Email, name);//get boolean return value from userDBUtil.java
		
		if (validateTrue == true) {
			isTrue = userDBUtil.ResetPassword(password,Email);//get boolean return value from userDBUtil.java
			if (validateTrue == true) {
			response.sendRedirect("login.jsp?msg=resetSucc"); //to navigate another page
			}else {
				response.sendRedirect("forgetpassword.jsp?msg=resetUNSucc");
			}
		} else {
			response.sendRedirect("forgetpassword.jsp?msg=invalid");
		}
	}
	}

