package Enumeration;

public class Main {
    public static void main(String[] args) {
        Color colorForBackground = Color.BLACK;
        String s =colorForBackground.getValue();
        System.out.println(s);

        for (Color c:Color.values()) {
            System.out.println(c.getValue());

        }
    }
}
