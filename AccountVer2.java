public class AccountVer2 {
    private String ownerName;
    private double balance;

    public AccountVer2(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }
    //adds the passed amount to the balance
    public void  add(double amt){ balance =balance+amt;}

    //deducts the passed amount from the balance
    public  void  deduct(double amt){balance=balance-amt;}
    //returns the current balance of this account
    public double getCurrentBalance(){return balance;}

    //returns the name of this account owner
    public  String getOwnerName(){return ownerName;}
    //assigns the name of this account`s owner
    public void setOwnerName(String name){ownerName=name;}
}
