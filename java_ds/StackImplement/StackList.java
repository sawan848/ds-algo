package StackImplement;

public class StackList {
    private StackLnk first;
    public StackList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(double dd){
        StackLnk newLink=new StackLnk(dd);
        newLink.next=first;
        first=newLink;
    }
    public double deleteFirst(){
        StackLnk temp=first;
        first=first.next;
        return temp.dData;
    }
    public void displayList(){
        StackLnk current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
