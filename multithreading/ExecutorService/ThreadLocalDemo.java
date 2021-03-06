package ExecutorService;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Thread.sleep;

/*
 * @author:Saawan
 * @created:[11/2/2020],Monday
 * Time:5:41 PM
 */
public class ThreadLocalDemo implements Runnable {
//    public static Integer numbers=new Integer(10);
    static ThreadLocal<Integer>numbers=new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new ThreadLocalDemo());
        Thread t2=new Thread(new ThreadLocalDemo());
        Thread t3=new Thread(new ThreadLocalDemo());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
    @Override
    public void run() {
//        numbers=(int)(Math.random()*100);
        numbers.set((int)(Math.random()*100));
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(numbers);
        System.out.println(numbers.get());

    }


}
