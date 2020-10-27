package Queue;

public class QueueLink {
    public double dData;
    public QueueLink next;

    public QueueLink(double d){
        dData=d;
    }
    public void displayLink(){
        System.out.print(dData+" ");
    }
}
