import java.text.*;
import java.util.*;


public class Ch6SleepStatistics {
    private Scanner scanner;

    public static void main(String[] args) {
        Ch6SleepStatistics prog=new Ch6SleepStatistics();
        prog.start();
    }

    public Ch6SleepStatistics() {
        scanner=new Scanner(System.in);
        //scanner.useDelimiter(System.getProperty("line.seprator"));

    }
    public void start(){
        double sleepHour,sum=0;
        int cnt=0;
        System.out.print("Dorm name:");
        String dorm=scanner.next();
        sleepHour=getDouble("Entr sleep hour(0-to stop):");
         while (sleepHour !=0){
             sum = sum + sleepHour;
             cnt++;
             sleepHour=getDouble("Enter the sleep hours (0-to stop");
         }
         if (cnt==0){
             System.out.println("No data entered");
         }else {
             DecimalFormat decimalFormat=new DecimalFormat("0.00");
             System.out.println(
                     "Average Sleep time for"+dorm
                     +"is \n\n "+decimalFormat.format(sum/cnt)+"hours"
             );
         }
    }


    private double getDouble(String message) {
        double result;
        System.out.println(message);
        result=scanner.nextDouble();
        return result;
    }
}
