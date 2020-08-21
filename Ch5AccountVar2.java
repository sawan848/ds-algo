public class Ch5AccountVar2 {
    private String ownerName;
    private double balance;
    private boolean active;

    public Ch5AccountVar2(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
        setActive(true);
    }

    private void setActive(boolean state) {
        active=state;
    }

    public boolean isActive() {
        return active;
    }


    public void add(double amt){
        if (isActive() &&amt>0){
            balance=balance+amt;
        }
    }
    public void close(){
        setActive(false);
    }
    public void deduct(double amt){
        if (isActive() &&amt>0){
            double newBalance=balance-amt;
            if (newBalance>=0){
                balance=newBalance;
            }
        }
    }
    public double getCurrentBalance(){
        return balance;
    }
    public String getOwnerName(){return ownerName;}

    public void setOwnerName(String ownerName) {
        if (ownerName.length()>=3){
            ownerName = ownerName;
        }else {
            System.out.println("Enter a valid name:");
        }
    }

}
