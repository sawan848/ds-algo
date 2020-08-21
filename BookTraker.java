import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class BookTraker {
    public static final int ERROR=-1;
    private List<Ch7LIbraryBook>books;

    public BookTraker(){
        books =new LinkedList<Ch7LIbraryBook>();
    }

    public String getList() {
        StringBuffer result=new StringBuffer("");
        String lineSeparator=System.getProperty("line.seprator");
        for (Ch7LIbraryBook book:books){
            result.append(book.toString()+lineSeparator);
        }
        return  result.toString();
    }

    public void add(Ch7LIbraryBook book) {
        books.add(book);
    }
    public double getCharge(){
        return getCharge(new GregorianCalendar());
    }

    public double getCharge(GregorianCalendar returnDate) {
        if (books.isEmpty()){
            return ERROR;
        }else {
            return totalCharge(returnDate);
        }
    }
    private double totalCharge(GregorianCalendar returnDate){
        double totalCharge=0.0;
        for (Ch7LIbraryBook book:books){
            totalCharge +=book.computeCharge(returnDate);

        }
        return totalCharge;
    }
}
