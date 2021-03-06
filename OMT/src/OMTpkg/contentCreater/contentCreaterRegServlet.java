package OMTpkg.contentCreater;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class contentCreaterRegServlet
 */
@WebServlet("/contentCreaterRegServlet")
public class contentCreaterRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		
		String companyName = request.getParameter("companyName2");
		String companyLocation = request.getParameter("companyLocation");
		
		
		boolean isTrue;
		
		isTrue = contentCreaterDBUtil.contentCreaterRegister(uid,companyName,companyLocation);
		
		if(isTrue == true) {
			List<contentCreater> contentCreaterDetails = contentCreaterDBUtil.getcontentcreaterDetails(uid);
			request.setAttribute("contentCreaterDetails", contentCreaterDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("contentCreaterProgram.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccss.jsp");
			dis2.forward(request, response);
		}
	}
	

}
