package GymDesktopApplication.Dao;

import GymDesktopApplication.Equipment;
import GymDesktopApplication.DB.DBConnection;
	
	import java.sql.*;

	public class EquipmentDAO {
	    public void addEquipment(Equipment equipment) throws SQLException {
	        String sql = "INSERT INTO Equipment (id, name, description, status, quantity) VALUES (?, ?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, equipment.getId());
	            stmt.setString(2, equipment.getName());
	            stmt.setString(3, equipment.getDescription());
	            stmt.setString(4, equipment.getStatus());
	            stmt.setInt(5, equipment.getQuantity());
	            stmt.executeUpdate();
	        }
	    }
	

}
