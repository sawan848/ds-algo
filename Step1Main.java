import java.util.Calendar;
import java.util.GregorianCalendar;

public class Step1Main {

    public static void main(String[] args) {
        GregorianCalendar dueDate;
        Ch7LIbraryBook book1,book2,book3,book4;

        dueDate=new GregorianCalendar(2008, Calendar.MARCH,14);
        book1=new Ch7LIbraryBook(dueDate);

        dueDate=new GregorianCalendar(2008,Calendar.FEBRUARY,13);
        book2=new Ch7LIbraryBook(dueDate,0.75);
        book2.setTitle("Introduction to oop with java");


        dueDate=new GregorianCalendar(2008,Calendar.JANUARY,1);
        book3=new Ch7LIbraryBook(dueDate,1.00,100.00);
        book3.setTitle("Java for smarties");

        dueDate=new GregorianCalendar(2008,Calendar.JANUARY,1);
        book4=new Ch7LIbraryBook(dueDate,1.50,230.00,
                "me and my java");


        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());



    }
}
