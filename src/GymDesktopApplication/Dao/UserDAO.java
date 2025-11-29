package GymDesktopApplication.Dao;

import GymDesktopApplication.User;
import GymDesktopApplication.DB.DBConnection;

import java.sql.*;
import java.util.*;



public class UserDAO {
    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO Users (id, username, password, name, contactNumber, email) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getName());
            stmt.setString(5, user.getContactNumber());
            stmt.setString(6, user.getEmail());
            stmt.executeUpdate();
        }
    }

    public User getUserById(int id) throws SQLException {
        String sql = "SELECT * FROM Users WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("contactNumber"),
                    rs.getString("email")
                );
            }
        }
        return null;
    }
}

