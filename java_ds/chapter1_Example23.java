import  java.util.Arrays;

//rotating an array by k positions.
public class chapter1_Example23 {
    public static void rotateArray(int[] a, int n,int k) {
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, n - 1);
        reverseArray(a, 0, n - 1);
    }

    public static void reverseArray(int[] a, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int [] a = { 10, 20, 30, 40, 50, 60 };
        int [] a2={1,2,3,4,5,6,7, 8, 9, 10};
        rotateArray(a, a.length,2);
        rotateArray(a2,a2.length,4);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a2));
        System.out.println("length of the array2 ::- " + a2.length);
        // System.out.print("array is = " + rotateArray(a,2,5) );
        // reverseArray(a, 2, 5);
        // System.out.println(" array is= " + reverseArray(arr, 2, 5));
    }
}

