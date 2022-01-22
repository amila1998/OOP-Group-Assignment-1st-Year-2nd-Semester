package OMTpkg.contentCreater;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OMTpkg.user.user;
import OMTpkg.user.userDBUtil;

/**
 * Servlet implementation class contentCreaterServlet
 */
@WebServlet("/contentCreaterServlet")
public class contentCreaterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean cconformation;
		cconformation = contentCreaterDBUtil.contentCreaterconformation(id);
		
	
	    
	   
		
		if (cconformation==false) {
			
			List<user> userDetails = userDBUtil.getUserDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("contentCreaterRegister.jsp");
			dis.forward(request, response);
		}else if(cconformation==true){
			List<contentCreater> contentCreaterDetails = contentCreaterDBUtil.getcontentcreaterDetails(id);
			request.setAttribute("contentCreaterDetails", contentCreaterDetails);
					
			
			RequestDispatcher dis = request.getRequestDispatcher("contentCreaterProgram.jsp");
			dis.forward(request, response);
		}
		
		
	}
	

}
