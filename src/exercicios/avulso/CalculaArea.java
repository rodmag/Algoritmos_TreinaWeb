package exercicios.avulso;

import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args){
        double area, raio;

        Scanner in = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        raio = Float.parseFloat(in.nextLine());
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do círculo de raio " +
                raio + " é igual a " + area);

        System.exit(0);
    }
}