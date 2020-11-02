package imparetive;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:7:39 PM
 */
public class _Consumer {
    public static void main(String[] args) {
        Customer elena=new Customer("Elena","78787878");
       greetCustomer(elena);
       greetCustomerV2(elena,false);


       //functionalInterface
       greetCustomerConsumer.accept(elena);
       greetCustomerConsumerV2.accept(elena,false);
    }

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2=
            (customer,showPhoneNumbers) -> System.out.println("hello "+customer.customerName+
            ", thanks for registering phone number "+
            (showPhoneNumbers ? customer.customerPhoneNumber:"**********"));



    static Consumer<Customer>greetCustomerConsumer=customer -> System.out.println("hello "+customer.customerName+
            ", thanks for registering phone number "+customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("hello "+customer.customerName+
                ", thanks for registering phone number "+customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer,boolean showPhoneNumbers){
        System.out.println("hello "+customer.customerName+
                ", thanks for registering phone number "+(showPhoneNumbers ? customer.customerPhoneNumber:"**********"));
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
