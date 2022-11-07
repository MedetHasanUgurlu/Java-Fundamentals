package LambdaExpression.pack2;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        Student student1 = new Student(1,85,"Medet Hasan Ugurlu");
        Student student2 = new Student(2,95,"Medet Ugurlu");
        Student student3 = new Student(3,100,"Medet");
        Student student4 = new Student(4,75,"Medet Hasan ");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);


        list.sort((x, y) -> y.getAverageNumber()-x.getAverageNumber());
        list.forEach(System.out::println);
    }
}
