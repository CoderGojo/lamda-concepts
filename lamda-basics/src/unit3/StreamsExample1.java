package unit3;

import unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickers", 60),
                new Person("Lewis","Canroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Mathew","Arnold", 39)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println);

        long count =  people.stream()
                .filter(p -> p.getLastName().startsWith("C")).count();

        System.out.println(count);

    }

}
