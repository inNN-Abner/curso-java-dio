package edu.java.repeticao;
import java.util.Locale;
import java.util.Scanner;

public class WhileMesada {
    public static void main(String[] args) {
        
        double mesada = Double.valueOf(50.0);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("A mesada de Joãozinho é de R$50,00 - Digite o valor dos doces que Joãozinho comprou!");

        while(mesada > 0){

            Double valorDoce = Double.valueOf(0.0);
        
            System.out.println("Digite o valor do Doce: ");
            valorDoce = scanner.nextDouble();
            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho!");
            mesada = mesada - valorDoce;
        }
        
        if(mesada == 0){
            System.out.println("Joãozinho não poupou nada da sua mesada!");
        } else if (mesada > 0){
            System.out.println("Joãozinho ainda tem " + mesada + " restante da sua mesada");
        } else {
            System.out.println("Joãozinho gastou tudo e ainda ficou devendo " + mesada + " para o tio da doceria");
        }
        
    }
}
