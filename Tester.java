public class Tester {
    public void myMethod(int one, double two) {
        one = 25;
        two = 35.4;
    }
    public void swap(Fraction f1,Fraction f2){
        Fraction temp;
        temp=f1;
        f1=f2;
        f2=temp;

    }
    public  void change(Fraction f1){
        f1.setNumerator(10);
    }

    public static void main(String[] args) {


        Tester tester=new Tester();
        int x, y;
        x=10;
        y=20;
        tester.myMethod(x,y);
        System.out.println(x+ " "+y);
        Fraction x1,y1;
        Tester test=new Tester();
        x1=new Fraction(1,2);
        y1=new Fraction(3,4);
        test.swap(x1,y1);

        System.out.println("X= "+x1.toString());
        System.out.println("Y= "+y1.toString());
        test.change(x1);
        System.out.println("X-change to= "+x1.toString());
    }
}
