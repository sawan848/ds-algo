package multithreading;
import static java.lang.Thread.sleep;
/*
 * @author:Saawan
 * @created:[10/29/2020],Thursday
 * Time:8:55 PM
 * isAlive and join method
 */
public class Sample4Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->
        {
            for (int i = 0; i < 6; i++) {
                System.out.println("Thread1");
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
                System.out.println("Thread2");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );
        thread.start();
        sleep(10);
        thread1.start();

        boolean c=thread1.isAlive();
        System.out.println(c);

        thread.join();
        thread1.join();

        boolean d=thread1.isAlive();
        System.out.println(d);

        System.out.println("Bye");
    }
}
