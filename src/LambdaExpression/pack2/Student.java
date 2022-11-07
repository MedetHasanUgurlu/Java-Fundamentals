package LambdaExpression.pack2;

import java.util.Objects;

public class Student {
    private String name;
    private int number;
    private int averageNumber;

    public Student( int number, int averageNumber,String name) {
        this.name = name;
        this.number = number;
        this.averageNumber = averageNumber;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return s.getNumber() == this.getNumber();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", averageNumber=" + averageNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAverageNumber() {
        return averageNumber;
    }

    public void setAverageNumber(int averageNumber) {
        this.averageNumber = averageNumber;
    }
}
