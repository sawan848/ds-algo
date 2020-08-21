import java.util.Scanner;

public class LoanCalculator {
    private Loan loan;

    public static void main(String[] args) {
        LoanCalculator calculator=new LoanCalculator();
        calculator.start();
    }

    public LoanCalculator() {
        loan = new Loan();
    }

    public void start() {
        getInput();
        computePayment();
        displayOutput();
        describeProgram();
    }

    private void getInput() {
        /*
        * gets three input values-loan amount,interest rate, and
        * loan perod-using an inputNox object */

        double loanAmount,annualInterestRate;
        int loanPeriod;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Loan Amount(Dollars+cents):");
        loanAmount=scanner.nextDouble();
        System.out.print("Annual Interest Rate(e.g,9.5):");
        annualInterestRate=scanner.nextDouble();
        System.out.print("Loan Period- # of years:");
        loanPeriod=scanner.nextInt();

        loan=new Loan(loanAmount,annualInterestRate,loanPeriod);

    }
    private void computePayment() {
        /*
         * compute the monthly and total loan payments */
        System.out.println("inside computePayment");
        loan=new Loan(loan.getAmount(), loan.getRate(), loan.getPeriod());


    }

    private void describeProgram() {
        /*
        * provides a brief explanation of the program to the user */
        System.out.println("inside describePayment");
        System.out.println
                ("This program computes the monthly and total");
        System.out.println
                ("payments for a given loan amount, annual ");
        System.out.println
                ("interest rate, and loan period (# of years).");
        System.out.println("\n");
    }

    private void displayOutput() {
        /*
        * display the input values and monthly and total payments */

        System.out.println("inside displayOutput");
        System.out.println("Loan Amount: $"+loan.getAmount());
        System.out.println("Annual Interest Rate:"+loan.getRate()+"%");
        System.out.println("Loan Period(years):"+loan.getPeriod());

        System.out.println("Monthly Payment is: $"+loan.getMonthlyPayment());
        System.out.println("Total Payment is: "+loan.getTotalPayment());


    }



}
