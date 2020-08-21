import java.util.*;

public class Ch6HiLo {
    private static enum Response {YES,NO};
    private Scanner scanner;
    private final int MAX_GUESS_ALLOWED=6;
    private final int LOWER_BOUND=1;
    private final int UPPER_BOUND=100;
    private int secretNumber;
    private Random random;


    public static void main(String[] args) {
        Ch6HiLo hiLo=new Ch6HiLo();
        hiLo.start();
    }

    public Ch6HiLo() {
      scanner = new Scanner(System.in);
      random=new Random();
    }
    public void start(){
        Response answer;
        describeRule();
        answer=prompt("do you want to play to hi-lo game?.");

        while (answer==Response.YES){
            generateSecretNumber();
            playGame();
            answer=prompt("Do you want to play game:");
        }
        System.out.println("Thank you for playing hi-lo:");

    }
   private void describeRule(){
       System.out.println("Inside describe:");
    }
    private void generateSecretNumber(){
        System.out.println("Inside generate secrete number:");

        secretNumber=random.nextInt(100)+1;
        System.out.println("Secret number: "+secretNumber);
    }

    private void playGame(){
        int guessCount=0;
        int guess;
        System.out.println("Inside play:");
        do {
            guess=getNextGuess();
            guessCount++;
            if (guess<secretNumber){
                System.out.println("Your guess is LO ");
            }
            else if (guess>secretNumber){
                System.out.println("Your guess is Hi");
            }
        }while (guessCount<MAX_GUESS_ALLOWED
                && guess != secretNumber);

        if (guess ==secretNumber){
            System.out.println("you guessed it in"
            + guessCount+"tries");
        }else {
            System.out.println("you lost.secret no. was"+secretNumber);
        }
    }

    private int getNextGuess(){

        int input;

        while (true){
            System.out.println("Next Guess:");
            input=scanner.nextInt();
            if (LOWER_BOUND <= input && input<=UPPER_BOUND){
                return input;
            }
            System.out.println("Invalid Input:"+
                    "Must be between"+LOWER_BOUND+
                    "and"+UPPER_BOUND);

        }

    }

    private Response prompt(String question){
        String input;
        Response response=Response.NO;
        System.out.println(question +"(Yes-y;No-n):");
        input=scanner.next();

        if (input.equals("Y") || input.equals("y")){
            response=Response.YES;
        }
        return response;
    }
}

