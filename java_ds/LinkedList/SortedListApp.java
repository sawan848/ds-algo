package LinkedList;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList thesortedList =new SortedList();
        thesortedList.insert(20);
        thesortedList.insert(40);
        thesortedList.insert(50);
        thesortedList.displayList();
        thesortedList.insert(10);
        thesortedList.insert(30);
        thesortedList.insert(60);
        thesortedList.displayList();
        thesortedList.remove();
        thesortedList.displayList();
    }
}
