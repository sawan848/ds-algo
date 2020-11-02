package imparetive;

import java.util.function.Predicate;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:8:09 PM
 */
public class _Predicate {
    public static void main(String[] args) {

        System.out.println("\t <- * Using Normal function * -> ");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0900079780000"));

        System.out.println("\t <- * using Predicate * ->");

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900079780000"));

       boolean number= isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300");
        System.out.println("is phone number valid and contains number 3= "+number);


        boolean number2= isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003");
        System.out.println("is phone number valid and contains number 3= "+number2);
    }

    static  Predicate<String>containsNumber3=phoneNumber->phoneNumber.contains("3");

    static Predicate<String>isPhoneNumberValidPredicate=
            phoneNumber->phoneNumber.startsWith("07")&&phoneNumber.length()==11;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }
}
