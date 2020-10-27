package LinkedList;

public class ListInterator {
    private InterIteratorLink current;
    private InterIteratorLink previous;
    private InterIteratorLinkList ourList;

    public ListInterator(InterIteratorLinkList list){
        ourList=list;
        reset();
    }

    public void reset() {
        current=ourList.getFirst();
        previous=null;
    }
    public boolean atEnd(){
        return (current.next==null);
    }
    public void nextLink(){
        previous=current;
        current=current.next;
    }
    public InterIteratorLink getCurrent(){
        return current;
    }
    public void insertAfter(double dd){
        InterIteratorLink newLink=new InterIteratorLink(dd);
        if (ourList.isEmpty()){
            ourList.setFirst(newLink);
            current=newLink;
        }else {
            newLink.next=current.next;
            current.next=newLink;
            nextLink();
        }
    }
    public void insertBefore(double dd){
        InterIteratorLink newLink=new InterIteratorLink(dd);
        if (previous==null){
            newLink.next= ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }
        else {
            newLink.next=previous.next;
            previous.next=newLink;
            current=newLink;
        }
    }
    public double deleteCurrent(){
        double value=current.dData;
        if (previous==null){
            ourList.setFirst(current.next);
            reset();
        }else {
            previous.next=current.next;
            if (atEnd())
                reset();
            else
                current=current.next;
        }
        return value;
    }
}
