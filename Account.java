public class Account {
    private  String ownerName;
    private double balance;

    public Account() {
        ownerName = "Unassigned";
        balance = 0.0;
    }
    //add the passed amount to the balance
    public  void add(double amt){
        balance=balance+amt;
    }
    //deduct the passed amount from the balance
    public void deduct(double amt){
        balance=balance-amt;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public void setOwnerName(String myName) {
        ownerName=myName;
    }

    public void setInitialBalance(double bal) {
        balance=bal;
    }
}
