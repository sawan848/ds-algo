package combinatorPattern;

import com.sun.net.httpserver.Authenticator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorPattern.CustomerRegistrationValidator.*;

import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.*;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:6:59 PM
 */
public interface CustomerRegistrationValidator
    extends Function<Customer,ValidationResult> {

    static  CustomerRegistrationValidator isEmailValid(){
        return customer -> {
            System.out.println("running email validation");
            return customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
        };
    }
    static  CustomerRegistrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCESS:PHONE_NUMBER_NOT_VALID;
    }
    static  CustomerRegistrationValidator isAnAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>16
                ? SUCCESS:ID_NOT_AN_ADULT;
    }
    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customer -> {
           ValidationResult result= this.apply(customer);
           return result.equals(SUCCESS)?other.apply(customer):result;
        };
    }

    enum ValidationResult{
        SUCCESS,PHONE_NUMBER_NOT_VALID,EMAIL_NOT_VALID,ID_NOT_AN_ADULT
    }
}
