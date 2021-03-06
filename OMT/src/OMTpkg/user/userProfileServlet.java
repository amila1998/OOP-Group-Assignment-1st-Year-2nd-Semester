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
 * Servlet implementation class useraccountServlet
 */
@WebServlet("/userProfileServlet")
public class userProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 HttpSession session=request.getSession();  
	     String Email = (String)session.getAttribute("email");  
		 
		
		List<user> userDetails = userDBUtil.getuser(Email);
		 request.setAttribute("userDetails", userDetails);
		 
		
	
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp"); //to navigate another page
		dis.forward(request, response);
	}

}
