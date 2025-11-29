package GymDesktopApplication;

import GymDesktopApplication.Dao.*;
import java.time.LocalDate;
	import java.time.LocalDateTime;

	public class GymMain {
	    public static void main(String[] args) {
	        try {
	            // --- USER DEMO ---
	            UserDAO userDAO = new UserDAO();
	            User user = new User(1, "sivaji", "securePass123", "Sivaji", "9876543210", "sivaji@example.com");
	            userDAO.addUser(user);
	            System.out.println("User added: " + user);

	            User fetchedUser = userDAO.getUserById(1);
	            System.out.println("Fetched User: " + fetchedUser);

	            // --- CUSTOMER DEMO ---
	            CustomerDetailsDAO customerDAO = new CustomerDetailsDAO();
	            CustomerDetails customer = new CustomerDetails(
	                    1, "Arun Kumar", "9876543211", "arun@example.com", "Male",
	                    LocalDate.of(1995, 5, 20), "Bengaluru", 175.5f, 70.2,
	                    101, LocalDate.now(), LocalDate.now().plusDays(90),
	                    10.30f, "Paid", "No medical issues"
	            );
	            customerDAO.addCustomer(customer);
	            System.out.println("Customer added: " + customer);

	            // --- MEMBERSHIP PLAN DEMO ---
	            MembershipPlanDAO planDAO = new MembershipPlanDAO();
	            MembershipPlan plan = new MembershipPlan(101, "Premium Plan", 90, 4999.99);
	            planDAO.addPlan(plan);
	            System.out.println("Plan added: " + plan);

	            // --- EQUIPMENT DEMO ---
	            EquipmentDAO equipmentDAO = new EquipmentDAO();
	            Equipment equipment = new Equipment(201, "Treadmill", "Cardio machine", "Available", 5);
	            equipmentDAO.addEquipment(equipment);
	            System.out.println("Equipment added: " + equipment);

	            // --- PAYMENT DEMO ---
	            PaymentDAO paymentDAO = new PaymentDAO();
	            Payment payment = new Payment(301, 1, 101, 4999.99, "CARD", LocalDateTime.now(), "First payment");
	            paymentDAO.addPayment(payment);
	            System.out.println("Payment added: " + payment);

	            // --- EXPENSE DEMO ---
	            ExpensesDAO expensesDAO = new ExpensesDAO();
	            Expenses expense = new Expenses(401, "Maintenance", 1200.50, LocalDateTime.now(), "Treadmill servicing");
	            expensesDAO.addExpense(expense);
	            System.out.println("Expense added: " + expense);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



