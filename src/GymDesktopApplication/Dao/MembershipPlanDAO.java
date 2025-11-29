package GymDesktopApplication.Dao;

import GymDesktopApplication.MembershipPlan;
import GymDesktopApplication.DB.DBConnection;
	
	import java.sql.*;

	public class MembershipPlanDAO {
	    public void addPlan(MembershipPlan plan) throws SQLException {
	        String sql = "INSERT INTO MembershipPlan (id, planName, validityDays, price) VALUES (?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, plan.getId());
	            stmt.setString(2, plan.getPlanName());
	            stmt.setInt(3, plan.getValidityDays());
	            stmt.setDouble(4, plan.getPrice());
	            stmt.executeUpdate();
	        }
	    }
	}

