
package Assignment;

public class EWallet extends Payment {
    private String eWalletId;

    public EWallet(double amount, String eWalletId) {
        super(amount);
        this.eWalletId = eWalletId;
    }

    @Override
    public void processPayment() {
        System.out.println("E-Wallet payment of RM" + getAmount() + " from eWallet ID " + eWalletId + " completed.");
    }
}

