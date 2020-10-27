package LinkedList;

/*
 * @author:Saawan
 * @created:[10/13/2020],Tuesday
 * Time:8:21 PM
 */
public class DoubleCircularList {

    static class  Node{
        int data;
        Node next;
        Node prev;
    };
   static Node start;
   static void insertEnd(int value){
        if (start==null){
            Node newNode=new Node();
            newNode.data=value;
            newNode.next=newNode;
            start=newNode;
            return;
        }
        Node last=(start).prev;
        Node newNode=new Node();
        newNode.data=value;
        newNode.next=start;
        (start).prev=newNode;
        newNode.prev=last;
        last.next=newNode;
    }
    static void insertBegin(int value){
        Node last=(start).prev;
        Node newNode=new Node();
        newNode.data=value;
        newNode.next=start;
        newNode.prev=last;
        last.next=(start).prev=newNode;
        start=newNode;
    }
    static void insertAfter(int value1,int value2){
        Node newNode=new Node();
        newNode.data=value1;
        Node temp=start;
        while (temp.data!=value2)
            temp=temp.next;
        Node next=temp.next;
        temp.next=newNode;
        newNode.next=temp;
        newNode.prev=next;
        next.prev=newNode;
    }
    static void display(){
        Node temp=start;
        System.out.printf("Traversal in forward");
        while (temp.next!=start){
            System.out.printf("%d",temp.data);
            temp=temp.next;
        }
        System.out.printf("%d",temp.data);
        System.out.println("Traversal in reverse");
        Node last=start.prev;
        temp=last;
        while (temp.prev!=last){
            System.out.printf("%d",temp.data);
            temp=temp.prev;
        }
        System.out.printf("%d",temp.data);
    }

    public static void main(String[] args) {
        Node start=null;
//        insertEnd(6);
        insertBegin(4);
//        insertEnd(3);
//        insertAfter(7,9);
        System.out.print("create circular doubly linked list:");
        display();
    }
}
