package exercicios.avulso.javaGuides;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicated {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates =
                Arrays.asList(1,2,3,4,5,6,7,8,9,5,3,6,3);

        List<Integer>result = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
