package multithreading;
import static java.lang.Thread.*;
/*
 * @author:Saawan
 * @created:[10/27/2020],Tuesday
 * Time:9:35 PM
 */
class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("demo");
            try {
             sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  Demo2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("demo2");
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Sample2Thread {
    public static void main(String[] args) throws Exception {
        Demo demo=new Demo();
        Demo2 demo2=new Demo2();
        demo.start();
        sleep(10);
        demo2.start();
    }

}
