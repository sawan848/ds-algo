package Queue;

public class QueueListApp {
    public static void main(String[] args) {
        Queue theQueue=new Queue();
        theQueue.insert(20);
        theQueue.insert(40);
        theQueue.insert(80);
        theQueue.displayQueue();
        theQueue.insert(60);
        theQueue.insert(90);
        theQueue.displayQueue();
        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();
    }
}
