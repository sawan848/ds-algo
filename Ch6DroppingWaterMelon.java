import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ch6DroppingWaterMelon {
    public static void main(String[] args) {
        double initialHeight,
                position,touchTime;

        Scanner scanner=new Scanner(System.in);
        Date date=new Date();
        System.out.println(date.toString());

        System.out.print("Initial Height:");
        initialHeight=scanner.nextDouble();
        touchTime=Math.sqrt(initialHeight/16.0);
        System.out.println(touchTime);
        touchTime=Math.round(touchTime*1000.0)/10000.0;
        System.out.println(touchTime);
        System.out.println("\n\n     Time t      position at Time t\n");

        for (int time=0;time<touchTime;time++){
            position=-16.0*time*time+initialHeight;
            System.out.print("      "   +time);
            System.out.println("       "+position);
        }
        System.out.println("  "+touchTime+"      0.00");
    }

}
