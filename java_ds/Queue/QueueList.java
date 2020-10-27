package Queue;

public class QueueList {
    private QueueLink first;
    private QueueLink last;
    public QueueList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertLast(double dd){
        QueueLink newLink=new QueueLink(dd);
        if (isEmpty())
            first=newLink;
        else
            last.next=newLink;
        last=newLink;
    }
    public double deleteFist(){
        double temp=first.dData;
        if (first.next==null)
            last=null;
        first=first.next;
        return temp;
    }
    public void displayList(){
        QueueLink current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
