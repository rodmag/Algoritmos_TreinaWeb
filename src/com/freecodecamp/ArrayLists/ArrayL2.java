package com.freecodecamp.ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        for(int i =0; i < 5; i++) {
            System.out.print("Type a value: " );
            String s = scanner.nextLine();
            arrayList.add(s);
        }

        for(String s: arrayList) {
            System.out.println("Initial ArrayList: " + s);
        }

        arrayList.remove(2);
        Collections.reverse(arrayList);

        for(String s: arrayList) {
            System.out.println("After ArrayList: " + s);
        }

    }
}
