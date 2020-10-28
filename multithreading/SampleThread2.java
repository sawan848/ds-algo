package multithreading;
import static java.lang.Thread.*;
/*
 * @author:Saawan
 * @created:[10/27/2020],Tuesday
 * Time:9:51 PM
 */
class Sample implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sample 1");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(currentThread());
    }
}
class Sample2 implements  Runnable{
    public static  int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sample 2");
            count++;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThread());
    }
}
public class SampleThread2 {

    public static void main(String[] args)  {
        Sample sample=new Sample();
        Runnable sample2=new Sample2();

        Thread thread=new Thread(sample);
        Thread thread1=new Thread(sample2);
        thread.start();
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
