package GymDesktopApplication.Dao;

import GymDesktopApplication.Expenses;
import GymDesktopApplication.DB.DBConnection;

import java.sql.*;

	public class ExpensesDAO {
	    public void addExpense(Expenses expense) throws SQLException {
	        String sql = "INSERT INTO Expenses (id, category, amount, expenseDate, notes) VALUES (?, ?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, expense.getId());
	            stmt.setString(2, expense.getCategory());
	            stmt.setDouble(3, expense.getAmount());
	            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(expense.getExpenseDate()));
	            stmt.setString(5, expense.getNotes());
	            stmt.executeUpdate();
	        }
	    }
	}


