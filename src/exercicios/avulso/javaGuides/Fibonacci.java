package exercicios.avulso.javaGuides;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para calcular Fibonacci: ");
        int count = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 1; i<=count; i++){
            System.out.println(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
