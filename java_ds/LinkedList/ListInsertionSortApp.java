package LinkedList;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size=10;
        Link2nd[] linkArr=new Link2nd[size];
        for (int j=0;j<size;j++){
            int n=(int)(java.lang.Math.random()*99);
            Link2nd newLink=new Link2nd(n);
            linkArr[j]=newLink;
        }
        System.out.print("Unsorted array: ");
        for (int j=0;j<size;j++)
            System.out.print(linkArr[j].dData+" ");
        System.out.println("");
        ListInsertionSort theSortedList=new ListInsertionSort(linkArr);
        for (int j=0;j<size;j++)
            linkArr[j]=theSortedList.remove();
        System.out.print("Sorted Array: ");
        for (int j=0;j<size;j++)
            System.out.print(linkArr[j].dData+" ");
        System.out.println("");

    }
}
