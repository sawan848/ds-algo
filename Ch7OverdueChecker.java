import java.util.*;

public class Ch7OverdueChecker {
    private static enum Response {YES,NO}
    private static final String DATE_SEPARATOR="/";
    private Scanner scanner;
    private BookTraker bookTraker;

    public Ch7OverdueChecker(){
        scanner=new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        bookTraker=new BookTraker();
    }

    public static void main(String[] args) {
        Ch7OverdueChecker checker=new Ch7OverdueChecker();
        checker.start();
    }
    public void start(){
        GregorianCalendar returnDate;
        String table;
        double charge;
        Response response;
        inputBooks();
        table=bookTraker.getList();
        System.out.println("\nNow check the over due charge....\n " );

        do {
            returnDate=readDate("\n Return Date");
            charge=bookTraker.getCharge(returnDate);
            displayTotalCharge(charge);
            response=prompt("\nRun Again(yes/no)?");
        }while (response==Response.YES);
        System.out.println(
                "\n\n thanku for using library overdue checker"
        );

    }
    private Ch7LIbraryBook createBook(String title,
                                      double chargePerDay,
                                      double maxCharge,
                                      GregorianCalendar dueDate){

        if (dueDate ==null){
            dueDate=new GregorianCalendar();
        }
        Ch7LIbraryBook book=new Ch7LIbraryBook(dueDate);
        if (title.length()>0){
            book.setTitle(title);
        }
        if (chargePerDay>0.0){
            book.setChargePerDay(chargePerDay);
        }
        if (maxCharge>0.0){
            book.setMaximumCharge(maxCharge);
        }
        return book;
    }
    private void  display(String text){
        System.out.println(text);
    }
    private void displayTotalCharge(double charge){
        System.out.println("\nTotal Charge:\t $%8.2f"+charge);
    }
    private void inputBooks(){
        double chargePerDay,maxCharge;
        String title;

        GregorianCalendar dueDate;
        Ch7LIbraryBook book;

        while (isContinue()){
            System.out.println("\n");
            title=readString("Title      :");
            chargePerDay=readDouble("Charge per day: ");
            maxCharge=readDouble("Maximum charge: ");
            dueDate=readDate("Due Date    :");
            book=createBook(title,chargePerDay,maxCharge,dueDate);
            bookTraker.add(book);
        }
    }
    private boolean isContinue(){
        Response response=prompt("\n More books to enter (y/n)");
        return (response==Response.YES);
    }
    private Response prompt(String question){
        String input;
        Response response=Response.NO;
        System.out.println(question+ "(Yes -y;No-n):");
        input=scanner.next();

        if (input.equals("Y")||input.equals("y")){
            response=Response.YES;
        }
        return  response;
    }
    private  double readDouble(String prompt){
        display(prompt);
        return scanner.nextDouble();
    }
    private  GregorianCalendar readDate(String prompt){
        GregorianCalendar cal;
        String yearStr,monthStr,dayStr,line;
        int sep1,sep2;
        display(prompt);
        line= scanner.next();
        if (line.length()==0){
            cal=null;
        }else {
            sep1=line.indexOf(DATE_SEPARATOR);
            sep2=line.lastIndexOf(DATE_SEPARATOR);
            monthStr=line.substring(0,sep1);
            dayStr=line.substring(sep1+1,sep2);
            yearStr=line.substring(sep2+1,line.length());
            cal=new GregorianCalendar(Integer.parseInt(yearStr),
                    Integer.parseInt(monthStr),
                    Integer.parseInt(dayStr));
        }
        return cal;
    }
    private String readString(String prompt){
        display(prompt);
        return scanner.next();
    }
}
