package multithreading;
/*
 * @author:Saawan
 * @created:[10/27/2020],Tuesday
 * Time:10:14 PM
 */
import static java.lang.Thread.*;
public class Sample3Thread {
    public static void main(String[] args) throws Exception {
      Thread thread=new Thread();
        {
                for (int i = 0; i < 5; i++){
                    System.out.println("SampleThread 1");
                    try {
                        sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

       Thread thread1=new Thread();
       {
                for (int i = 0; i < 5; i++){
                    System.out.println("SampleThread 2");
                    try {
                        sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        thread.start();
        sleep(10);
        thread1.start();
    }
}
