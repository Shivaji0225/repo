package GymDesktopApplication.Dao;
 
import GymDesktopApplication.CustomerDetails;
import GymDesktopApplication.DB.DBConnection;
	
	import java.sql.*;

	public class CustomerDetailsDAO {
	    public void addCustomer(CustomerDetails customer) throws SQLException {
	        String sql = "INSERT INTO CustomerDetails (id, name, mobileNumber, email, gender, dateOfBirth, address, height, weight, planId, enrolledOn, expiryDate, timeSlot, paymentStatus, medicalNotes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, customer.getId());
	            stmt.setString(2, customer.getName());
	            stmt.setString(3, customer.getMobileNumber());
	            stmt.setString(4, customer.getEmail());
	            stmt.setString(5, customer.getGender());
	            stmt.setDate(6, java.sql.Date.valueOf(customer.getDateOfBirth()));
	            stmt.setString(7, customer.getAddress());
	            stmt.setFloat(8, customer.getHeight());
	            stmt.setDouble(9, customer.getWeight());
	            stmt.setObject(10, customer.getPlanId());
	            stmt.setDate(11, java.sql.Date.valueOf(customer.getEnrolledOn()));
	            stmt.setDate(12, java.sql.Date.valueOf(customer.getExpiryDate()));
	            stmt.setFloat(13, customer.getTimeSlot());
	            stmt.setString(14, customer.getPaymentStatus());
	            stmt.setString(15, customer.getMedicalNotes());
	            stmt.executeUpdate();
	        }
	    }
	}

	
