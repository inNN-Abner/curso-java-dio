package edu.java.argumentos;
import java.util.Scanner;
import java.util.Locale;

public class Argumentos {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //Definindo variável int dentro da String
        double altura = Double.valueOf(args[3]); //Definindo variável double dentro da String

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Scanner recebe argumento do usuário
        //System in define que recebe pelo teclado
        //Use Locale define a convensão americana

        System.out.println("Digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        altura = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, " + nome + " " + sobrenome + ". Você tem " + idade + " anos de idade e a sua altura é de " + altura + "cm.");
    }
}
