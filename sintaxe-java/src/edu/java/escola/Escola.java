package edu.java.escola;

public class Escola {
    public static void main(String[] args){
        //Criando objeto - Linha 6 || Definindo valores dos atributos - Linha 7/8
        Aluno giulia = new Aluno();
        giulia.nome = "Giulia";
        giulia.idade = 22;

        System.out.println("Aluno: " + giulia.nome + "\nIdade: " + giulia.idade);

        //Objetos oriundos da mesma classe podem ser diferentes sem se afetarem
        //Criando novo objeto - Linha 14 || Definindo valores dos atributos do novo objeto - Linha 15/16
        Aluno julio = new Aluno();
        julio.nome = "Júlio";
        julio.idade = 16;

        System.out.println("\nAluno: " + julio.nome + "\nIdade: " + julio.idade);
    }
}
