package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.*;
/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:6:48 PM
 */
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(
                "Alice","alice@gmail.com","+08083032",
                LocalDate.of(2000,1,1)
        );
        //without using combinator pattern
        System.out.println(new CustomerValidatorService().isValid(customer));
        //using combinator pattern
        ValidationResult result=
                isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(customer);

        System.out.println(result);
        if (result!= SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
