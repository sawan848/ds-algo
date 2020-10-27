package LinkedList;

public class DoublyLinkedListLink {
    public double dData;
    public DoublyLinkedListLink next;
    public DoublyLinkedListLink previous;
    public DoublyLinkedListLink(double d){
        dData=d;
    }
    public void displayLink(){
        System.out.print(dData+" ");
    }
}
