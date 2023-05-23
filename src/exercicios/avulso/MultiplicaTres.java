package exercicios.avulso;

import java.util.Scanner;

public class MultiplicaTres {
    public static void main(String[] args) {
        String resp = "s";

        //Utilizar o método equals para comparar Strings
        while (resp.equals("s")) {
            System.out.println("Digite um número > 0 para ser multiplicado por 3: ");

            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();

            if (numero > 0) {
                numero = numero * 3;
            } else {
                System.out.println("Número tem que ser maior que 0");
            }

            System.out.println(String.format("O Resultado é : %d", numero));

            System.out.println("Deseja efetuar outro cálculo? SIM - S / Não - N");
            scanner.nextLine(); //Limpa o buffer do scanner antes de ler a próxima linha
            resp = scanner.nextLine();
        }
    }
}
