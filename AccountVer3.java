public class AccountVer3 {
    private static final double FEE=0.50;
    private String ownerName;
    private double balance;

    public AccountVer3(String name, double startingBalance) {
        this.ownerName = name;
        this.balance = startingBalance;
    }

    public void  deduct(double amt){
        balance=balance-amt-FEE;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getCurrentBalance() {
        return balance;
    }
}
