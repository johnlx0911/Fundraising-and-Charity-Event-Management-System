
package Assignment;

public class Donation {
    
    private String userID;
    private String name;
    private String organization;
    private double amount;
            
    public Donation(){
        
    }
    
    public Donation(String loginID, String name, String organization, double amount){
        this.userID = loginID;
        this.name = name;
        this.organization = organization;
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return String.format("%-11s %-18s %-20s %.2f", userID, name, organization, amount);
    }
    
}
