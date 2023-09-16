package edu.java.repeticao;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class NotasMedia {
    public static void main(String[] args) {

        double notaUm = Double.valueOf(0);
        double notaDois = Double.valueOf(0);
        double notaTres = Double.valueOf(0);

        double mediaNota = Double.valueOf(0);
        double mediaAprovado = Double.valueOf(7);
        double mediaRecuperacao = Double.valueOf(5);

        DecimalFormat formato = new DecimalFormat ("#.##");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira nota do Aluno: ");
        notaUm = scanner.nextDouble();
        System.out.println("Digite a segunda nota do Aluno: ");
        notaDois = scanner.nextDouble();
        System.out.println("Digite a terceira nota do Aluno: ");
        notaTres = scanner.nextDouble();
        scanner.close();

        mediaNota = Double.valueOf(formato.format((notaUm + notaDois + notaTres) / 3));

        if (mediaNota >= mediaAprovado) {
            System.out.println("Média do Aluno: " + mediaNota + " Aluno aprovado");
        } else if (mediaNota >= mediaRecuperacao) {
            System.out.println("Média do Aluno: " + mediaNota + " Aluno de recuperação");
        }else {
            System.out.println("Média do Aluno: " + mediaNota + " Aluno reprovado");            
        }
    }
}
