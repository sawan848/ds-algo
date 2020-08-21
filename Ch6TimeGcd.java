import java.util.Date;
import java.util.Scanner;

//Sample Program: Time the performance of gcd methods
public class Ch6TimeGcd {
    private static enum ComputationType {BRUTE_FORCE,EUCLID};

    BruteForceAlgo bruteForceAlgo=new BruteForceAlgo();
    private Scanner scanner;

    public static void main(String[] args) {
        Ch6TimeGcd tester=new Ch6TimeGcd();

        tester.start();
        System.exit(0);
    }
    public Ch6TimeGcd(){
        scanner=new Scanner(System.in);
    }
    public void start(){
        long bruteForceTime,euclidTime;
        int m,n;
        while (isContinue()){
            m=getPositiveInteger();
            n=getPositiveInteger();

            bruteForceTime=timeMethod(m,n,ComputationType.BRUTE_FORCE);
            euclidTime=timeMethod(m,n,ComputationType.EUCLID);

            System.out.println("M: "+m);
            System.out.println("N: "+n);
            System.out.println("BruteForceTime: "+bruteForceTime);
            System.out.println("Euclidean Time: "+euclidTime +" ");
        }
    }
    private long timeMethod(int m,int n,ComputationType type){
        Date startTime,endTime;
        startTime=new Date();

        if (type == ComputationType.BRUTE_FORCE){
            bruteForceAlgo.gcd_bruteForce(m,n);
        }else {
            bruteForceAlgo.euclid_gcd(m,n);
        }
        endTime=new Date();
        return (endTime.getTime()-startTime.getTime());

    }
    private int getPositiveInteger(){
        int input;
        while (true){
            System.out.println("Eenter positive integer(0 is okey):");
            input=scanner.nextInt();
            if (input>=0)break;
            System.out.println("input must be 0 be or more");
        }
        return input;
    }
    private  boolean isContinue(){
        String input;
        boolean response=false;
        System.out.print("Run test? ");
        input=scanner.next();
        if (input.equals("Y")||input.equals("y")){
            response=true;
        }
        return response;
    }
}
