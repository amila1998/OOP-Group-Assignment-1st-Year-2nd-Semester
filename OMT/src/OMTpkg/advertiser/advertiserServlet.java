package OMTpkg.advertiser;
import OMTpkg.user.*;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.util.List;

import javax.servlet.RequestDispatcher;


/**
 * Servlet implementation class advertiserServlet
 */
@WebServlet("/advertiserServlet")
public class advertiserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		boolean conformation;
		conformation = advertiserDBUtil.advertiserconformation(id);
		
	
	    
	   
		
		if (conformation==false) {
			
			List<user> userDetails = userDBUtil.getUserDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("BecomeAnAdvertiser.jsp");
			dis.forward(request, response);
		}else if(conformation==true){
			List<advertiser> advertiserDetails = advertiserDBUtil.getadvertiserDetails(id);
			request.setAttribute("advertiserDetails", advertiserDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("IamAnAdvertiser.jsp");
			dis.forward(request, response);
		}
		
		
	}
}
		
	


