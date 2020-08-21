import java.util.Calendar;
import java.util.GregorianCalendar;

public class Step2Main {

    public static void main(String[] args) {

        BookTraker bookTraker=new BookTraker();
        GregorianCalendar dueDate,returnDate;
        Ch7LIbraryBook book;

        returnDate=new GregorianCalendar(2008, Calendar.MARCH,15);

        System.out.println("Error: No books added.Return code-"+
                bookTraker.getList());
        System.out.println("\nAdding 20 books....\n");
        for (int i = 0; i < 20; i++) {
            dueDate=new GregorianCalendar(2008,Calendar.MARCH,i+1);
            book=new Ch7LIbraryBook(dueDate);
            book.setTitle("\nBook Number "+(i+1));
            bookTraker.add(book);
        }
        System.out.println("Total Charge: $"
                            +bookTraker.getCharge(returnDate));
        System.out.println("\n");
        System.out.println("List :"+bookTraker.getList());


    }
}
