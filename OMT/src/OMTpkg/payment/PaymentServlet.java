package OMTpkg.payment;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PaymentDao paymentDAO;
	
	public void init() {
		paymentDAO = new PaymentDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertPayment(request, response);
				break;
			case "/delete":
				deletePayment(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updatePayment(request, response);
				break;
			default:
				listPayment(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listPayment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Payment> listPayment = paymentDAO.selectAllPayments();
		request.setAttribute("listPayment", listPayment);
		RequestDispatcher dispatcher = request.getRequestDispatcher("payments/payment-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("payments/payment-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Payment existingPayment = paymentDAO.selectPayment(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("payments/payment-form.jsp");
		request.setAttribute("payment", existingPayment);
		dispatcher.forward(request, response);
	}

	private void insertPayment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String cardname = request.getParameter("cardname");
		String cardnumber = request.getParameter("cardnumber");
		String amount = request.getParameter("amount");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String cvc = request.getParameter("cvc");
		Payment newPayment = new Payment(cardname, cardnumber, amount, year, month, cvc);
		paymentDAO.insertPayment(newPayment);
		response.sendRedirect("list");
	}

	private void updatePayment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String cardname = request.getParameter("cardname");
		String cardnumber = request.getParameter("cardnumber");
		String amount = request.getParameter("amount");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String cvc = request.getParameter("cvc");

		Payment book = new Payment(id, cardname, cardnumber, amount, year, month, cvc);
		paymentDAO.updatePayment(book);
		response.sendRedirect("list");
	}

	private void deletePayment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		paymentDAO.deletePayment(id);
		response.sendRedirect("list");

	}

}