package edu.java.operadores;

    public class OperadorRelacional {
        public static void main(String[] args) {
        //Comparando Números
        int numeroUm = 1;
        int numeroDois = 2;

        //Verificando se numeroUm é igual ao numeroDois (Operador IGUAL)
        boolean simNao = numeroUm == numeroDois;
        System.out.println("Número Um é igual ao Número Dois? " + simNao);

        //Verficando se numeroUm é diferente de numeroDois (Operador DIFERENÇA)
        simNao = numeroUm != numeroDois;
        System.out.println("Número Um é diferente do Número Dois? " + simNao);

        //Verficando se numeroUm é maior que o numeroDois (Operador MAIOR)
        simNao = numeroUm > numeroDois;
        System.out.println("Número Um é maior que o Número Dois? " + simNao);

        //Verficando se numeroUm é maior ou igual que o numeroDois (Operador MAIOR IGUAL)
        simNao = numeroUm >= numeroDois;
        System.out.println("Número Um é maior ou igual que o Número Dois? " + simNao);

        //Verficando se numeroUm é menor que o numeroDois (Operador MAIOR)
        simNao = numeroUm < numeroDois;
        System.out.println("Número Um é menor que o Número Dois? " + simNao);

        //Verficando se numeroUm é menor ou igual que o numeroDois (Operador MAIOR IGUAL)
        simNao = numeroUm <= numeroDois;
        System.out.println("Número Um é menor ou igual que o Número Dois? " + simNao);

        //Comparando Textos (Strings)
        String nomeUm = "Abner";
        String nomeDois = "Abner";

        System.out.println("O primeiro nome é igual ao segundo nome? " + (nomeUm == nomeDois));

        //Para comparar objeto/textos pode-se ser necessário a utilização do método Equals
        String primeiroNome = "Abner";
        String segundoNome = new String ("Abner");

        System.out.println("O primeiro nome é igual ao segundo nome? " + (primeiroNome.equals(segundoNome)));
    }
}