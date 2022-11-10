package Advanced;

public class Varargs {
    public static void main(String[] args) {
        print("One ","Way ","Out");
    }

    public static void print(String... s ){
        for (String x: s) {
            System.out.println(x);
        }

    }
}
