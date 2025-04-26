package Assignment;

public class BoothBooking {

    private String Date;
    private String Time;
    private static int availableSlots = 50;
    private BookingDetails details;

    public BoothBooking() {

    }

    public BoothBooking(String Time) {
        this.Time = Time;
    }

    public BoothBooking(String Date, String Time) {
        this.Date = Date;
        this.Time = Time;
    }

    public BoothBooking(String Date, String Time, BookingDetails details) {
        this.Date = Date;
        this.Time = Time;
        this.details = details;
    }

    public static int getAvailableSlots() {
        return availableSlots;
    }

    public static void setAvailableSlots(BookingDetails details, int availableSlots) {
        int numberOfPeople = details.getNumberOfPeople();
        BoothBooking.availableSlots -= numberOfPeople;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public BookingDetails getDetails() {
        return details;
    }

    public void setDetails(BookingDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return String.format("%-11s %-18s %s", Date, Time, details.toString());
    }

}
