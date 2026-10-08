package main.java;
import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceTracker {

    private ArrayList<Vehicle> vehicles;
    private Scanner scanner;

    public CarServiceTracker() {
        vehicles = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    addVehicle();
                    break;

                case "2":
                    viewVehicles();
                    break;

                case "3":
                    System.out.println("Add Service - Coming Soon");
                    break;

                case "4":
                    System.out.println("Service History - Coming Soon");
                    break;

                case "5":
                    System.out.println("Total Costs - Coming Soon");
                    break;

                case "6":
                    running = false;
                    System.out.println("\nThank you for using Car Service Tracker!");
                    break;

                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        }
    }

    private void displayMenu() {

        System.out.println("\n================================");
        System.out.println("       CAR SERVICE TRACKER");
        System.out.println("================================");
        System.out.println("1. Add Vehicle");
        System.out.println("2. View Vehicles");
        System.out.println("3. Add Service");
        System.out.println("4. View Service History");
        System.out.println("5. View Total Service Costs");
        System.out.println("6. Exit");
        System.out.println("================================");
    }

    private void addVehicle() {

        System.out.println("\n--- Add Vehicle ---");

        System.out.print("Registration: ");
        String registration = scanner.nextLine();

        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Mileage: ");
        int mileage = Integer.parseInt(scanner.nextLine());

        Vehicle vehicle = new Vehicle(
                registration,
                make,
                model,
                year,
                mileage
        );

        vehicles.add(vehicle);

        System.out.println("\nVehicle added successfully!");
    }

    private void viewVehicles() {

        System.out.println("\n--- Your Vehicles ---");

        if (vehicles.isEmpty()) {
            System.out.println("No vehicles have been added.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicle();
        }
    }
}