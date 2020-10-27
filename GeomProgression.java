/*
* code fragment 2.4
* */
public class GeomProgression extends Progression{
    protected long base;
    public GeomProgression(){
        this(2,1);
    }
    public GeomProgression(long b){
       this(b,1);
    }
    public GeomProgression(long b,long start){
        super(start);
        base=b;
    }
    protected void advance(){
        current *=base;
    }
}
