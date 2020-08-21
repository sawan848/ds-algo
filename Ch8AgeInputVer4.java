import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch8AgeInputVer4 {
    private static final String DEFAULT_MESSAGE="You";
    private static final int DEFAULT_LOWER_BOND=0;
    public static final int DEFAULT_UPPER_BOUND=99;

    private int lowerBound;
    private int upperBound;
    private Scanner scanner;

    public Ch8AgeInputVer4(){
        init(DEFAULT_LOWER_BOND,DEFAULT_UPPER_BOUND);
    }

    public Ch8AgeInputVer4(int low,int high)
            throws IllegalArgumentException{
        if (low>high){
            throw new IllegalArgumentException(
                    "Low ("+low+")was"+"larger than high("
                    +high+")"
            );
        }else {
            init(low,high);
        }
    }
    public int getAge()throws Exception{
        return getAge(DEFAULT_MESSAGE);
    }
    public int getAge(String prompt) throws Exception{
        int age;
        while (true){
            System.out.print(prompt);
            try {
                age=scanner.nextInt();
                if (age<lowerBound || age>upperBound){
                    throw new Exception("Input out of Bound");
                }
                return age;
            }catch (InputMismatchException e){
                scanner.next();
                System.out.println("Input is invalid.\n"
                +"Please enter digits only");
            }
        }
    }
    public void init(int low,int high){
        lowerBound=low;
        upperBound=high;
        scanner=new Scanner(System.in);
    }
}

