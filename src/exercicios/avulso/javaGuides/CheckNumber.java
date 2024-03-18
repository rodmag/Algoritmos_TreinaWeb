package exercicios.avulso.javaGuides;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite o secundo número: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("Digite o terceiro número: ");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Número 1 é o maior.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Número 2 é o maior.");
        } else
            System.out.println("Número 3 é o maior.");

        sc.close();
        sc2.close();
        sc3.close();
    }
}
