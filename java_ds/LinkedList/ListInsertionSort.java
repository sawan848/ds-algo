package LinkedList;

public class ListInsertionSort {
    private Link2nd first;
    public ListInsertionSort() { first=null; }
    public ListInsertionSort(Link2nd[] linkArr){
        first=null;
        for (int j=0;j<linkArr.length;j++)
            insert(linkArr[j]);
    }
    public void insert(Link2nd k){
        Link2nd previous=null;
        Link2nd current=first;
        while (current !=null && k.dData>current.dData){
            previous=current;
            current=current.next;
        }
        if (previous==null)
            first=k;
        else
            previous.next=k;
        k.next=current;
    }
    public Link2nd remove(){
        Link2nd temp=first;
        first=first.next;
        return temp;
    }

}
