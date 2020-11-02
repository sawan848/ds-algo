package callbacks;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:8:00 PM
 */
public class Lambdas {
    public static void main(String[] args) {
        Integer integer=null;
        int counter=0;

        Function<String,String>upperCaseName=String::toUpperCase;

        BiFunction<String,Integer,String>upperCaseNameBiFunction=(name,age)->{
            if (name.isBlank())throw new IllegalArgumentException();
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseNameBiFunction.apply("alex",20));

        Function<String,String>lowerCase=name->{
            if (name.isEmpty())throw  new IllegalArgumentException();
            return name.toLowerCase();
        };

    }
    class Service{
        public Consumer<String>blah=s -> {
            System.out.println("jh");
        };
    }
}
