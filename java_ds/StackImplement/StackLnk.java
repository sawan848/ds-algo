package StackImplement;

public class StackLnk {
    public double dData;
    public StackLnk next;
    public StackLnk(double dd){
        dData=dd;
    }
    public void displayLink(){
        System.out.print(dData+" ");
    }
}
