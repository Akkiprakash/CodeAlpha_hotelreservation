import java.util.Scanner;

public class HotelReservationApp {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        // Initialize hotel with rooms
        hotel.addRoom(new Room(101, "Standard"));
        hotel.addRoom(new Room(102, "Deluxe"));
        hotel.addRoom(new Room(103, "Suite"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHotel Reservation System Menu:");
            System.out.println("1. Show Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Show All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.showAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    System.out.print("Enter room number to book: ");
                    int roomNum = scanner.nextInt();
                    hotel.bookRoom(name, roomNum);
                    break;
                case 3:
                    System.out.print("Enter room number to cancel booking: ");
                    int cancelRoom = scanner.nextInt();
                    hotel.cancelBooking(cancelRoom);
                    break;
                case 4:
                    hotel.showAllBookings();
                    break;
                case 5:
                    System.out.println("Exiting Hotel Reservation System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
