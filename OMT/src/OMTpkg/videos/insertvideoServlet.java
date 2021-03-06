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
 * Servlet implementation class insertvideoServlet
 */
@WebServlet("/insertvideoServlet")
public class insertvideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String ageRestriction = request.getParameter("ageRestriction");
		String category = request.getParameter("category");
		
		
		boolean True;
		
		True = videoDBUtil.insertVideo(uid, title, description, ageRestriction, category);
		
		if(True == true) {
			List<video> myvideos = videoDBUtil.getMyvideos(uid);
			request.setAttribute("myvideos", myvideos);
			
			RequestDispatcher dis = request.getRequestDispatcher("myvideos.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}
	

}
