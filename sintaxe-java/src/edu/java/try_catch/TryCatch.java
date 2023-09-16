package edu.java.try_catch;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String sobrenome;
        int idade = Integer.valueOf(0);
        double altura = Double.valueOf(0);

        try{
        System.out.println("Digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scanner.next();
        
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();
        
        System.out.println("Digite a sua altura: ");
        altura = scanner.nextDouble();
        scanner.close();

        System.out.println("O seu nome é " + nome + " " + sobrenome + "\nVocê tem " + idade + " anos e " + altura + " de altura");
        }
        catch(InputMismatchException excecao){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
