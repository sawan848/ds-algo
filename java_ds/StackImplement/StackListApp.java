package StackImplement;

public class StackListApp {
    public static void main(String[] args) {
        Stack theStack=new Stack();
        theStack.push(20);
        theStack.push(40);
        theStack.displayStack();
        theStack.push(60);
        theStack.push(80);
        theStack.displayStack();
        theStack.pop();
        theStack.pop();
        theStack.displayStack();
    }
}
