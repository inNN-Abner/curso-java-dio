package edu.java.repeticao;

public class TiposFor {
    public static void main(String[] args){
        
        //FOR
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }

        //FOR ARRAY
        String nomes [] = {"Abner", "Giulia", "João", "Júlio"};
        for (int x=0; x <= nomes.length; x++){
            System.out.println("O aluno do íncice " + x + " é: " + nomes[x]);
        }

        //FOR/EACH - É só uma maneira resumida do FOR ARRAY
        for(String nome : nomes){
            System.out.println("O nome da pessoa é: " + nome);
        }
    }
}
