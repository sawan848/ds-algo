/*
this program use the Bicycle and Account class
this is the example on the book ->
 */

public class SecondMain {
    public static void main(String[] args) {
        Bicycle bike;
        Account acct;

        String myName="Jon Devis";

        bike=new Bicycle();
        bike.setOwnerName(myName);

        acct=new Account();
        acct.setOwnerName(myName);
        acct.setInitialBalance(200.00);

        acct.add(25.00);
        acct.deduct(50);

        System.out.println(bike.getOwnerName()+" owns a bicycle and");
        System.out.println("has $"+acct.getCurrentBalance()+
                "left in the bank");
        //example question 1
        Account acct1;
        acct1=new Account();
        acct1.setInitialBalance(250);
        acct1.add(20);
        System.out.println("Balance :"
                            +acct1.getCurrentBalance());

        //example question 2
        Account acct2,acct3;
        acct2=new Account();
        acct3=new Account();
        acct2.setInitialBalance(300);
        acct3.setInitialBalance(500);
        System.out.println(bike.getOwnerName()+" :"+acct2.getCurrentBalance());
        System.out.println(bike.getOwnerName()+" :"+acct3.getCurrentBalance());
    }
}
