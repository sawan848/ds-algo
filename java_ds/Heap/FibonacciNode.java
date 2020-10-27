package Heap;

/*
 * @author:Saawan
 * @created:[10/16/2020],Friday
 * Time:11:25 AM
 */
public class FibonacciNode {

    FibonacciNode parent;
    FibonacciNode left;
    FibonacciNode right;
    FibonacciNode child;
    int degree;
    boolean mark;
    int key;


    public FibonacciNode() {
        this.parent = null;
        this.left = this;
        this.right = this;
        this.child = null;
        this.degree = 0;
        this.mark = false;
        this.key = Integer.MAX_VALUE;
    }
    public FibonacciNode(int x){
        this();
        this.key=x;
    }

    public FibonacciNode getParent() {
        return parent;
    }

    public void setParent(FibonacciNode parent) {
        this.parent = parent;
    }

    public FibonacciNode getLeft() {
        return left;
    }

    public void setLeft(FibonacciNode left) {
        this.left = left;
    }

    public FibonacciNode getRight() {
        return right;
    }

    public void setRight(FibonacciNode right) {
        this.right = right;
    }

    public FibonacciNode getChild() {
        return child;
    }

    public void setChild(FibonacciNode child) {
        this.child = child;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
