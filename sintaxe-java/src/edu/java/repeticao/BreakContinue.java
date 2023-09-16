package edu.java.repeticao;

public class BreakContinue {
    public static void main(String[] args) {

    //O break vai parar a aplicação quando o numero for igual a 3
    for (int numero = 1; numero <=5; numero++){
        if(numero == 3)
            break;
        System.out.println("Break " + numero);
    }

    //O break vai mudar a aplicação quando o numero for igual a 3, pulando-o e continuando a aplicação
    for (int numero = 1; numero <=5; numero++){
        if(numero == 3)
            continue;
        System.out.println("Continue " + numero);
        }
    }
}