import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(1245);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.5);
        
        String result2 = NumberFormat.getPercentInstance().format(1.8);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

}