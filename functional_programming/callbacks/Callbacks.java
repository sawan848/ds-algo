package callbacks;

import java.util.function.Consumer;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:7:29 PM
 */
public class Callbacks {
    public static void main(String[] args) {
        //callback is in javascript
        hello("John","montana",null);


        hello("Jack",null,value->{
            System.out.println("no lastname provided for "+value);
        });

        hello2("Jack",null,()->{
            System.out.println("no lastname provided ");
        });
    }
    static void hello(String firstName, String lastName, Consumer<String>callback){
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }

    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        }else {
            callback.run();
        }

    }

}

/*
* callback is in javascript
* function hello(firstName,lastName,callback){
* console.log(firstName);
* if(lastName){
* console.log(lastName)
* }else{
* callback();
* }
* }*/
//hello("John",null,function(){console.log("no lastName provide")"})
//hello("John",Montana,function(){console.log("no lastName provide")"})