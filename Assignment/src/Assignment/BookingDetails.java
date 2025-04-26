package Assignment;

public class BookingDetails {

    private String boothType;
    private String boothName;
    private String theme;
    private double boothCost;
    private int numberOfPeople;
    private double subtotal;

    public BookingDetails(String boothType, String boothName, String theme, double boothCost) {
        this.boothType = boothType;
        this.boothName = boothName;
        this.theme = theme;
        this.boothCost = boothCost;
    }

    public BookingDetails(String boothType, String boothName, String theme, double boothCost, int noOfPax, double subTotal) {
        this.boothType = boothType;
        this.boothName = boothName;
        this.theme = theme;
        this.boothCost = boothCost;
        this.numberOfPeople = noOfPax;
        this.subtotal = subTotal;

    }

    public String getBoothType() {
        return boothType;
    }

    public void setBoothType(String boothType) {
        this.boothType = boothType;
    }

    public String getBoothName() {
        return boothName;
    }

    public void setBoothName(String boothName) {
        this.boothName = boothName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getBoothCost() {
        return boothCost;
    }

    public void setBoothCost(double boothCost) {
        this.boothCost = boothCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public boolean setNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople >= 1 && numberOfPeople <= 50) {
            this.numberOfPeople = numberOfPeople;
            return true;
        } else {
            throw new IllegalArgumentException("One booking can book only 5 - 10 pax");

        }
    }

    public double calculateSubtotal() {
        return boothCost * numberOfPeople;
    }

    @Override
    public String toString() {
        return String.format("%-11s %-20s %-32s %-6.2f %-4d %-10.2f", boothType, boothName, theme, boothCost, numberOfPeople, calculateSubtotal());
    }

}
