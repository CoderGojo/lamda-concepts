package unit3;

import unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickers", 60),
                new Person("Lewis","Canroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Mathew","Arnold", 39)
        );

        System.out.println("Printing all Persons ");
        printConditionally(people, p ->true, System.out::println);

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
