package GymDesktopApplication;

import java.time.LocalDate;

public class CustomerDetails {
    private int id;
    private String name;
    private String mobileNumber;
    private String email;
    private String gender;
    private LocalDate dateOfBirth;
    private String address;
    private float height;
    private double weight;
    private Integer planId;         
    private LocalDate enrolledOn;
    private LocalDate expiryDate;
    private float timeSlot;
    private String paymentStatus;
    private String medicalNotes;

    // Default Constructor
    public CustomerDetails() {
    }

    // Parameterized Constructor
    public CustomerDetails(int id, String name, String mobileNumber, String email, String gender,
                           LocalDate dateOfBirth, String address, float height, double weight,
                           Integer planId, LocalDate enrolledOn, LocalDate expiryDate,
                           float timeSlot, String paymentStatus, String medicalNotes) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.planId = planId;
        this.enrolledOn = enrolledOn;
        this.expiryDate = expiryDate;
        this.timeSlot = timeSlot;
        this.paymentStatus = paymentStatus;
        this.medicalNotes = medicalNotes;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getPlanId() {
        return planId;
    }
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public LocalDate getEnrolledOn() {
        return enrolledOn;
    }
    public void setEnrolledOn(LocalDate enrolledOn) {
        this.enrolledOn = enrolledOn;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public float getTimeSlot() {
        return timeSlot;
    }
    public void setTimeSlot(float timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getMedicalNotes() {
        return medicalNotes;
    }
    public void setMedicalNotes(String medicalNotes) {
        this.medicalNotes = medicalNotes;
    }

    
    @Override
    public String toString() {
        return "CustomerDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", planId=" + planId +
                ", enrolledOn=" + enrolledOn +
                ", expiryDate=" + expiryDate +
                ", timeSlot=" + timeSlot +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", medicalNotes='" + medicalNotes + '\'' +
                '}';
    }
}
