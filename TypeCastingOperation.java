
public class TypeCastingOperation {
    public static void main(String[] args) {
        double result=(double)10 /(double)(3);
        System.out.println(result);

        //implicit casting
        //byte>short>int>long>float>double

        double x=1.1;
        int y=(int)x+2;
        System.out.println(y);
        //type casting string to integer(viso-versa)=>using a wrapper classes
        String x2="1";
        int y2=Integer.parseInt(x2)+2;
        System.out.println(y2);

        String x3="1.1";
        double y3=Double.parseDouble(x3)+3;
        System.out.println(y3);
    }

}