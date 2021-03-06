package multithreading;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/*
 * @author:Saawan
 * @created:[10/29/2020],Thursday
 * Time:9:57 PM
 */
public class MultiThreadingNewChanges2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(new Date());
        CompletableFuture<String> data=CompletableFuture.supplyAsync( ()->
        {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return "data from supplyAsync()!!!";
        });
        System.out.println(data.get());
        System.out.println(new Date());
        System.out.println("main thread");
    }
}
