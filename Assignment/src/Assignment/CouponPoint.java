
package Assignment;

public class CouponPoint {
    
    private int p1;
    private int p2;
    private int p3;
    private int p4;
    private int p5;
    private int p6;
    
    private int totalP1;
    private int totalP2;
    private int totalP3;
    private int totalP4;
    private int totalP5;
    private int totalP6;
    
    private double totalPoints;
    
    public CouponPoint(int p1, int p2, int p3, int p4, int p5, int p6) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }

    CouponPoint() {

    }
    
    public void addP1(int quantity) {
        totalP1 += quantity;
    }

    public void addP2(int quantity) {
        totalP2 += quantity;
    }
    
    public void addP3(int quantity) {
        totalP3 += quantity;
    }

    public void addP4(int quantity) {
        totalP4 += quantity;
    }
    
    public void addP5(int quantity) {
        totalP5 += quantity;
    }

    public void addP6(int quantity) {
        totalP6 += quantity;
    }
    
    public double totalNeedPay(){
        return totalP1 + (totalP2 * 5) + (totalP3 * 10) + (totalP4 * 15) + (totalP5 * 30) + (totalP6 * 50);
    }
    
    public double totalCouponGain(){
        return totalP1 + (totalP2 * 7) + (totalP3 * 15) + (totalP4 * 25) + (totalP5 * 45) + (totalP6 * 70);
    }
    
}
