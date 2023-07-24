package com.freecodecamp.UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats´s your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old you? ", name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("The name is %s. And the Age is %d years old", name, age);

        scanner.close();
    }

}
