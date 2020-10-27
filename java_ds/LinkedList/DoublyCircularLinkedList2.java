package LinkedList;

/*
 * @author:Saawan
 * @created:[10/13/2020],Tuesday
 * Time:8:56 PM
 */
class  Node{
    int data;
    Node next;
    Node prev;
}
class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void smallElement(Node head){
        if (head==null){
            return;
        }
        Node current;
        current=head;
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        while (current.next!=head){
            if (current.data<min){
                min=current.data;
            }
            if (current.data>max){
                max=current.data;
            }
                current=current.next;
        }
        System.out.println("\n minimum="+min+", maximum="+max);

    }

    void printList() {
        Node temp = new Node();
        temp = this.head;
        if (temp != null) {
            System.out.print("\n the list contains:");
            while (true) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                if (temp == this.head)
                    break;
            }
        }else {
            System.out.println("\n the list is empty");
        }
    }
}
public class DoublyCircularLinkedList2 {
    public static void main(String[] args) {
        LinkedList myList=new LinkedList();

        Node first=new Node();
        first.data=10;
        first.next=null;
        first.prev=null;

        myList.head=first;
        first.next=myList.head;
        myList.head.prev=first;

        Node second=new Node();
        second.data=20;
        second.next=null;
        second.prev=first;
        first.next=second;
        second.next=myList.head;
        myList.head.prev=second;

        Node third=new Node();
        third.data=30;
        third.next=null;
        third.prev=second;
        second.next=third;
        third.next=myList.head;
        myList.head.prev=third;

        myList.printList();
        myList.smallElement(first.next);

    }
}
