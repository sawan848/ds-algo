/*
* code fragment 2.2
* general numerical progression class
* */
public class Progression {
    protected long current;
    public Progression(){ this(0);}
    public Progression(long start){
        current=start;
    }

    protected long nextValue(){
        long answer=current;
        advance();
        return answer;
    }
    protected  void  advance(){
        current++;
    }
    public void  printProgrssion(int n){
        System.out.print(nextValue());
        for (int j=1;j<n;j++)
            System.out.print(" "+nextValue());
        System.out.println();
    }
}
