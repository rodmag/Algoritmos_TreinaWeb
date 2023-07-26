package com.freecodecamp.Loops;

import java.util.Scanner;
import java.util.Arrays;

public class Loops2 {
    public static void main(String[] args) {
        System.out.print("Type the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = Integer.parseInt(scanner.nextLine());

        int arrayCreated[] = new int[arrayLength];

        for(int i = 0; i<arrayCreated.length; i++) {
            System.out.println("Type the value for the array position " + i);
            arrayCreated[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The length of the created array is: " + arrayCreated.length);

        for (int i =0; i<arrayCreated.length; i++) {
            System.out.println("For the position " + i + " the value is: " + arrayCreated[i]);
        }

    }
}
