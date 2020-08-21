import java.util.*;

public class Ch8InputHandler {
    private static final String BLANK="";
    private String name;
    private String room;
    private String pwd;
    private Scanner scanner;

    public Ch8InputHandler(){
        name=BLANK;
        room=BLANK;
        pwd=BLANK;
        scanner=new Scanner(System.in);
    }
    public void getInput(){
        System.out.print("Enter Name");
        name=scanner.next();

        System.out.print("Enter Room No.:");
        room=scanner.next();

        System.out.print("Enter Password: ");
        pwd=scanner.next();
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getPwd() {
        return pwd;
    }
}
