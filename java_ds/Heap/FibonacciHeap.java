package Heap;

/*
 * @author:Saawan
 * @created:[10/16/2020],Friday
 * Time:11:26 AM
 */
public class FibonacciHeap {
    FibonacciNode min;
    FibonacciNode found;
    int key;
    boolean trace;

    public boolean isTrace() {
        return trace;
    }

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    public  static FibonacciHeap createHeap(){
        return new FibonacciHeap();
    }

    public FibonacciHeap() {
        this.min = null;
        this.key = 0;
        this.trace = false;
    }
    private void insert(FibonacciNode key){
        if (min==null){
            min=key;
            key.setLeft(min);
            key.setRight(min);
        }else {
           key.setRight(min);
           key.setLeft(min.getLeft());
           min.getLeft().setRight(key);
           min.setLeft(key);
           if (key.getKey()< min.getKey())
               min=key;
        }
    }
    public void insert(int key){
        insert(new FibonacciNode(key));
    }
    public void display(){
        display(min);
        System.out.println();
    }
    private void display(FibonacciNode node){
        System.out.print("(");
        if (node==null){
            System.out.print(")");
            return;
        }else {
            FibonacciNode temp=node;
            do {
                System.out.println(temp.getKey());
                FibonacciNode k=temp.getChild();
                display(k);
                System.out.println("->");
                temp=temp.getRight();
            }while (temp!=node);
            System.out.println(")");
        }
    }
    public static void mergeHeap(FibonacciHeap h1,FibonacciHeap h2,FibonacciHeap h3){
        h3.min=h1.min;
        if (h1.min!=null&& h2.min!=null){
            FibonacciNode t1=h1.min.getLeft();
            FibonacciNode t2=h2.min.getLeft();
            h1.min.setLeft(t2);
            t1.setRight(h2.min);
            h2.min.setLeft(t1);
            t2.setRight(h1.min);
        }
        if (h1.min==null || (h2.min!=null&& h2.min.getKey()<h1.min.getKey())){
            h3.min= h2.min;
            h3.key=h1.key+h2.key;
        }
    }
    public int findMin(){
        return  this.min.getKey();
    }
    private void displayNode(FibonacciNode z){
        System.out.println("right: "+((z.getRight()==null)?"-1":z.getRight().getKey()));
        System.out.println("left: "+((z.getLeft()==null)?"-1":z.getLeft().getKey()));
        System.out.println("child: "+((z.getChild()==null)?"-1":z.getChild().getKey()));
        System.out.println("degree: "+z.getDegree());
    }
    public int extractMin(){
        FibonacciNode z=this.min;
        if (z!=null){
            FibonacciNode c=z.getChild();
            FibonacciNode k=c,p;
            if (c!=null){
                do {
                    p=c.getRight();
                    insert(c);
                    c.setParent(null);
                    c=p;
                }while (c!=null &&c!=k);
            }
            z.getLeft().setRight(z.getRight());
            z.getRight().setLeft(z.getLeft());
            z.setChild(null);
            if (z==z.getRight())
                this.min=null;
            else {
               min=z.getRight();
               consolidate();
            }
            this.key-=1;
            return z.getKey();
        }
        return Integer.MAX_VALUE;
    }
    public void consolidate(){
        double phi=(1+Math.sqrt(5))/2;
        int Dofn=(int)(Math.log(this.key)/Math.log(phi));
        FibonacciNode A[]=new FibonacciNode[Dofn+1];
        for (int i = 0; i <=Dofn; ++i)
            A[i]=null;
        FibonacciNode w=min;
        if (w!=null){
            FibonacciNode check=min;
            do {
                FibonacciNode x=w;
                int d=x.getDegree();
                while (A[d]!=null){
                    FibonacciNode y=A[d];
                    if (x.getKey()>y.getKey()){
                        FibonacciNode temp=x;
                        x=y;
                        y=temp;
                        w=x;
                    }
                    fibHeapLink(y,x);
                    check=x;
                    A[d]=null;
                    d+=1;
                }
                A[d]=x;
                w=w.getRight();
            }while (w!=null && w!=check);
            this.min=null;
            for (int i = 0; i <=Dofn; ++i) {
                if (A[i]!=null){
                    insert(A[i]);
                }
            }
        }
    }
    private void fibHeapLink(FibonacciNode y,FibonacciNode x){
        y.getLeft().setRight(y.getRight());
        y.getRight().setLeft(y.getLeft());
        FibonacciNode p=x.getChild();
        if (p==null){
            y.setRight(y);
            y.setLeft(y);
        }else {
            y.setRight(p);
            y.setLeft(p.getLeft());
            p.getLeft().setRight(y);
            p.setLeft(y);
        }
        y.setParent(x);
        x.setChild(y);
        x.setDegree(x.getDegree()+1);
        y.setMark(false);
    }

    private void find(int key,FibonacciNode c){
        if (found!=null || c==null)
            return;
        else {
            FibonacciNode temp=c;
            do {
                if (key==temp.getKey())
                    found=temp;
                else {
                    FibonacciNode k=temp.getChild();
                    find(key,k);
                    temp=temp.getRight();
                }

            }while (temp!=c&&found==null);
            }
        }
        public FibonacciNode find(int k){
            found=null;
            find(k,this.min);
            return found;
        }
        public void decrease_key(int key,int nval){
            FibonacciNode x=find(key);
            decrease_key(x,nval);
        }
        private void decrease_key(FibonacciNode x,int k){
            if (k>x.getKey())
                return;
            x.setKey(k);
            FibonacciNode y=x.getParent();
            if (y!=null&& x.getKey()<y.getKey()){
                cut(x,y);
                cascading_Cut(y);
            }
            if (x.getKey()<min.getKey())
                min=x;
        }
        private void cut(FibonacciNode x,FibonacciNode y){
            x.getRight().setLeft(x.getLeft());
            x.getLeft().setRight(x.getRight());
            y.setDegree(y.getDegree()-1);

            x.setRight(null);
            x.setLeft(null);
            insert(x);
            x.setParent(null);
            x.setMark(false);
        }
        private void cascading_Cut(FibonacciNode y){
            FibonacciNode z=y.getParent();
            if (z!=null){
                if (y.isMark()==false)
                    y.setMark(true);
                else {
                    cut(y,z);
                    cascading_Cut(z);
                }
            }
        }

        public void delete(FibonacciNode x){
        decrease_key(x,Integer.MIN_VALUE);
        int p=extractMin();
        }

    public static void main(String[] args) {
        FibonacciHeap obj=createHeap();
        obj.insert(7);
        obj.insert(26);
        obj.insert(30);
        obj.insert(39);
        obj.insert(10);
        obj.display();

        System.out.println(obj.extractMin());
        obj.display();
        System.out.println(obj.extractMin());
        obj.display();
        System.out.println(obj.extractMin());
        obj.display();
        System.out.println(obj.extractMin());
        obj.display();
    }
}
