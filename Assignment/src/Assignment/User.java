
package Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class User extends Account {
    
    public String userID;
    public String userPassword;
    public static User[] users = new User[100];
    public static int userCount = 0;
    public double couponBalance;
    public double pointBalance;
    public static HashMap<String, ArrayList<String>> userMap = new HashMap<>();
    public static HashMap<String, ArrayList<Double>> userBalanceMap = new HashMap<>();
    public static HashMap<String, ArrayList<Booking>> userBooking = new HashMap<>();
    public static HashMap<String, ArrayList<Order>> userOrder = new HashMap<>();

    public User(){
        
    }
    
    public User(String userID, String name, String email){
        this.userID = userID;
        this.name = name;
        this.email = email;
    }
    
    public User(String userID, String userPassword, String name, String email, double couponBalance, double pointBalance) {
        super(name, email);
        this.userID = userID;
        this.userPassword = userPassword;
        this.couponBalance = couponBalance;
        this.pointBalance = pointBalance;
        
        if(userMap.containsKey(userID)){
            throw new IllegalArgumentException("User ID already exist, please choose a different user ID");
        }
        
        users[userCount] = this;
        userCount++;
        
        ArrayList<String> userData = new ArrayList<>();
        userData.add(this.userID);
        userData.add(this.email);
        userData.add(this.name);
        userData.add(this.userPassword);
        
        ArrayList<Double> userBalance = new ArrayList<>();
        userBalance.add(this.couponBalance);
        userBalance.add(this.pointBalance);
        
        userMap.put(this.userID, userData);
        userBalanceMap.put(this.userID, userBalance);
    }
    
    public static User authenticate(String userID, String userPassword){
        for(int i = 0; i < userCount; i++){
            User user = users[i];
            if(user.userID.equals(userID) && user.userPassword.equals(userPassword)){
                return user;
            }
        }
        return null;
    }
    
    public void addBooking(String userID, Booking booking){
        ArrayList<Booking> userBookings = userBooking.getOrDefault(userID, new ArrayList<>());
        userBookings.add(booking);
        userBooking.put(userID, userBookings);
    }
    
    public void addOrder(String userID, Order order){
        ArrayList<Order> userOrders = userOrder.getOrDefault(userID, new ArrayList<>());
        userOrders.add(order);
        userOrder.put(userID, userOrders);
    }
    
    public String getName(String userID){
        ArrayList<String> userData = userMap.get(userID);
        return userData.get(2);
    }
    
    public String getPassword(String userPassword){
        ArrayList<String> userData = userMap.get(userPassword);
        return userData.get(3);
    }
    
    public void addCouponBalance(String userID, double amount){
        ArrayList<Double> userCouponBalance = userBalanceMap.get(userID);
        double currUserCoupon = userCouponBalance.get(0);
        currUserCoupon += amount;
        userCouponBalance.set(0, currUserCoupon);
    }
    
    public void useCouponBalance(String userID, double amount){
        ArrayList<Double> userCouponBalance = userBalanceMap.get(userID);
        double currUserCoupon = userCouponBalance.get(0);
        currUserCoupon -= amount;
        userCouponBalance.set(0, currUserCoupon);
    } 
    
    public void addPointBalance(String userID, double amount){
        ArrayList<Double> userCouponBalance = userBalanceMap.get(userID);
        double currUserPoint = userCouponBalance.get(1);
        currUserPoint += amount;
        userCouponBalance.set(1, currUserPoint);
    }
    
    public void usePointBalance(String userID, double amount){
        ArrayList<Double> userCouponBalance = userBalanceMap.get(userID);
        double currUserPoint = userCouponBalance.get(1);
        currUserPoint -= amount;
        userCouponBalance.set(1, currUserPoint);
    }
    
    public double getCouponBalance(String userID){
        ArrayList<Double> userCouponBalance = userBalanceMap.get(userID);
        return userCouponBalance.get(0);
    }
    
    public double getPointBalance(String userID){
        ArrayList<Double> userPointBalance = userBalanceMap.get(userID);
        return userPointBalance.get(1);
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-20s", userID, name, email);
    }
    
}
