/*
* chemistry elemrnt store values
* unique physical
* chemical properties.
* */
public class Element {
    private String name;
    private int number;
    private String symbol;
    private double mass;
    private  int period;
    private  int group;

    public Element(String elementName, int elementNumber,
                   String elementSymbol, double elementMass,
                   int elementPeriod, int elementGroup) {
        name = elementName;
        number = number;
        symbol = elementSymbol;
        mass = mass;
        period = elementPeriod;
        group = elementGroup;
    }
    public String  getName()   {return  name;}
    public  int    getNumber() {return  number;}
    public String  getSymbol() {return symbol;}
    public double  getMass()   {return mass;}
    public int    getPeriod()  {return period;}
    public int    getGroup()   {return group;}
}
