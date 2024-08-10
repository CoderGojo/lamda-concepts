public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
         // Polymorphism Concept
        // OOPS basic concept
        Greeter greeter = new Greeter();
        // HelloWorldLamdaBasics helloWorldLamdaBasics = new HelloWorldLamdaBasics();
        // OOPS
        Greeting helloWorldLamdaBasics = new HelloWorldLamdaBasics();
        // Lambdas
        Greeting lambdaGreeting = () -> System.out.println("Hello World..");
        // Anonymus
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hey!!");
            }
        };

        greeter.greet(helloWorldLamdaBasics);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

        // Lamda writing concepts

        /*
           Using variables
                greetingFunction = () -> System.out.println("Hello World");

                greet(greetingFunction);

            Using Values
                greet(() -> System.out.println("Hello World"));

                public void greet(---){
                  ______();

              Using Parameters
                 doubleNumberFunction = (int a) -> a * 2;

                 addFunction = (int a, int b) -> a + b;

                 safeDividerFunction =  (int a, int b) -> {
                    if(b == 0) return 0;
                    return a / b;
                 };

                 stringLengthCountFunction = (String s) -> s.length();
           */



    }
}
