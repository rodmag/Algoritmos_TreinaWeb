package br.com.treinaweb.listasligada;

public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

}
