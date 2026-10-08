package main.java;
public class Vehicle {

    // Vehicle information
    private String registration;
    private String make;
    private String model;
    private int year;
    private int mileage;

    // Constructor
    public Vehicle(String registration, String make, String model, int year, int mileage) {
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Getters
    public String getRegistration() {
        return registration;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    // Update mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Display vehicle information
    public void displayVehicle() {
        System.out.println("\n--- Vehicle Information ---");
        System.out.println("Registration: " + registration);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }
}