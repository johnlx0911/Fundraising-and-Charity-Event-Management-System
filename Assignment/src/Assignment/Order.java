
package Assignment;

public class Order {
    private String boothType;
    private String boothName;
    private String foodName;
    private double foodCost;
    private int quantity;
    private static int currentOrderNo = 1001;
    private int orderNo;
   
    public static void setCurrentBookingNo(int currentBookingNo) {
        Order.currentOrderNo = currentBookingNo;
    }

    public Order(String boothType, String boothName, String foodName, double foodCost) {
        this.boothType = boothType;
        this.boothName = boothName;
        this.foodName = foodName;
        this.foodCost = foodCost;
    }

    public Order(String boothType, String boothName, String foodName, double foodCost, int quantity, double subTotal) {
        this.orderNo = currentOrderNo;
        this.boothType = boothType;
        this.boothName = boothName;
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.quantity = quantity;
       
        currentOrderNo++;
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

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 10) {
            this.quantity = quantity;
            return true;
        } else {
            throw new IllegalArgumentException("You can order only 1 - 10 orders at a time");
           
        }
    }

    public static int getCurrentOrderNo() {
        return currentOrderNo;
    }

    public static void setCurrentOrderNo(int currentOrderNo) {
        Order.currentOrderNo = currentOrderNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
   
    public double calculateSubtotal() {
        return foodCost * quantity;
    }
   
    @Override
    public String toString(){
        return String.format("%-9s %-11s %-15s %-30s %-6.2f %-4d %-10.2f", orderNo,boothType, boothName, foodName,foodCost, quantity, calculateSubtotal());
    }
   
}
