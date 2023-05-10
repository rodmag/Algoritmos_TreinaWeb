package br.com.treinaweb.algoritimos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            int numero = leitor.nextInt();
            numeros[i] = numero;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //Busca linear
        System.out.println("** Busca Linear");
        System.out.println("Digite um número para buscar: ");
        int alvo = leitor.nextInt();
        int posicaResultado = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                posicaResultado = i;
                // Se naõ tiver elementos duplicados.
                // Para quando achar o valor
                break;
            }
        }
        if (posicaResultado < 0) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println(String.format("O número %d foi encontrado na posição %d", alvo, posicaResultado));
        }
        //Fim da busca linear
        System.out.println("Vetor: ");
        imprimirArray(numeros);
        leitor.close();
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
