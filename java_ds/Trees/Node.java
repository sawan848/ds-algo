package java_ds.Trees;

/*
 * @author:Saawan
 * @created:[2/25/2021],Thursday
 * Time:6:43 PM
 */
public class Node {
    int key;
    Node left,right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int item){
        key=item;
        left=right=null;
    }

}
