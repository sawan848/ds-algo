package LinkedList;

/*
 * @author:Saawan
 * @created:[10/14/2020],Wednesday
 * Time:8:32 PM
 */
public class CircularLinkedList <E> {

    public static class Node<E>{

        private E element;
        private Node<E>next;

        public Node(E e,Node<E>n){
            element=e;
            next=n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E>n){
            next=n;
        }
    }
    private Node<E>tail=null;
    private int size=0;
    public CircularLinkedList(){

    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public E first(){
        if (isEmpty())
            return null;
        return tail.getNext().getElement();
    }
    public E last(){
        if (isEmpty())
            return null;
        return  tail.getElement();
    }
    public void rotate(){
        if (tail!=null){
            tail=tail.getNext();
        }
    }
    public void addFirst(E e){
        if (size==0){
            tail=new Node<E>(e,null);
            tail.setNext(tail);
        }else {
            Node<E>newest=new Node<E>(e,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addFirstNotLocalVariable(E e){
        if (size==0){
            tail=new Node<E>(e,null);
            tail.setNext(tail);
        }else {
            tail.setNext(new Node<E>(e,tail.getNext()));
        }
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail=tail.getNext();
    }
    public E removeFirst(){
        if (isEmpty()){
            return null;
        }
        Node<E>head=tail.getNext();
        if (head==tail){
            tail=null;
        }else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
    public String toString(){
        if (tail==null)return "()";
        StringBuilder sb=new StringBuilder("(");
        Node<E>walk=tail;
        do {
            walk=walk.getNext();
            if (walk!=null)
                sb.append(walk.getElement());
            if (walk!=tail)
                sb.append(",");
        }while (walk!=tail);
        sb.append(walk!=tail);
        return sb.toString();
    }
    public boolean equals(Object o){
        if (o==null){
            return false;
        }
        if (getClass()!=o.getClass()){
            return false;
        }
        CircularLinkedList other=(CircularLinkedList)o;
        if (size!=other.size){
            return false;
        }
        Node walkA=tail;
        Node walkB= other.tail;
        for (int i=0;i<size;i++){
            if (!walkA.getElement().equals(walkB.getElement())){
                return false;
            }
            walkA=walkA.getNext();
            walkB=walkB.getNext();
        }
        return true;
    }
    public boolean isEqualContents(CircularLinkedList listL,CircularLinkedList listM){
        Node nodeL=listL.tail;
        Node nodeM=listM.tail;
        boolean x=false;
        while (nodeM.getNext()!=tail){
            if (nodeL.getElement().equals(nodeM.getElement())){
                x=true;
                break;
            }
        }
        nodeM=nodeM.getNext();
        for (int i=0;i<listM.size;i++){
            nodeM=nodeM.getNext();
            nodeL=nodeL.getNext();

            if (!nodeL.getElement().equals(nodeM.getElement())){
                return false;
            }
        }
        return true;
    }
    public CircularLinkedList clone()throws CloneNotSupportedException{
        CircularLinkedList other=new CircularLinkedList();
        if (size>0){
            other.tail=new Node(tail.getElement(),null);
            Node<E>walk=tail.getNext();
            Node<E>temp=other.tail;
            for (int i=0;i<size;i++){
                Node<E>newest=new Node<E>(walk.getElement(),null);
                temp.setNext(newest);
                temp=newest;
                walk=walk.getNext();
                other.size++;
            }
        }
        return other;
    }
    public static void split(CircularLinkedList L){
        CircularLinkedList M=new CircularLinkedList();
        CircularLinkedList N=new CircularLinkedList();
        int size=L.size;
        for (int i=0;i<size/2;i++){
            M.addLast(L.removeFirst());
        }
        for (int i=0;i<size/2;i++){
            N.addLast(L.removeFirst());
        }
        System.out.println("List M:"+M.toString());
        System.out.println("List N:"+N.toString());
    }
    public int sizeNotInstance(){
        int size=0;
        if (tail!=null){
            size++;
            Node<E>walk=tail.getNext();
            while (walk!=tail){
                walk=walk.getNext();
                size++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        CircularLinkedList list2=new CircularLinkedList();

        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast(1);
        list.addLast(2);
        list.addFirstNotLocalVariable(34);

        list2.addFirst("aa");
        list2.addFirst("bb");
        list2.addFirst("cc");

//        if (list.equals(list2)){
//            System.out.println("Listas iguais");
//        }else {
//            System.out.println("Listas diferentes");
//        }
//        System.out.println(list.toString());
        System.out.println(list);     System.out.println(list2);

//        System.out.println(list.toString());
//        System.out.println("rotate");


    }

}
