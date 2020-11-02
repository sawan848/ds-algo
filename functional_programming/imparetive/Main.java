package imparetive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.*;

/*
 * @author:Saawan
 * @created:[10/31/2020],Saturday
 * Time:6:16 PM
 */
public class Main {
    public static void main(String[] args) {
        List<Person>people= of(
                new Person("Jack",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Demon",Gender.MALE),
                new Person("Elena",Gender.FEMALE)
        );
        System.out.println("//Imperative approach");
        List<Person>females=new ArrayList<>();
        for(Person person:people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person female:females){
            System.out.println(female);
        }

        System.out.println("//Declarative approach");

        people.stream().
                filter(person ->Gender.FEMALE.equals(person.gender)).
                collect(Collectors.toList()).forEach(System.out::println);
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
        MALE,FEMALE;
    }
}
