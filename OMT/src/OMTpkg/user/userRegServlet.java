package OMTpkg.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class userRegServlet
 */
@WebServlet("/userRegServlet")
public class userRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("mobile");
		String NIC_PassportNO = request.getParameter("nic_passport");
		String sex = request.getParameter("gender");
		String password = request.getParameter("pwd");
		String membershiptype = request.getParameter("membershiptype");
		
		boolean isTrue;
		
		isTrue = userDBUtil.userRegister(name, email, phone, NIC_PassportNO, sex, password,membershiptype);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp?msg=regsucc");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}
}
