package com.freecodecamp.Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Calculator
        System.out.print("Type the number operator: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        scanner.close();

        for (int x = 0; x < 11; x++) {
            System.out.printf("%d x %d = %d \n", number, x, number * x);
        }
    }
}
