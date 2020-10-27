package LinkedList;
class Link2nd{
    public double dData;
    public Link2nd next;
    public Link2nd(double d){
        dData=d;
    }
    public void displayLink(){

        System.out.print(dData+" ");
    }
}
public class DoubleEndedList {
    private Link2nd first;
    private Link2nd last;

    public DoubleEndedList(){
        first=null;
        last=null;

    }
    public boolean isEmpty(){

        return first==null;
    }
    public void insertFirst(double dd){
        Link2nd newLink=new Link2nd(dd);
        if (isEmpty())
            last=newLink;
        newLink.next=first;
        first=newLink;
    }
    public void insertLast(double dd){
        Link2nd newLink=new Link2nd(dd);
        if (isEmpty())
            first=newLink;
        else
            last.next=newLink;
        last=newLink;
    }
    public double deleteFirst(){
        double temp=first.dData;
        if (first.next==null)
            last=null;
        first=first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List(first-->last):");
        Link2nd current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }

}
