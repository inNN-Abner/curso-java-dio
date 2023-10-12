package edu.java.metodo_construtor;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Método Construtor - Define esses atributos como obrigatórios na criação do OBJETO
    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    //O mesmo Método Construtor pode receber diferentes assinaturas(valores entre os parênteses)
    public Pessoa(){
        super();
    }

    public String getNome() {
        return nome;
    }
     public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
     public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
     public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
