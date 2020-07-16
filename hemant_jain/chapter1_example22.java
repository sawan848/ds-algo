
public class chapter1_example22 {
    public static int BinarySearch(int arr[],int size,int value){
        int mid;
        int low=0;
        int high=size-1;
        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid]==value)  return mid;
            else if(arr[mid]<value) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={3,13,23,33,43,53,63,73,83,93};
        System.out.println(" searching element is: "+ BinarySearch(arr, 10, 83));
    }

}