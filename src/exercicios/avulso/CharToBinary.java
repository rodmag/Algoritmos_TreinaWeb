package exercicios.avulso;

import java.util.Scanner;  // Importa a classe Scanner do pacote java.util para entrada de dados

public class CharToBinary {
    // Método para converter um caractere para binário e exibir na saída padrão
    public static void charToBinary(char c) {
        System.out.print("O binário do caracter '" + c + "' é: ");
        // Loop que itera de 7 a 0 (8 bits de um caractere)
        for (int i = 7; i >= 0; i--) {
            // Imprime o bit atual do caractere
            System.out.print((c >> i) & 1);
        }
        System.out.println();  // Imprime uma nova linha após a conclusão da impressão binária
    }

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para entrada de dados
        System.out.print("Digite um caracter: ");  // Solicita ao usuário que digite um caractere
        char caracter = scanner.next().charAt(0);  // Lê o caractere digitado pelo usuário
        charToBinary(caracter);  // Chama o método para converter o caractere digitado para binário
        scanner.close();  // Fecha o Scanner para liberar recursos
    }
}

