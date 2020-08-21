import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR=12;
        final byte PERCENT=100;

        int princialAmount=0;
        float monthlyInterest=0;
        int numberOfPayments=0;

        Scanner scanner=new Scanner(System.in);

        while (true) {
            System.out.print("Princial Amount: ");
            princialAmount=scanner.nextInt();
            if(princialAmount>=1000 && princialAmount<=1e6)
                 break;
            System.out.println("enter a value between 1000 and 1_000_000");
        }
        while (true) {
            System.out.print("Annual Interest: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >=1 && annualInterest<=30) {
                monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
            
        }
        while (true) {
         
            System.out.print("Years: ");
            byte Years = scanner.nextByte();
            if (Years>=1 && Years<=30) {
                numberOfPayments = Years * MONTH_IN_YEAR;
                break;   
            }   
        }

        double mortgage=princialAmount *(MONTH_IN_YEAR*Math.pow(1+monthlyInterest, numberOfPayments))
                            /(Math.pow(1+monthlyInterest, numberOfPayments)-1);

        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " +mortgageFormatted);


    }
}