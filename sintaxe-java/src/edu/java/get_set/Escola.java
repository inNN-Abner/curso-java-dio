package edu.java.get_set;

public class Escola {
    public static void main(String[] args) {
        //Criando OBJETOS e definido valores aos ATRIBUTOS - JavaBeans
        Aluno giulia = new Aluno();
        giulia.setNome("Giulia");
        giulia.setIdade(22);
        giulia.setMatricula(105048222);
        giulia.setSexo("F");

        System.out.println("Aluno: " + giulia.getNome() + "\nIdade: " + giulia.getIdade() + "\nMatrícula: " + giulia.getMatricula() + "\nSexo: " + giulia.getSexo());

        Aluno julio = new Aluno();
        julio.setNome("Júlio");
        julio.setIdade(16);
        julio.setMatricula(105048333);
        julio.setSexo("M");

        System.out.println("\nAluno: " + julio.getNome() + "\nIdade: " + julio.getIdade() + "\nMatrícula: " + julio.getMatricula() + "\nSexo: " + julio.getSexo());
    }
}
