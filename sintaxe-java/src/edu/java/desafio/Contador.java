package edu.java.desafio;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int numeroUm = Integer.valueOf(0);
        int numeroDois = Integer.valueOf(0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numeroDois = scanner.nextInt();

        try{
            contar(numeroUm, numeroDois);
        }catch (ParametrosInvalidosException error){}

        scanner.close();
    }

    static void contar(int numeroUm, int numeroDois)  throws  ParametrosInvalidosException {        
        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException("O SEGUNDO número deve ser MAIOR que o PRIMEIRO número!");
    } else {
        int contagem = numeroDois - numeroUm;
            for (int i=1; i<=contagem; i++){
                System.out.println("Imprimindo número: " + i);
            }
        }
    }
}
