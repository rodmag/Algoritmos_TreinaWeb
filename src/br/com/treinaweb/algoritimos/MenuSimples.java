package br.com.treinaweb.algoritimos;

import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1. Gerenciamento de Memória");
        System.out.println("2. Fazer Vetor");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
        }
        scanner.close();
    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
    }

    private static void fazerVetor() {
        String[] vetorPessoas = new String[3];
        vetorPessoas[0] = new String("teste");
        System.out.println(vetorPessoas[0]);
    }
}
