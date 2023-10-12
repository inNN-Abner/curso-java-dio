package edu.java.metodo_construtor;

public class CadastroPessoa {
    public static void main(String[] args) {
        //Usando o MÉTODO CONSTRUTOR -
        //Os atributos que foram definidos como relevantes precisam ser informados na criação
        //Prezar o construtor apenas para informações relevantes
        Pessoa joao = new Pessoa("507.709.288-10", "João Vitor");
        //No caso da classe Pessoa, foi definido obrigatoriedade em CPF e Nome

        //Definindo com o SET o endereço - Não foi definido como obrigatório no cadastro
        joao.setEndereco("Rua: Luiz II");

        System.out.println("Nome: " + joao.getNome() + "\nCPF: " + joao.getCpf() + "\nEndereço: " + joao.getEndereco());

        //Criando novo Objeto a partir da Classe Pessoa
        Pessoa abner = new Pessoa("507.709.288-22", "Abner Fernandes");
        abner.setEndereco("Rua: Luiz V");
        System.out.println("\nNome: " + abner.getNome() + "\nCPF: " + abner.getCpf() + "\nEndereço: " + joao.getEndereco());

        //Criando novo Objeto com o Método Construtor sem argumentos
        Pessoa ronaldo = new Pessoa();
        ronaldo.setNome("Ronlado Ronald");
        ronaldo.setCpf("507.700.855-56");
        ronaldo.setEndereco("Rua: Luiz VII");
            System.out.println("\nNome: " + ronaldo.getNome() + "\nCPF: " + ronaldo.getCpf() + "\nEndereço: " + ronaldo.getEndereco());

    }
}
