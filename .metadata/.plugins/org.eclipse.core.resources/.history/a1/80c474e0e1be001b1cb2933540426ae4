package OMTpkg.videos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowVideoDetailsServlet
 */
@WebServlet("/editVideoDetailsServlet")
public class editVideoDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Vid = request.getParameter("id");
		
		List<video> myvideos = videoDBUtil.getvideoDetails(Vid);
		request.setAttribute("myvideos", myvideos);
		
		RequestDispatcher dis = request.getRequestDispatcher("editvideoDetails.jsp");
		dis.forward(request, response);
	}

}
