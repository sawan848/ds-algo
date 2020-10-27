package StackImplement;

public class Stack {
    private StackList theList;
    public Stack(){
        theList=new StackList();
    }
    public void push(double j){
        theList.insertFirst(j);
    }
    public double pop(){
        return (theList.deleteFirst());
    }
    public boolean isEmpty(){
        return (theList.isEmpty());
    }
    public void displayStack(){
        System.out.print("Stack(top-->bottom): ");
        theList.displayList();
    }
}
