package Assignment;

public class Booking {

    private static int currentBookingNo = 101;
    private int bookingNo;
    private BoothBooking boothBooking;

    public Booking() {

    }

    public Booking(BoothBooking boothBooking) {
        this.bookingNo = currentBookingNo;
        this.boothBooking = boothBooking;

        currentBookingNo++;
    }

    public static int getCurrentBookingNo() {
        return currentBookingNo;
    }

    public static void setCurrentBookingNo(int currentBookingNo) {
        Booking.currentBookingNo = currentBookingNo;
    }

    public int getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(int bookingNo) {
        this.bookingNo = bookingNo;
    }

    public BoothBooking getBoothBooking() {
        return boothBooking;
    }

    public void setBoothBooking(BoothBooking boothBooking) {
        this.boothBooking = boothBooking;
    }

    @Override
    public String toString() {
        return String.format("%-11s %s", bookingNo, boothBooking.toString());
    }

}
