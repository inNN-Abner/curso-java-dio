package edu.java.documentacao;

public class DocumentacaoCalculadora {
    
    /**
     * Este método é utilizado para somar dois numéros inteiros.
     * @param numeroUm - Este é o primeiro parâmentro do método
     * @param numeroDois - Este é o segundo parâmentro do método
     * @return - int o resultado deste método é a soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }

    //Fazendo uma documentação JavaDoc em HTML
    //Inserir texto no terminal:
    //javadoc -encoding UTF-8-d ../docs serc/*.java
}
