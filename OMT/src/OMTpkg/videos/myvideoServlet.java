package OMTpkg.videos;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class myvideoServlet
 */
@WebServlet("/myvideoServlet")
public class myvideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		
		
		List<video> myvideos = videoDBUtil.getMyvideos(uid);
		request.setAttribute("myvideos", myvideos);
		
		RequestDispatcher dis = request.getRequestDispatcher("myvideos.jsp?id=uid");
		dis.forward(request, response);
        
	}

}
