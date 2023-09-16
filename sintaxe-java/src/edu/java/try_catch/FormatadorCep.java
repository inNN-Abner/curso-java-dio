package edu.java.try_catch;

public class FormatadorCep {
    public static void main(String[] args) throws CepInvalidoException {

        try{
        String cepFormatado = formatarCep("12123110");
        System.out.println(cepFormatado);

     } catch (CepInvalidoException excecao) {
        System.out.println("O CEP não atende as regras de negócio!");
     }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulação de CEP Formatado
            return "12.123-110";
    }
}
