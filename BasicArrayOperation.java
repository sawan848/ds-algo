import java.util.Arrays;

public class BasicArrayOperation {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers[0]=1;
        numbers[1]=2;
        int[] numbers1={12,4,15,26,07};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1.length);
        Arrays.sort(numbers1);
        
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);
    }

}