import java.util.Arrays;

public class MulltiArrayOperation {
    public static void main(String[] args) {
        int[][] numbers=new int[2][3];//2dimensional 
        int[][][] numbers1=new int[2][3][3];//3dimensional
        int[][] numbers2={{1,2,3},{3,4,5}};
        // int[][][] numbers3={{1,2,4},{6,5,4},{3,2,1}};
        // int[][][] numbers23 = { { 1, 2, 3 },{3,9,8}, { 3, 4, 5 } };
        numbers[0][0]=1;
        numbers1[0][0][1]=2;
        //System.out.println(Arrays.deepToString(numbers3));
        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.toString(numbers));
    }

}