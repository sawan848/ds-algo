/*
* code fragment 2.3
* */
public class ArithProgression extends Progression {
    protected long increment;
    public ArithProgression(){
        this(1,0);
    }
    public ArithProgression(long stepsize){
        this(stepsize,0);
    }
    public ArithProgression(long stepsize,long start){
        super(start);
        increment=stepsize;
    }
    protected void advance(){
        current +=increment;
    }

}
