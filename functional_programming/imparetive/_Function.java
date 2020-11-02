package imparetive;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:6:44 PM
 */
public class _Function {
    public static void main(String[] args) {

        //function takes 1 argument and produces 1 result;
        int increment= incrementByOne(2);
        System.out.println(increment);

        int increment2=incrementByOneFunction.apply(3);
        System.out.println(increment2);

        int multiply=multiplyBY10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer>addBY3AndThenMultiply10=incrementByOneFunction.andThen(multiplyBY10Function);
        System.out.println(addBY3AndThenMultiply10.apply(5));

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4,100)
        );
    }

    static BiFunction<Integer,Integer,Integer>incrementByOneAndMultiplyBiFunction=
            (numberToIncrementByOne,numberToMultiplyBy)->(numberToIncrementByOne+1)*numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
    static Function<Integer,Integer>
            incrementByOneFunction=number->number+1;

    static Function<Integer,Integer>
        multiplyBY10Function=number->number*10;

    static int incrementByOne(int number){
        return number+1;
    }
}
