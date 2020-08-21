import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9LocateJavaPM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String document;
        Matcher matcher;
        Pattern pattern=Pattern.compile(
                "java", Pattern.CASE_INSENSITIVE
        );
        System.out.println("Sentence:");
        document=scanner.next();
        matcher=pattern.matcher(document);

        while (matcher.find()){
            System.out.println(document.substring(
                    matcher.start(),matcher.end())+"found at postion"+matcher
                    .start()
            );
        }



    }
}
