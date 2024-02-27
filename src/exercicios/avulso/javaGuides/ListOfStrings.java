package exercicios.avulso.javaGuides;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> lista =
                Arrays.asList("Banana", "Limão", "Morango", "Maça", "Ameixa", "Acerola");

        List<String> ordenado = lista.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ordenado);
    }
}
