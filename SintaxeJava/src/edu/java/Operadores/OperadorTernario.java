package edu.java.Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int primeiroValor = 5;
        int segundoValor = 6;

        //Incrementando no primeiro valor
        primeiroValor++;

        String resultado = primeiroValor == segundoValor ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //Decrementando no primeiro valor
        primeiroValor--;

        resultado = primeiroValor == segundoValor ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
