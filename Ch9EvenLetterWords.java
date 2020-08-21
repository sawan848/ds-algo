import java.util.Scanner;

public class Ch9EvenLetterWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean repeat=true;
        String word;
        StringBuffer tempBuffer=new StringBuffer("");
        while (repeat){
            System.out.println("Next word");
            word=scanner.next();
            if (word.equals("STOP")){
                repeat=false;
            }else if (word.length()%2==0){
                tempBuffer.append(word+"");
            }
        }
        System.out.println("Output: "+tempBuffer);
    }
}
