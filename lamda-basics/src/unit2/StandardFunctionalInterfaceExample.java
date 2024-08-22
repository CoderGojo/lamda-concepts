package unit2;

import unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickers", 60),
                new Person("Lewis","Canroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Mathew","Arnold", 39)
        );

        // Step1 :Sort the list by name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step2 :Create a method that prints all elements in the list
        printConditionally(people, p ->true, p -> System.out.println(p));

        System.out.println("---------------------------");
        // Step3 : Create a method that prints all people that have last beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }



}