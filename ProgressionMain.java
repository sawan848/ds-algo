public class ProgressionMain {
    public static void main(String[] args) {
        Progression prog;
        System.out.println("Arithmatic progression with defalut increment:");
        prog=new ArithProgression();
        prog.printProgrssion(10);
        System.out.println("Arithmatic Progression with increment 55:");
        prog=new ArithProgression(5);
        prog.printProgrssion(10);
        System.out.println("Geometirc progrssion with default base:");
        prog=new GeomProgression();
        prog.printProgrssion(10);
        System.out.println("Geometirc progrssion with  base 3:");
        prog=new GeomProgression(3);
        prog.printProgrssion(10);

        System.out.println("Fibonacci progrssion with default start values:");
        prog=new FibonacciProgression();
        prog.printProgrssion(10);

        System.out.println("Fibonacci progrssion with default start values 4 and 6:");
        prog=new FibonacciProgression(4,6);
        prog.printProgrssion(10);


    }
}
