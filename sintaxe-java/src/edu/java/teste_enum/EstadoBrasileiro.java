package edu.java.teste_enum;

public enum EstadoBrasileiro {
    //O ENUM é um tipo especial de classe onde OBJETOS são previamente criados, imutáveis e disponíveis por toda a aplicação
    //É utilizado quando as RN tem objetos de um mesmo contexto pré-estabelecido, sabendo que ele não terá grandes/muitas mudanças 
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA", "Maranhão", 14),
    CEARA ("CE", "Ceará", 15),
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public int getIbge(){
        return ibge;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
