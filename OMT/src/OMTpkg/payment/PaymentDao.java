package OMTpkg.payment;
import OMTpkg.user.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class PaymentDao {

	private String jdbcURL = "jdbc:mysql://Localhost:3306/movieandtvseriassys?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "9819";	
	
	private static final String INSERT_PAYMENTS_SQL = "INSERT INTO payments" + "  (cardname, cardnumber, amount, year, month, cvc) VALUES " + " (?, ?, ?, ?, ?, ?);";
	private static final String SELECT_PAYMENTS_BY_ID = "select cardname, cardnumber, amount, year, month, cvc from payments where PID =?";
	private static final String SELECT_ALL_PAYMENTS = "select * from payments";
	private static final String DELETE_PAYMENTS_SQL = "delete from payments where PID = ?;";
	private static final String UPDATE_PAYMENTS_SQL = "update payments set cardname=?, cardnumber=?, amount=?, year=?, month=?, cvc=? where PID = ?;";	
	
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public void insertPayment(Payment payment) throws SQLException {
		System.out.println(INSERT_PAYMENTS_SQL);
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PAYMENTS_SQL)) {
			preparedStatement.setString(1, payment.getCardname());
			preparedStatement.setString(2, payment.getCardnumber());
			preparedStatement.setString(3, payment.getAmount());
			preparedStatement.setString(4, payment.getYear());
			preparedStatement.setString(5, payment.getMonth());
			preparedStatement.setString(6, payment.getCvc());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) {
			printSQLException(e);
		}
	}


	public Payment selectPayment(int id) {
		Payment payment = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PAYMENTS_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String cardname = rs.getString("cardname");
				String cardnumber = rs.getString("cardnumber");
				String amount = rs.getString("amount");
				String year = rs.getString("year");
				String month = rs.getString("month");
				String cvc = rs.getString("cvc");
				payment = new Payment(id, cardname, cardnumber, amount, year, month, cvc);
			}
		} 
		catch (SQLException e) {
			printSQLException(e);
		}
		return payment;
	}	
	
	
	
	public List<Payment> selectAllPayments() {

		List<Payment> payments = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PAYMENTS);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("PID");
				String cardname = rs.getString("cardname");
				String cardnumber = rs.getString("cardnumber");
				String amount = rs.getString("amount");
				String year = rs.getString("year");
				String month = rs.getString("month");
				String cvc = rs.getString("cvc");
				payments.add(new Payment(id, cardname, cardnumber, amount, year, month, cvc));
			}
		} 
		catch (SQLException e) {
			printSQLException(e);
		}
		return payments;
	}
	
	
	public boolean deletePayment(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_PAYMENTS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}	
	
	
	public boolean updatePayment(Payment payment) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_PAYMENTS_SQL);) {
			System.out.println("updated Payment:"+statement);
			statement.setString(1, payment.getCardname());
			statement.setString(2, payment.getCardnumber());
			statement.setString(3, payment.getAmount());
			statement.setString(4, payment.getYear());
			statement.setString(5, payment.getMonth());
			statement.setString(6, payment.getCvc());
			statement.setInt(7, payment.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
		
	}
	
	
	
	
}
