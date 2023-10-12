package edu.java.get_set;

public class Aluno {

    //GET - Responsável por obter o valor ATUAL DO ATRIBUTO.
    //GET - Precisa ser 'public' e retorna um tipo correspondente ao valor
    //public String getNome() {} -- public int getIdade() {}

    //SET - Responsáv4el por DEFINIR ou MODIFICAR o valor de um ATRIBUTO.
    //SET - Precisa ser 'public' mas não retorna nenhum valor void
    //public void setNome(String newNome); -- public void setIdade(int newIdade);

    private String nome;
    private int idade;
    private int matricula;
    private String sexo;

    public String getNome(){
        return nome;
    }
    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int newMatricula){
        this.matricula = newMatricula;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
