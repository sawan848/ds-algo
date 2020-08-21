class  Demo{
    public void  compute(int i,int j,double x){
        //method body
        //the actual statement in the body

    }
    //...
}

public class MyMain {
    public static void main(String[] args) {
        Demo demo=new Demo();
        int i,k,m;
        i=12;
        k=10;
        m=14;
        demo.compute(3,4,5.5);
        demo.compute(i,k,m);
        demo.compute(m,20,40);

    }
}
