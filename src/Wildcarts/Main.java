package Wildcarts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());
        officeList.add(new Office());

        printConstructors(officeList);
    }

    static void printConstructors(List<? extends Building> constructors){
        constructors.stream().filter((s)->s.getNumberOfRooms()>1).forEach(System.out::println);
        ///
    }



}
