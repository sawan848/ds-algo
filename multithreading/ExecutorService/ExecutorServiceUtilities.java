package ExecutorService;
/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:8:32 PM
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceUtilities {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es= Executors.newFixedThreadPool(2);
        System.out.println(new Date());

        List<Future<String>>futureList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            futureList.add((Future<String>)es.submit(new Service(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("--> --> --> -->  -->=== === === === === --> --> --> --> -->");
        for (Future<String>fut:futureList)
            System.out.println(fut.get());
        System.out.println(new Date());



    }
}
