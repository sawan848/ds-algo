package optionals;

import java.util.Optional;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:6:24 PM
 */
public class Main {
    public static void main(String[] args) {
       Object value= Optional.ofNullable("Hello").orElseGet(()-> "default value");

        Object value2= Optional.ofNullable("Hello").
                orElseThrow(()-> new IllegalStateException("exception"));
        System.out.println(value2);
        System.out.println(value);

        Optional.ofNullable("john45gmail.com").
                ifPresent(email ->System.out.println("sending email to "+email));

        Optional.ofNullable(null).
                ifPresentOrElse(email ->System.out.println
                        ("sending email to "+email),
                        ()->{
                            System.out.println("cannot send email");
                        });

    }
}
