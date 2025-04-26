
package Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Payment {
    
    private double amount;
    private HashMap<String, ArrayList<Payment>> userPayments;
    
    public Payment(){
        
    }   

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void processPayment() {
        System.out.println("Processing payment of RM" + amount);
    }
    
    public void addPayment(String userID, Payment payment) {
        userPayments.get(userID).add(payment);
    }
            
} 
