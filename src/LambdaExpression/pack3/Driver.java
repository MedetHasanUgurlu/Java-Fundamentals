package LambdaExpression.pack3;

public class Driver {
    public static void main(String[] args) {

        // Write the functional interface after that rewrite the method with using lambda
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String s, int count) {

            }
        };

        GreetingMessage greetingMessageLambda = (s,i)->{
            for (int j = 0; j < i; j++) {
                System.out.println(s);

            }
        };

        greetingMessageLambda.greet("One way out",9);
        }


}
