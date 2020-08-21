import java.io.*;
import java.util.*;

public class Ch8EntranceMonitor {

    private Ch8Dorm manager;
    //private Ch8Door door;
    private Ch8InputHandler input;
    private Scanner scanner;

    public Ch8EntranceMonitor() {
       manager=new Ch8Dorm();
       scanner=new Scanner(System.in);
       input=new Ch8InputHandler();
      // door=new Ch8Door();

    }

    public static void main(String[] args) {
        Ch8EntranceMonitor sentry=new Ch8EntranceMonitor();
        sentry.start();
    }
    public void start(){
        openFile();
        String roster=manager.getResidentList();
        System.out.println(roster);
        processInputData();
    }
    private void openFile(){
        String filename;
        while (true){
            System.out.println("File to open('x' to cancel)");
            filename=scanner.next();
            if (filename.equals("x")){
                System.out.println("Program is canceled");
                System.exit(0);
            }
           try {
                manager.openFile(filename);
                  return;
           } catch (IOException e){
                System.out.println("error in reading file");
             }
        }
    }
    private void processInputData(){
        String name,room,pwd;
        while (true){
            input.getInput();
            name=input.getName();
            room=input.getRoom();
            pwd=input.getPwd();
            validate(name,room,pwd);
        }
    }
    private void validate(String name,String room,String password){
        Ch8Resident res=manager.getResident(name);

        if (res==null){
            System.out.println("Invalid Entry");
        }else if(res.getName().equals(name) &&
        res.getRoom().equals(room)&&
        res.getPassword().equals(password)){
           // door.open();
            System.out.println("error");
        }else {
            System.out.println("Invaild entry");

        }
    }
}
