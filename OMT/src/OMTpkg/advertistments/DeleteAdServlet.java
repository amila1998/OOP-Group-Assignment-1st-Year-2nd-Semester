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
 * Servlet implementation class DeleteAdServlet
 */
@WebServlet("/DeleteAdServlet")
public class DeleteAdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Vid = request.getParameter("vid");
		String uid = request.getParameter("uid");
		
		
boolean isTrue;
		
		isTrue = advertistmentDBUtil.deleteAds(Vid);
		
		if (isTrue == true) {
			List<advertistment> myads = advertistmentDBUtil.getMyads(uid);
			request.setAttribute("myads", myads);
			
			RequestDispatcher dis = request.getRequestDispatcher("myads.jsp?uid=uid");
			dis.forward(request, response);
		}
		else {
			List<advertistment> myads = advertistmentDBUtil.getMyads(uid);
			request.setAttribute("myads", myads);
			
			RequestDispatcher dis = request.getRequestDispatcher("myads.jsp?uid=uid");
			dis.forward(request, response);
				
			
		}
	}

}
