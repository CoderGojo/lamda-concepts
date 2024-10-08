package unit1;

import java.util.*;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickers", 60),
                new Person("Lewis","Canroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Mathew","Arnold", 39)
        );

        // Step1 :Sort the list by name
         Collections.sort(people, new Comparator<Person>(){
             @Override
             public int compare(Person o1, Person o2) {
                 return o1.getLastName().compareTo(o2.getLastName());
             }
         });

        // Step2 :Create a method that prints all elements in the list
            printAll(people);

            System.out.println("---------------------------");
        // Step3 : Create a method that prints all people that have last beginning with C
             printLastNameBeginningWithC(people, new Condition() {
                 @Override
                 public boolean test(Person p) {
                     return p.getLastName().startsWith("C");
                 }
             });
    }

    private static void printLastNameBeginningWithC(List<Person> people, Condition condition) {
        for(Person p: people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

    public static void printAll(List<Person> people) {
         for(Person p : people){
             System.out.println(p);
         }
      }

}


interface Condition {
    boolean test(Person p);
}