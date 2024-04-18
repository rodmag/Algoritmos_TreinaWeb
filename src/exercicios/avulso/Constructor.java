package exercicios.avulso;

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade dos contrutores: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Laço para imprimir as colunas
            for (int j = 0; j < n; j++) {
                System.out.print("# "); // Imprime o símbolo '#' seguido de um espaço
            }
            System.out.println(); // Imprime uma nova linha após cada linha de '#' ser impressa
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
