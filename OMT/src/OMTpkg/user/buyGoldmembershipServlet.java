package OMTpkg.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class buyGoldmembershipServlet
 */
@WebServlet("/buyGoldmembershipServlet")
public class buyGoldmembershipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UID = request.getParameter("id");
		String membershiptype = request.getParameter("membershiptype");
		
		if(membershiptype!="SILVER"){
			RequestDispatcher dis = request.getRequestDispatcher("payments/payment-form.jsp?uid=UID");
			dis.forward(request, response);
		}else if(membershiptype!="GOLD"){
			List<user> userDetails = userDBUtil.getUserDetails(UID);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}
