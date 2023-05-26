package exercicios.avulso.arrays;

public class CalculaTamanhoVariavel {
    public static void main(String[] args) {

        //Conta o bytes
        String nome = "teste";
        int numero = 5033;
        String converteNumero = Integer.toString(numero);
        System.out.println("bytes de " + nome + " = " + nome.getBytes().length);
        System.out.println("bytes de " + numero + " = " + converteNumero.getBytes().length);

        //Transforma em Bits
        int inteiro = 500;
        double double2 = 40.5;
        String binario = Integer.toBinaryString(inteiro);
        System.out.println("O valor do número " + inteiro + " em bits é = " + binario);

        //Calcula tamanho do array em Bits
        int[] array = new int[1];
        int tamanhoEmBits = array.length * Integer.SIZE;

        String[] array2 = {"t"};
        int tamanhoEmBits2 = 0;

        for (String elemento : array2) {
            byte[] bytes = elemento.getBytes();
            tamanhoEmBits2 += bytes.length * Byte.SIZE;
        }

        System.out.println("Tamanho em bits do array: " + tamanhoEmBits);
        System.out.println("Tamanho em bits do array: " + tamanhoEmBits2);
    }

}

