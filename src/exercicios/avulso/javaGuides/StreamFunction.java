package exercicios.avulso.javaGuides;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1,2,2,31,231,23,123,1,13,51,1,15,51);

        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> multiplicados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        System.out.println("Lista ordenadas dos números: " + ordenados);
        System.out.println("Lista dos número multiplicados por 2: " + multiplicados);
    }
}
