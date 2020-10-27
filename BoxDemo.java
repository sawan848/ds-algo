import java.util.ArrayList;
import java.util.List;

/*
 * @author:Saawan
 * @created:[10/14/2020],Wednesday
 * Time:9:43 PM
 * <i>input</i>
 */
 class Box<T>{
    private T t;
    public void set(T t){this.t=t;}
    public T get(){return t;}
}
public class BoxDemo {
    public static <U>void addBox(U u, List<Box<U>>boxes){
        Box<U>box=new Box<>();
        box.set(u);
        boxes.add(box);
    }
    public static <U>void outputBoxes(List<Box<U>>boxes){
        int count=0;
        for (Box<U>box:boxes){
            U boxContents=box.get();
            System.out.println("Box #"+count+"contains ["+
                    boxContents.toString()+"]");
            count++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>>listOfIntegerBoxes=new ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10),listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(20),listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(30),listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}
