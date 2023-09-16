package edu.java.repeticao;
import java.util.Scanner;
import java.util.Locale;

public class SistemaBancario {
    public static void main(String[] args) {
        
        double saldo = Double.valueOf(1520.50);
        double transferencia = Double.valueOf(0);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Qual a quantidade que você deseja transferir?: ");
        transferencia = scanner.nextDouble();
        scanner.close();

        if (saldo >= transferencia){
            saldo = saldo - transferencia;
            System.out.println("Transferência realizada com sucesso. Seu novo saldo é: " + saldo);
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente: " + saldo);
        }
    }
}