package multithreading;
import static java.lang.Thread.sleep;
/*
 * @author:Saawan
 * @created:[10/29/2020],Thursday
 * Time:9:07 PM
 * setName in Thread
 */
public class SampleThread5 {
    public static void main(String[] args) throws Exception {
        Thread thread=new Thread(()->
        {
            for (int i = 0; i < 6; i++) {
                System.out.println("Thread 1");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );
        Thread thread1=new Thread(()->
        {
            for (int i = 0; i < 6; i++) {
                System.out.println("Thread 2");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } ,"thread 2" );
        thread.setName("thread 1");
        System.out.println(thread.getName());
        System.out.println(thread.getUncaughtExceptionHandler());
        System.out.println(thread1.getName());
        thread1.start();
        sleep(10);
        thread.start();

    }
}
