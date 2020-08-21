
public class TheMathClass {
    public static void main(String[] args) {
        int result=Math.round(1.1f);
        double result1=Math.ceil(1.1f);
        int result2=(int)Math.ceil(1.1f);

        double result3=Math.random();
        double result4=Math.random()*100;
        double result5=Math.round(Math.random()*100);
        int result6=(int)Math.round(Math.random()*100);
        System.out.println(result6);
        System.out.println(result5);
        System.out.println(result4);
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
        System.out.println(result);

    }

}