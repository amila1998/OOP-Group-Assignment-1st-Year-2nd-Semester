package OMTpkg.videos;

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
 * Servlet implementation class videoUpdateServlet
 */
@WebServlet("/videoUpdateServlet")
public class videoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vid = request.getParameter("vid");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String ageRestriction = request.getParameter("ageRestriction");
		String category = request.getParameter("category");
		
		int uid;
		
		uid = videoDBUtil.updatevideoDetails(vid,title, description, ageRestriction, category);
		
		String UID=String.valueOf(uid);
			
			List<video> myvideos = videoDBUtil.getMyvideos(UID);
			request.setAttribute("myvideos", myvideos);
			
			RequestDispatcher dis = request.getRequestDispatcher("myvideos.jsp");
			dis.forward(request, response);
		
		
	
	}

}
