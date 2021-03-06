package ExecutorService;
/*
 * @author:Saawan
 * @created:[11/2/2020],Monday
 * Time:5:56 PM
 */
public class DeadLockExample {
    public static void main(String[] args) {
        final String lock1="Employee";
        final String lock2="EmployeeData";

        Thread thread=new Thread( new Runnable() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("inside thread 1");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock 1 executed properly ");
                }
                }
            }
        });
        Thread thread1=new Thread( new Runnable() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("inside thread 2");

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                synchronized (lock2){
                    System.out.println("lock 2 executed properly ");
                }
            }
            }
        });
        thread.start();
        thread1.start();
    }
}
