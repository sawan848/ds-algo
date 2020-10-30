package multithreading;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import static java.lang.Thread.sleep;
/*
 * @author:Saawan
 * @created:[10/29/2020],Thursday
 * Time:9:35 PM
 * completableFuture
 */
public class MultThreadNewChanges {
    private static int data=5;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("in main thread data");
        CompletableFuture.runAsync(()->{
            try {
              sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("main thread");
        System.out.println("data not changes as complete future in progress-->"+data);
        Thread.sleep(2500);
        System.out.println("data changed by complete future -->"+data);
    }
}
