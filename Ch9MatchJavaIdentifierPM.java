
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9MatchJavaIdentifierPM {
    private static final String STOP="STOP";
    private static final String VALID="Valid Java identifier";
    private static final String INVALID="Not a valid Java identiier";
    private static final String VALID_IDENTIIFIER_PATTERN=
            "[a-zA-Z][a-zA-Z0-9_$]*";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Matcher matcher;
        String str,reply;
        Pattern pattern=
                Pattern.compile(VALID_IDENTIIFIER_PATTERN);

        while (true){

            System.out.println("Identifier:");
            str=scanner.next();

            if (str.equals(STOP))break;

            matcher=pattern.matcher(str);

            if (matcher.matches()){
                reply=VALID;
            }else {
                reply=INVALID;
            }
            System.out.println(str+":"+reply+"\n");
        }
    }
}
