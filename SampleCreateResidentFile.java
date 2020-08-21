import java.io.IOException;
import java.util.Scanner;

public class SampleCreateResidentFile {

    public static void main(String[] args)
            throws IOException {
        Ch8Resident res;
        Ch8Dorm manager=new Ch8Dorm();

        res=new Ch8Resident("John","1-101","1A#2!xb");
        manager.add(res);

        res=new Ch8Resident("Java","1-102","XXyy22&#");
        manager.add(res);

        res=new Ch8Resident("jill","3-232","!DxA2a4");
        manager.add(res);
        res=new Ch8Resident("jack","3-232","2%Az8#Qm");
        manager.add(res);
        Scanner scanner=new Scanner(System.in);
        System.out.println("save to which file:");
        String filename=scanner.next();
        manager.saveFile(filename);
        System.exit(0);

    }
}
