import jdk.nashorn.api.tree.ForLoopTree;

//sequential search
public class chapter1_Example21 {
    public static int SequentialSearch(int arr[],int size,int value ){

        int i=0;
        for (i=0;i<size;i++) {
            if (value==arr[i]) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        System.out.println("index value is: "+SequentialSearch(arr, 9, 8));
    }

}