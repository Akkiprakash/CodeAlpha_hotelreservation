public class Booking {
    private String customerName;
    private int roomNumber;
    private boolean isPaid;

    public Booking(String customerName, int roomNumber) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.isPaid = false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void makePayment() {
        this.isPaid = true;
    }

    @Override
    public String toString() {
        return "Booking for " + customerName + " in Room " + roomNumber + " (Paid: " + isPaid + ")";
    }
}
