import java.util.*;

public class Ch7LIbraryBook {
    private static final double CHARGE_PER_DAY = 0.50;
    private static final double MAX_CHARGE = 50.00;
    private static final String DEFAULT_TITLE="TITLE unknown";
    public static final double MILLISEC_TO_DAY=1.0/1000/60/60/24;

    private GregorianCalendar dueDate;
    private String title;
    private double chargePerDay;
    private double maximumCharge;
    public Ch7LIbraryBook(GregorianCalendar dueDate) {
        this(dueDate,CHARGE_PER_DAY);
    }
    public Ch7LIbraryBook(GregorianCalendar dueDate,
                          double chargePerDay){
        this(dueDate,chargePerDay,MAX_CHARGE);
    }
    public Ch7LIbraryBook(GregorianCalendar dueDate,
                          double chargePerDay,
                          double maximumCharge){
        this(dueDate,chargePerDay,maximumCharge,DEFAULT_TITLE);
    }

    public Ch7LIbraryBook(GregorianCalendar dueDate,
                          double chargePerDay,
                          double maximumCharge,
                          String title) {
        setDueDate(dueDate);
        setChargePerDay(chargePerDay);
        setMaximumCharge(maximumCharge);
        setTitle(title);
    }

    public  double getChargePerDay() {
        return CHARGE_PER_DAY;
    }

    public void setChargePerDay(double charge) {
        chargePerDay = charge;
    }

    public double getMaximumCharge() {
        return maximumCharge;
    }

    public void setMaximumCharge(double charge) {
        maximumCharge = charge;
    }

    public  double getMaxCharge() {
        return maximumCharge;
    }

    public static String getDefaultTitle() {
        return DEFAULT_TITLE;
    }

    public GregorianCalendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(GregorianCalendar date) {
        dueDate = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return String.format(
                "%-30s $%5.2f $%7.2f   %4$tm/%4$td/%4$ty",
                getTitle(),getChargePerDay(),getMaxCharge(),
                    dueDate.getTime()
        );
    }

    public double computeCharge(GregorianCalendar returnDate){
        double charge=0.0;
        long dueTime=dueDate.getTimeInMillis();
        long returnTime=returnDate.getTimeInMillis();
        long diff=returnTime-dueTime;

        if (diff>0){
            charge=chargePerDay*diff*MILLISEC_TO_DAY;

            if (charge>maximumCharge){
                charge=maximumCharge;
            }
        }
        return  charge;
    }

}
