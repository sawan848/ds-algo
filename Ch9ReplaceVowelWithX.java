import java.util.Scanner;

public class Ch9ReplaceVowelWithX {
    public static void main(String[] args) {
        Scanner scanner=new
                Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        StringBuffer tempBuffer;
        String inSentence;

        int numberOfCharacters;
        char letter;

        System.out.println("Sentence:");
        inSentence=scanner.next();
        tempBuffer=new StringBuffer(inSentence);
        numberOfCharacters=tempBuffer.length();

        for (int index =0;index<numberOfCharacters;index++){
            letter=tempBuffer.charAt(index);

            if (letter=='a'|| letter=='A' ||
                letter=='e'|| letter=='E' ||
                letter=='i'|| letter=='I' ||
                letter=='o'|| letter=='O' ||
                letter=='u'|| letter=='U'
            ){
                tempBuffer.setCharAt(index,'X');
            }
        }
        System.out.println("Input: "+inSentence);
        System.out.println("Output: "+tempBuffer);
    }
}
