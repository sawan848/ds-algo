import java.util.Scanner;

public class Ch5Sample1 {
    public static void main(String[] args) {
        double radius = 0,circumference,area;
        Ch5Circle circle;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        if (radius<=Ch5Circle.INVALID_DIMENSION){
            System.out.println("radius is invalid,Enter a valid radius:");
        }else {
            System.out.println("Input radius: "+radius);
            circle= new Ch5Circle(radius);
            circumference=circle.getCircumference();
            area=circle.getArea();

            System.out.print("Circumference: ");
            if (circumference ==Ch5Circle.INVALID_DIMENSION){
                System.out.println("cannot comput.Input is invalid");
            }else {
                System.out.println(circumference);
            }
            System.out.println("Area: "+area);
        }
        }

}
