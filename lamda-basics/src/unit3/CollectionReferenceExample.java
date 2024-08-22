package unit3;

import unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionReferenceExample {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickers", 60),
                new Person("Lewis","Canroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Mathew","Arnold", 39)
        );

        System.out.println("Using for loop");
        for(int i = 0; i< people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop");
        for(Person p : people){
            System.out.println(p);
        }

        System.out.println("Using lambda forEach loop");
        people.forEach(System.out::println);
    }

}
