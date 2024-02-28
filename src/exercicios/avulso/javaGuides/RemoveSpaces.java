package exercicios.avulso.javaGuides;

public class RemoveSpaces {
    public static void main(String[] args) {

        String words = "OneSpace twospace  threespace   fourspce    ";

        String result = words.replaceAll("\\s+","");

        System.out.println("Lista de palavras: " + words);
        System.out.println("Lista com espaços removidos:" + result);
    }
}
