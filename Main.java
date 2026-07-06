import java.util.*;

class Taxi {
    String id;
    String driver;
    String location;
    double earnings;
    ArrayList<String> history = new ArrayList<>();

    public Taxi(String id, String driver, String location) {
        this.id = id;
        this.driver = driver;
        this.location = location;
        this.earnings = 0.0;
    }
}

class TaxiBookingSystem {
    ArrayList<Taxi> taxiList = new ArrayList<>();

    // Register a taxi
    public void registerTaxi(String id, String driver, String location) {
        taxiList.add(new Taxi(id, driver, location));
        System.out.println("Taxi registered successfully!");
    }

    // View all taxis
    public void viewTaxis() {
        if (taxiList.isEmpty()) {
            System.out.println("No taxis registered.");
            return;
        }
        for (Taxi t : taxiList) {
            System.out.println("ID: " + t.id + " | Driver: " + t.driver + " | Location: " + t.location + " | Earnings: Rs:" + t.earnings);
        }
    }

    public double calculateFare(String pickup, String drop) {
        pickup = pickup.toLowerCase().trim();
        drop = drop.toLowerCase().trim();

        if (pickup.equals(drop)) return 0.0;

        // Route pricing logic
        if ((pickup.equals("rajapalayam") && drop.equals("srivilliputhur")) || 
            (pickup.equals("srivilliputhur") && drop.equals("rajapalayam"))) {
            return 150.0;
        }
        if ((pickup.equals("rajapalayam") && drop.equals("sivakasi")) || 
            (pickup.equals("sivakasi") && drop.equals("rajapalayam"))) {
            return 400.0;
        }
        if ((pickup.equals("srivilliputhur") && drop.equals("sivakasi")) || 
            (pickup.equals("sivakasi") && drop.equals("srivilliputhur"))) {
            return 300.0;
        }

        return -1.0; 
    }

    
    public void bookTaxiAuto(String customer, String pickup, String drop) {
        double fare = calculateFare(pickup, drop);
        
        if (fare == -1.0) {
            System.out.println("Error: Service only available between Rajapalayam, Sivakasi, and Srivilliputhur.");
            return;
        }
        if (fare == 0.0) {
            System.out.println("Pickup and Drop locations cannot be the same.");
            return;
        }

        
        for (Taxi t : taxiList) {
            if (t.location.equalsIgnoreCase(pickup)) {
                t.earnings += fare;
                t.location = drop; // Taxi moves to the destination city
                t.history.add("Customer " + customer + " went from " + pickup + " to " + drop + " (Fare: Rs:" + fare + ")");
                System.out.println("Booking successful! Assigned Taxi ID: " + t.id + " | Calculated Fare: Rs:" + fare);
                return;
            }
        }
        System.out.println("Sorry, no taxis are currently available in " + pickup);
    }

    
    public void displayHistory() {
        for (Taxi t : taxiList) {
            System.out.println("Taxi ID: " + t.id + " History:");
            if (t.history.isEmpty()) System.out.println("  No trips.");
            for (String trip : t.history) {
                System.out.println("  - " + trip);
            }
        }
    }

   
    public void displayEarnings(String id) {
        for (Taxi t : taxiList) {
            if (t.id.equalsIgnoreCase(id)) {
                System.out.println("Total Earnings for " + id + ": Rs:" + t.earnings);
                return;
            }
        }
        System.out.println("Taxi ID not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        TaxiBookingSystem system = new TaxiBookingSystem();
        Scanner sc = new Scanner(System.in);
        
        
        system.registerTaxi("TX-RJPM-01", "Ramesh", "Rajapalayam");
        system.registerTaxi("TX-SVKS-01", "Suresh", "Sivakasi");
        system.registerTaxi("TX-SVPR-01", "Kumar", "Srivilliputhur");

        while (true) {
            System.out.println("\nTAXI CHOICE");
            System.out.println("1. Register Taxi  2. View Taxis  3. Book Taxi  4. History  5. Earnings  6. Total Count  7. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Driver: "); String name = sc.nextLine();
                System.out.print("Location (Rajapalayam/Sivakasi/Srivilliputhur): "); String loc = sc.nextLine();
                system.registerTaxi(id, name, loc);
            } 
            else if (choice == 2) {
                system.viewTaxis();
            } 
            else if (choice == 3) {
                System.out.print("Customer Name: "); String cust = sc.nextLine();
                System.out.print("Pickup City: "); String pick = sc.nextLine();
                System.out.print("Drop City: "); String drop = sc.nextLine();
                
                
                system.bookTaxiAuto(cust, pick, drop);
            } 
            else if (choice == 4) {
                system.displayHistory();
            } 
            else if (choice == 5) {
                System.out.print("Taxi ID: "); String id = sc.nextLine();
                system.displayEarnings(id);
            } 
            else if (choice == 6) {
                System.out.println("Total Registered Taxis: " + system.taxiList.size());
            } 
            else if (choice == 7) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}