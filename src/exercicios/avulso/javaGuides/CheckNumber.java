package exercicios.avulso.javaGuides;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite o secundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Número 1 é o maior.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Número 2 é o maior.");
        } else
            System.out.println("Número 3 é o maior.");

        sc.close();
    }
}
