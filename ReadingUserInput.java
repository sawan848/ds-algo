import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        byte age=scanner.nextByte();
        System.out.println("Your Name: "+ name);
        System.out.println("Your Age: " + age);
    }

}