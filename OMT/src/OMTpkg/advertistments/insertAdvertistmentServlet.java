package OMTpkg.advertistments;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class insertAdvertistmentServlet
 */
@WebServlet("/insertAdvertistmentServlet")
public class insertAdvertistmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String ad_name = request.getParameter("ad_name");
		String period = request.getParameter("period");
		String adCategory = request.getParameter("adCategory");
		
		
		boolean True;
		
		True = advertistmentDBUtil.insertadvertistment(uid, ad_name, period, adCategory);
		
		if(True == true) {
			List<advertistment> myads = advertistmentDBUtil.getMyads(uid);
			request.setAttribute("myads", myads);
			
			RequestDispatcher dis = request.getRequestDispatcher("myads.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
