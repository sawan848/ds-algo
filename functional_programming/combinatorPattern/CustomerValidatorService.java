package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

/*
 * @author:Saawan
 * @created:[11/1/2020],Sunday
 * Time:6:44 PM
 */
public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate date){
        return Period.between(date,LocalDate.now()).getYears()>16 ;
    }
    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())&&
                isPhoneNumberValid(customer.getPhoneNumber())&&
                isAdult(customer.getDob());
    }
}
