package GymDesktopApplication.Dao;

import GymDesktopApplication.Payment;
import GymDesktopApplication.DB.DBConnection;

	
	import java.sql.*;

	public class PaymentDAO {
	    public void addPayment(Payment payment) throws SQLException {
	        String sql = "INSERT INTO Payment (id, customerId, planId, amount, method, paidOn, notes) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, payment.getId());
	            stmt.setObject(2, payment.getCustomerId());
	            stmt.setObject(3, payment.getPlanId());
	            stmt.setDouble(4, payment.getAmount());
	            stmt.setString(5, payment.getMethod());
	            stmt.setTimestamp(6, java.sql.Timestamp.valueOf(payment.getPaidOn()));
	            stmt.setString(7, payment.getNotes());
	            stmt.executeUpdate();
	        }
	    }
	}

