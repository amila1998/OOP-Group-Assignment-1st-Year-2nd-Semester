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
 * Servlet implementation class myAdsServlet
 */
@WebServlet("/myAdsServlet")
public class myAdsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		
		List<advertistment> myads = advertistmentDBUtil.getMyads(uid);
		request.setAttribute("myads", myads);
		
		RequestDispatcher dis = request.getRequestDispatcher("myads.jsp");
		dis.forward(request, response);	
	}

}
