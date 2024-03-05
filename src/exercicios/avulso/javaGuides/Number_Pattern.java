package exercicios.avulso.javaGuides;

import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args) {
        //Initialize Scanner to read th input value from console.
        Scanner sc = new Scanner(System.in);

        //Prompt msg
        System.out.println("How many rows you want fot his pattern?");

        //Read the number.
        int rows = sc.nextInt();

        //Notify user for the pattern.
        System.out.println("Here is your pattern.....!!!!");

        //Loop
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //Move the next line
            System.out.println();
        }

        //Close the scanner.
        sc.close();
    }
}
