package com.freecodecamp.ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;

public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString());

        System.out.println("The size of the ArrayList is: " + numbers.size());

        numbers.remove(1);

        System.out.println(numbers.toString());

        System.out.println(numbers.get(2));

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        numbers.forEach(number -> {
            System.out.println(number * 10);
        });


    }
}
