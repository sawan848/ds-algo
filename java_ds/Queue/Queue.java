package Queue;

public class Queue {
    private QueueList theList;
    public Queue(){
        theList=new QueueList();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void insert(double j){
        theList.insertLast(j);
    }
    public double remove(){
        return theList.deleteFist();
    }
    public void displayQueue(){
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}
