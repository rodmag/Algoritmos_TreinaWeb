package exercicios.avulso.operadorTernario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Maximum of four numbers

*/

public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite os 4 números: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        int max = max1 > max2 ? max1 : max2;
        System.out.println("O maior número digitado foi: " + max);
    }
}
