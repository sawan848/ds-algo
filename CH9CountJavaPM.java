import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* count the number of ti0mes the word 'Java' occurs
* in input sentence using pattern matching
*
* */
public class CH9CountJavaPM {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        String document;
        int javaCount;
        Matcher matcher;
        Pattern pattern=
                Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        System.out.println("Sentence:");
        document=scanner.next();
        javaCount=0;
        matcher=pattern.matcher(document);

        while (matcher.find()){
            javaCount++;
        }
        System.out.println(
                "The word 'java' occurred "+javaCount+"times."
        );

    }
}
