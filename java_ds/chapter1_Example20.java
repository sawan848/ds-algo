public class chapter1_Example20 {

    public static int SumArray(int arr[]){
        int size=arr.length;
        int total=0;
        int index=0;
        for (index=0;index<size;index++) {
            total=total+arr[index];
        }

        return total;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        System.out.println("sum of all the values in array: "+SumArray(arr));
    }
}