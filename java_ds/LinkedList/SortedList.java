package LinkedList;

public class SortedList {
    private Link2nd first;
    public SortedList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insert(double key){
        Link2nd newLink=new Link2nd(key);
        Link2nd previous=null;
        Link2nd current=first;
        while (current !=null &&key>current.dData){
            previous=current;
            current=current.next;
        }
        if (previous==null)
            first=newLink;
        else
            previous.next=newLink;
        newLink.next=current;
    }
    public Link2nd remove(){
        Link2nd temp=first;
        first=first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List(first-->last): ");
        Link2nd current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
