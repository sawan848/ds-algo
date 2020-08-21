
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        setNumerator(num);
        setDenominator(denom);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }


    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denom) {
        if (denom ==0){
            System.err.println("Fetal Error");
            System.exit(1);
        }
       denominator = denom;
    }
    public String toString(){
        return  getNumerator()+ "/"+getDenominator();
    }
    public Fraction simplify(){
        int num=getNumerator();
        int denom=getDenominator();
        BruteForceAlgo bruteForceAlgo=new BruteForceAlgo();
        int gcd=bruteForceAlgo.euclid_gcd(num,denom);

        setNumerator(num/gcd);
        setDenominator(denom/gcd);
        Fraction simp =new Fraction(num/gcd,denom/gcd);
        return simp;
    }
    public  Fraction add(Fraction frac){
        int a,b,c,d;
        Fraction sum;
        a=this.getNumerator();
        b=this.getDenominator();
        c=frac.getNumerator();
        d=frac.getDenominator();
        sum=new Fraction(a*d+b*c,b*d);
        return sum;
    }

    public Fraction divide(Fraction frac){
        int a,b,c,d;
        Fraction quotient;

        a=this.getNumerator();
        b=this.getDenominator();
        c=frac.getNumerator();
        d= frac.getDenominator();
        quotient=new Fraction(a*d,b*c);
        return quotient;
    }
    public  Fraction Multiply(Fraction frac){
        int a,b,c,d;
        Fraction product;
        a=this.getNumerator();
        b=this.getDenominator();
        c= frac.getNumerator();
        d= frac.getDenominator();
        product=new Fraction(a*c,b*d);
        return product;
    }
    public Fraction subtract(Fraction frac){
        int a,b,c,d;
        Fraction diff;
        a=this.getNumerator();
        b=this.getDenominator();
        c= frac.getNumerator();
        d= frac.getDenominator();
        diff=new Fraction(a*d-b*c,b*d);
        return  diff;
    }

    public static Fraction min(Fraction f1,Fraction f2){
        double f1_dec=f1.decimal();
        double f2_dec=f2.decimal();
        if (f1_dec<=f2_dec){
            return f1;
        }else {
            return f2;
        }
    }
    private double decimal(){
        return (double)getNumerator()/getDenominator();
    }
/*
*
* Addition:-a/b+c/d=ad+bc/bd
* Division:-a/b / c/d=ad/bc
* Multiplication:-a/b*c/d
* Subtraction:-a/b-c/d
* */

    public static void main(String[] args) {
        Fraction f1,f2;
        f1=new Fraction(24,36);
        f2=f1.simplify();
        System.out.println(f1.toString()+" can reduce to "+f2.toString());

        Fraction f3,f4,f5,f6,f8,f9,f10;
        f3=new Fraction(1,2);
        f4=new Fraction(1,4);

        f5=f3.add(f4);
        f6=f3.add(f4.add(f5));
        f8=f3.Multiply(f4);
        f9=f3.subtract(f4);
        f10=f3.divide(f4);

        System.out.println("Sum of "+f3.toString() +" and "
                                +f4.toString() +" to "
                                +f5.toString()
        );

        System.out.println("f6:(f3+f4+f5) "+"f3="+
                f3.toString()+ " "+"f4="+
                f4.toString()+ " "+"f5="+
                f5.toString()+ " "+"f6="+
                f6.toString());

        System.out.println("Multiplication  of:" +"f3:-"+f3.toString()+"  f4:-"+f4.toString()+" f8:-"+f8.toString());
        System.out.println("Subtract  of:" +"f3:-"+f3.toString()+"  f4:-"+f4.toString()+" f8:-"+f9.toString());
        System.out.println("Divide    of:" +"f3:-"+f3.toString()+"  f4:-"+f4.toString()+" f8:-"+f10.toString());


        Fraction ff1,ff2,smaller;

        ff1=new Fraction(1,6);
        ff2=new Fraction(4,5);
        smaller=Fraction.min(ff1,ff2);
        System.out.println("ff1:- "+ff1.toString()+"\nff2:- "+ff2.toString()+"\n"+"\"smaller : \" "+smaller);
    }



}
