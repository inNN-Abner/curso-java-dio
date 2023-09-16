package edu.java.try_catch;

public class exemplo {
    public static void main(String[] args) {
    
        try {
            String cepFormatado = formatarCep("23764064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não atende as regras de negócio!");

        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulação de CEP Formatado
            return "12.345-110";
    }
}