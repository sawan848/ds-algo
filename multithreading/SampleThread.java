package multithreading;
/*
 * @author:Saawan
 * @created:[10/27/2020],Tuesday
 * Time:9:22 PM
 */
class Hi{
    public void  show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
             e.printStackTrace();
            }
        }
    }
}
class Hello{
    public void  show() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            Thread.sleep(200);
        }
    }
}
public class SampleThread {
    public static void main(String[] args) throws InterruptedException {
        Hi hi=new Hi();
        Hello hello=new Hello();
        hi.show();
        hello.show();

    }
}
