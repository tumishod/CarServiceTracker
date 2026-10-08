package main.java;
public class ServiceRecord {

    private String date;
    private int mileage;
    private String description;
    private double cost;

    // Constructor
    public ServiceRecord(String date, int mileage, String description, double cost) {
        this.date = date;
        this.mileage = mileage;
        this.description = description;
        this.cost = cost;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    // Display service information
    public void displayService() {
        System.out.println("\n--- Service Record ---");
        System.out.println("Date: " + date);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Description: " + description);
        System.out.println("Cost: R" + cost);
    }
}