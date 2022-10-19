package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx {


    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        List<Number> integerList = new ArrayList<>();
        List<Object> objectList = new LinkedList<>();
        objectList.add("11");
        objectList.add(55);
        objectList.add(new Scanner(System.in));
        Scanner scanner = new Scanner(System.in);
        objectList.add(scanner.next());



        System.out.println(objectList);

    }

}
