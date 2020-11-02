package streams;

import imparetive.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.List.of;
import static streams._Stream.Gender.*;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:8:38 PM
 */
public class _Stream {

    public static void main(String[] args) {
        List<Person> people= of(
                new Person("Jack",  MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Demon", MALE),
                new Person("Elena", FEMALE),
                new Person("abc",xyz)
        );

        System.out.println("<-* Gender -->");
        people.stream().map(person -> person.gender).
                collect(Collectors.toSet()).
                forEach(gender -> System.out.println(gender));


        System.out.println("<-* Name -->");
        people.stream().map(person -> person.name).
                collect(Collectors.toSet()).
                forEach(System.out::println);

        System.out.println("<-*Length of Name -->");
        people.stream().map(person -> person.name).
                mapToInt(String::length).
                forEach(System.out::println);

        boolean containsOnlyFemales=people.stream()
                .allMatch(person ->FEMALE.equals(person.gender));

        System.out.println("female in person: "+containsOnlyFemales);

    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{"+
                    "name='"+name+'\''+
                    "gender=" +gender+ '}' ;
        }
    }
    enum Gender{
        MALE,FEMALE,xyz;
    }
}
/*
* stream api using
* method were used in
* allMatch--> it return boolean  values
* anyMatch-->
* noneMatch-->
* mapToInt-->it return integer values
* */