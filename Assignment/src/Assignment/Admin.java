
package Assignment;

public class Admin extends Account {
    
    public String adminID;
    public String adminPassword;
    public static Admin[] admins = new Admin[4];
    public static int adminCount = 0;
    
    public Admin(String adminID, String adminPassword, String email, String name) {
        super(email, name);
        this.adminID = adminID;
        this.adminPassword = adminPassword;
        
        admins[adminCount] = this;
        adminCount++;
    }
    
    public static Admin authenticate(String adminID, String adminPassword){
        for(int i = 0; i < adminCount; i++){
            Admin admin = admins[i];
            if(admin.adminID.equals(adminID) && admin.adminPassword.equals(adminPassword)){
                return admin;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return "1. ";
    }
    
}
