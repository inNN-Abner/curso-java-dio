package edu.java.argumentos;

public class Argumentos {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //Definindo variável int dentro da String
        double altura = Double.valueOf(args[3]); //Definindo variável double dentro da String

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos de idade.");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
