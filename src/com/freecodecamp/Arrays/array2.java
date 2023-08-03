package com.freecodecamp.Arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        System.out.print("Type you String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int x = 0;

        for(int i = 0; i < s.length(); i++) {
            x = x + 1;
            System.out.println(s.substring(0,x));
        }

        for(int i = 0; i < s.length(); i++) {
            x = x - 1;
            System.out.println(s.substring(0,x));
        }
    }
}
