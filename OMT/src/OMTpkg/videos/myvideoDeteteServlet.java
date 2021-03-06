package OMTpkg.videos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OMTpkg.user.userDBUtil;

/**
 * Servlet implementation class myvideoDeteteServlet
 */
@WebServlet("/myvideoDeteteServlet")
public class myvideoDeteteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Vid = request.getParameter("vid");
		String uid = request.getParameter("uid");
		
		
boolean isTrue;
		
		isTrue = videoDBUtil.deletevideo(Vid);
		
		if (isTrue == true) {
			List<video> myvideos = videoDBUtil.getMyvideos(uid);
			request.setAttribute("myvideos", myvideos);
			
			RequestDispatcher dis = request.getRequestDispatcher("myvideos.jsp?id=uid");
			dis.forward(request, response);
		}
		else {
			List<video> myvideos = videoDBUtil.getMyvideos(uid);
			request.setAttribute("myvideos", myvideos);
			
			RequestDispatcher dis = request.getRequestDispatcher("myvideos.jsp?id=uid");
			dis.forward(request, response);
				
			
		}
	}

}
