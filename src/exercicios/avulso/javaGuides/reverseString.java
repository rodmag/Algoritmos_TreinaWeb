package exercicios.avulso.javaGuides;

public class reverseString {
    public static void main(String[] args) {
        String input = "Java Guide";

        String result ="";

        for(int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }

        System.out.println(result);

    }
}
