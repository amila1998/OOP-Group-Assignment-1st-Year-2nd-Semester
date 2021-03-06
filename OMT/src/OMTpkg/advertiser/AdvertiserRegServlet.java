package OMTpkg.advertiser;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AdvertiserRegServlet
 */
@WebServlet("/AdvertiserRegServlet")
public class AdvertiserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		
		String companyName = request.getParameter("companyName");
		String companyAddress = request.getParameter("companyAddress");
		
		
		boolean isTrue;
		
		isTrue = advertiserDBUtil.advertiserRegister(uid,companyName,companyAddress);
		
		if(isTrue == true) {
			List<advertiser> advertiserDetails = advertiserDBUtil.getadvertiserDetails(uid);
			request.setAttribute("advertiserDetails", advertiserDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("IamAnAdvertiser.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("BecomeAnAdvertiser.jsp?msg=unsucc");
			dis2.forward(request, response);
		}
	}

}
