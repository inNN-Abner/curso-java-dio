package edu.java.repeticao;
import java.util.Random;

public class DoWhileTelefone {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while (tocando()); //Puxa o método para validar
            System.out.println("Alô!! !!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        if(atendeu == false){
            System.out.println("Atendeu? : Noupe!");
        } else {
        System.out.println("Atendeu? : Yep!");
        }

        //Negando o ato de continuar tocando, caso ele atenda
        return ! atendeu;
    }
}
