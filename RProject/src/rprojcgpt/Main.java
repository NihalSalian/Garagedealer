package rprojcgpt;

import java.util.Scanner;

// Base class representing a Vehicle
class Vehicle {
    String make;
    String model;
    int year;
    double price;

    // Constructor to initialize basic vehicle details
    Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Display details of the vehicle
    void displayDetails() {
        System.out.println("\nMake: " + make   + "\nModel: " + model + "\nYear:" + year + "\nPrice: Rs " + price+"\n");
    }
}

// Car class inheriting from Vehicle
class Car extends Vehicle {
    Car(String make, String model, int year, double price) {
        super(make, model, year, price);
    }
}

// Scooter class inheriting from Vehicle
class Scooter extends Vehicle {
    Scooter(String make, String model, int year, double price) {
        super(make, model, year, price);
    }
}

// Bike class inheriting from Vehicle
class Bike extends Vehicle {
    Bike(String make, String model, int year, double price) {
        super(make, model, year, price);
    }
}

// GarageDealer class to handle main functionality
class GarageDealer {
    // Method to initiate the garage dealer functionality
    void startProcess() {
        Scanner scanner = new Scanner(System.in);
        int vehicleType;

        while (true) {
            System.out.println("Select Vehicle Type of your choice:");
            System.out.println("1. Two Wheeler");
            System.out.println("2. Four Wheeler");
            System.out.println("3. Exit");

            vehicleType = scanner.nextInt();

            if (vehicleType == 3) {
                System.out.println("Thanks for visiting! We hope to see you again.");
                break;
            }

            switch (vehicleType) {
                case 1:
                    handleTwoWheelerOptions(scanner);
                    break;
                case 2:
                    handleFourWheelerOptions(scanner);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void handleTwoWheelerOptions(Scanner scanner) {
        System.out.println("Select Two Wheeler Type:");
        System.out.println("1. Bike");
        System.out.println("2. Scooter");

        int twoWheelerType = scanner.nextInt();

        switch (twoWheelerType) {
            case 1:
                handleBikeOptions();
                break;
            case 2:
                handleScooterOptions();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void handleFourWheelerOptions(Scanner scanner) {
    	   System.out.println("Select Car Type:");
    	    System.out.println("1. Mahindra ");
    	    System.out.println("2. Tata");
    	    System.out.println("3. Kia");
    	    System.out.println("4. Swift");
    	    System.out.println("5. Maruti");

    	    int carChoice = scanner.nextInt();

    	    Car selectedCar = null;

    	    switch (carChoice) {
    	        case 1:
    	        	selectedCar = new Car("Mahindra ", "Thar", 2023, 1100000.0);
    	            break;
    	        case 2:
    	        	selectedCar = new Car("Tata", "Nexon", 2022, 800000.0);
    	            break;
    	        case 3:
    	        	selectedCar = new Car("Kia", "Sonet", 2024, 120000.0);
    	            break;
    	        case 4:
    	        	selectedCar = new Car("Swift", "Younic", 2021, 700000.0);
    	            break;
    	        case 5:
    	        	selectedCar = new Car("Maruti", "Fronx", 2021, 750000.0);
    	            break;
    	        default:
    	            System.out.println("Invalid choice!");
    	    }

    	    if (selectedCar != null) {
    	    	selectedCar.displayDetails();

    	        System.out.println("Do you want insurance? (1. Yes, 2. No)");
    	        int insuranceChoice = scanner.nextInt();

    	        switch (insuranceChoice) {
    	            case 1:
    	                selectedCar.price += 100000;
    	                System.out.println("Insurance of 100000 added to the total price.\n");
    	                break;
    	            case 2:
    	                System.out.println("No insurance added.\n");
    	                break;
    	            default:
    	                System.out.println("Invalid choice!");
    	        }

    	        System.out.println("Do you want to know EMI with total cost? (1. Yes, 2. No)");
    	        int emiChoice = scanner.nextInt();

    	        switch (emiChoice) {
    	            case 1:
    	            	selectedCar.price += 60000;
    	                System.out.println("EMI of 60000 added to the total price.\n");
    	                break;
    	            case 2:
    	                System.out.println("No EMI added.\n");
    	                break;
    	            default:
    	                System.out.println("Invalid choice!");
    	        }

    	        System.out.println("Grand Total: Rs " + selectedCar.price);
    	        System.out.println("\n");
                System.out.println("Thanks for the purchase!");
                System.out.println("-----------------------------------");
                System.out.println("Press 3 if you want to exit ");
                System.out.println("\n\n");
    	    }
    	}

    private void handleBikeOptions() {
        System.out.println("Select Bike Type:");
        System.out.println("1. KTM");
        System.out.println("2. Duke");
        System.out.println("3. Pulsar");
        System.out.println("4. Yamaha");

        Scanner scanner = new Scanner(System.in);
        int bikeChoice = scanner.nextInt();

        Bike selectedBike = null;

        switch (bikeChoice) {
            case 1:
                selectedBike = new Bike("KTM", "Duke", 2023, 250000.0);
                break;
            case 2:
                selectedBike = new Bike("TVS", "Apache", 2022, 200000.0);
                break;
            case 3:
                selectedBike = new Bike("Pulsar", "NS200", 2024, 130000.0);
                break;
            case 4:
                selectedBike = new Bike("Yamaha", "R15", 2021, 160000.0);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (selectedBike != null) {
            selectedBike.displayDetails();

            System.out.println("Do you want insurance? (1. Yes, 2. No)");
            int insuranceChoice = scanner.nextInt();

            switch (insuranceChoice) {
                case 1:
                    selectedBike.price += 20000;
                    System.out.println("Insurance of 20000 added to the total price.\n");
                    break;
                case 2:
                    System.out.println("No insurance added.\n");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to know EMI with total cost?(1. Yes, 2. No)");
            int emiChoice = scanner.nextInt();

            switch (emiChoice) {
                case 1:
                    selectedBike.price += 20000;
                    System.out.println("EMI of 20000 added to the total price.\n");
                    break;
                case 2:
                    System.out.println("No EMI added.\n");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Grand Total: Rs " + selectedBike.price);
            System.out.println("\n");
            System.out.println("Thanks for the purchase!");
            System.out.println("-----------------------------------");
            System.out.println("Press 3 if you want to exit ");
            System.out.println("\n\n");
        }
    }

    private void handleScooterOptions() {
        System.out.println("Select Scooter Type:");
        System.out.println("1. Activa");
        System.out.println("2. Jupiter");

        Scanner scanner = new Scanner(System.in);
        int scooterChoice = scanner.nextInt();

        Scooter selectedScooter = null;

        switch (scooterChoice) {
            case 1:
                selectedScooter = new Scooter("Honda", "Activa", 2023, 65000.0);
                break;
            case 2:
                selectedScooter = new Scooter("TVS", "Jupiter", 2022, 80000.0);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (selectedScooter != null) {
            selectedScooter.displayDetails();

            System.out.println("Do you want insurance? (1. Yes, 2. No)");
            int insuranceChoice = scanner.nextInt();

            switch (insuranceChoice) {
                case 1:
                    selectedScooter.price += 10000;
                    System.out.println("Insurance of 10000 added to the total price.\n");
                    break;
                case 2:
                    System.out.println("No insurance added.\n");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to know EMI with total cost? (1. Yes, 2. No)");
            int emiChoice = scanner.nextInt();

            switch (emiChoice) {
                case 1:
                    selectedScooter.price += 4000;
                    System.out.println("EMI of 4000 added to the total price.\n");
                    break;
                case 2:
                    System.out.println("No EMI added.\n");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Grand Total: Rs " + selectedScooter.price);
            System.out.println("\n");
            System.out.println("Thanks for the purchase!");
            System.out.println("-----------------------------------");
            System.out.println("Press 3 if you want to exit ");
            System.out.println("\n\n");
            
        }
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rachana dealership");
        System.out.println("                                   ");
        GarageDealer dealer = new GarageDealer();
        dealer.startProcess();
    }
}
