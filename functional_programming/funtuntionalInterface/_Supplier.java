package funtuntionalInterface;

import java.util.List;
import java.util.function.Supplier;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:8:29 PM
 */
public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static Supplier<List<String>>
            getDBConnectionUrlSupplier=()->
            List.of("jdbc://localhost:3306/studentDB","\n jdbc://localhost:3706/customerDB");

    static String getDBConnectionUrl(){
        return "jdbc://localhost:3306/studentDB";
    }
}
