package exercicios.avulso.javaGuides;

import java.util.Scanner;

public class NumberPatternReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want fot his pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern.....!!!!");

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
