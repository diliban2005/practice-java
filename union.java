import java.util.*;

//Movie Class
class Movie {
    String id;
    String name;
    String time;
    int seats;

    Movie(String id, String name, String time, int seats) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.seats = seats;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + time + "\t" + seats);
    }
}

//Booking System
class BookingSystem {

    ArrayList<Movie> movies = new ArrayList<>();

    // Add Movie
    void addMovie(String id, String name, String time, int seats) {
        movies.add(new Movie(id, name, time, seats));
        System.out.println("Movie Added Successfully");
    }

    // View Movies
    void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No Movies Available");
            return;
        }

        System.out.println("\nID\tName\tTime\tSeats");
        for (Movie m : movies) {
            m.display();
        }
    }

    // Search Movie
    Movie searchMovie(String id) {
        for (Movie m : movies) {
            if (m.id.equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    // Book Ticket
    void bookTicket(String id, int ticket) {

        Movie m = searchMovie(id);

        if (m == null) {
            System.out.println("Movie Not Found");
            return;
        }

        if (m.seats >= ticket) {
            m.seats = m.seats - ticket;
            System.out.println("Ticket Booked Successfully");
        } else {
            System.out.println("Seats Not Available");
        }
    }

    // Cancel Ticket
    void cancelTicket(String id, int ticket) {

        Movie m = searchMovie(id);

        if (m == null) {
            System.out.println("Movie Not Found");
            return;
        }

        m.seats = m.seats + ticket;
        System.out.println("Ticket Cancelled");
    }

    // Total Seats
    void totalSeats() {
        int total = 0;

        for (Movie m : movies) {
            total += m.seats;
        }

        System.out.println("Total Available Seats = " + total);
    }
}

//Admin Class
class Admin {

    BookingSystem bs;

    Admin(BookingSystem bs) {
        this.bs = bs;
    }

    void addMovie(String id, String name, String time, int seats) {
        bs.addMovie(id, name, time, seats);
    }

    void viewMovies() {
        bs.viewMovies();
    }

    void totalSeats() {
        bs.totalSeats();
    }
}

//User Class
class User {

    BookingSystem bs;

    User(BookingSystem bs) {
        this.bs = bs;
    }

    void bookTicket(String id, int ticket) {
        bs.bookTicket(id, ticket);
    }

    void cancelTicket(String id, int ticket) {
        bs.cancelTicket(id, ticket);
    }

    void searchMovie(String id) {

        Movie m = bs.searchMovie(id);

        if (m != null) {
            m.display();
        } else {
            System.out.println("Movie Not Found");
        }
    }

    void viewMovies() {
        bs.viewMovies();
    }
}

//Main Class
public class MovieBooking {
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    BookingSystem bs = new BookingSystem();

    Admin admin = new Admin(bs);
    User user = new User(bs);

    // Default Movies
    admin.addMovie("M101", "Leo", "10AM", 50);
    admin.addMovie("M102", "Jailer", "2PM", 40);

    while (true) {

        System.out.println("\n===== MOVIE BOOKING SYSTEM =====");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("3. Exit");
        System.out.print("Enter Choice : ");

        int choice = sc.nextInt();

        switch (choice) {

        //================ ADMIN =================

        case 1:

            while (true) {

                System.out.println("\n------ ADMIN MENU ------");
                System.out.println("1. Add Movie");
                System.out.println("2. View Movies");
                System.out.println("3. Total Seats");
                System.out.println("4. Back");
                System.out.print("Enter Choice : ");

                int a = sc.nextInt();

                switch (a) {

                case 1:

                    System.out.print("Enter Movie ID : ");
                    String id = sc.next();

                    System.out.print("Enter Movie Name : ");
                    String name = sc.next();

                    System.out.print("Enter Show Time : ");
                    String time = sc.next();

                    System.out.print("Enter Seats : ");
                    int seats = sc.nextInt();

                    admin.addMovie(id, name, time, seats);
                    break;

                case 2:
                    admin.viewMovies();
                    break;

                case 3:
                    admin.totalSeats();
                    break;

                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid Choice");
                }

                if (a == 4)
                    break;
            }

            break;

        //================ USER =================

        case 2:

            while (true) {

                System.out.println("\n------ USER MENU ------");
                System.out.println("1. View Movies");
                System.out.println("2. Book Ticket");
                System.out.println("3. Cancel Ticket");
                System.out.println("4. Search Movie");
                System.out.println("5. Back");
                System.out.print("Enter Choice : ");

                int u = sc.nextInt();

                switch (u) {

                case 1:
                    user.viewMovies();
                    break;

                case 2:

                    System.out.print("Enter Movie ID : ");
                    String bid = sc.next();

                    System.out.print("Enter Number of Tickets : ");
                    int bt = sc.nextInt();

                    user.bookTicket(bid, bt);
                    break;

                case 3:

                    System.out.print("Enter Movie ID : ");
                    String cid = sc.next();

                    System.out.print("Enter Number of Tickets : ");
                    int ct = sc.nextInt();

                    user.cancelTicket(cid, ct);
                    break;

                case 4:

                    System.out.print("Enter Movie ID : ");
                    String sid = sc.next();

                    user.searchMovie(sid);
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid Choice");
                }

                if (u == 5)
                    break;
            }

            break;

        case 3:
            System.out.println("Thank You!");
            sc.close();
            System.exit(0);

        default:
            System.out.println("Invalid Choice");
        }
    }
}
}