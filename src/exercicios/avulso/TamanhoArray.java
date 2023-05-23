package exercicios.avulso;

import java.util.Scanner;

public class TamanhoArray {

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do Array a ser criado: ");

        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        int[] array = new int[tamanho];
        for (int i = 0; i < array.length; i++){
            System.out.println("Digite o número para o Array posição "+ i);
            int numero = leitor.nextInt();
            array[i] = numero;
        }

        System.out.println(String.format("Tamanho do Array é: %d", tamanho));

        System.out.println("Abaixo os elementos do Array: ");

        for (int i = 0; i < array.length; i++){
            System.out.println("Posição " + i + " Valor: " + array[i]);
        }
    }
}
