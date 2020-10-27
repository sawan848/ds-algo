package LinkedList;

public class InterIteratorLinkList {
    private InterIteratorLink first;
    public InterIteratorLinkList(){
        first=null;
    }
    public InterIteratorLink getFirst(){
        return first;
    }
    public void setFirst(InterIteratorLink f){
        first=f;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public ListInterator getIterator(){
        return new ListInterator(this);
    }
    public void displayList(){
        InterIteratorLink current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
