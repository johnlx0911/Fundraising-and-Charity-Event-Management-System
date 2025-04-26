
package Assignment;

public class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Credit card payment of RM" + getAmount() + " with card number " + cardNumber + " processed.");
    }
}
