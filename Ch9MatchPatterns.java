import java.util.Scanner;

public class Ch9MatchPatterns {
    private static final String STOP="STOP";
    private static final String VALID="Valid Java Identifier";
    public static final String  INVALID="Not a valid Java identifier";
    public static final String VALID_IDENTIFIER_PATTERN=
            "[a-zA-Z][a-zA-Z0-9_$]*";

    public static void main(String[] args) {
        while (true){
            System.out.println("Idendifier:");
            Scanner scanner =new Scanner(System.in);
            String str,reply;
            str=scanner.next();
            if (str.equals(STOP)) break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)){
                reply=VALID;
            }else {
                reply=INVALID;
            }
            System.out.println(str+ ":"+reply+"\n");
        }



    }

}