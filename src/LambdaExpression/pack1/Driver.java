package LambdaExpression.pack1;

public class Driver {
    public static void main(String[] args) {
        IMath y = (x)->{return 2*x;};
        System.out.println(y.toDouble(15));


    }
}
