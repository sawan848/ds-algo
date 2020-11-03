package ExecutorService;
/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:9:48 PM
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String>t1=new ThreadLocal<String>(){
           protected String initialValue(){ return "Play java return";}
        };
        System.out.println("g"+t1.get());
        t1.set("Play java");
        System.out.println(t1.get());
    }
}
