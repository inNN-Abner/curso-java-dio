package edu.java.msn_messenger.validarInternet;

public class Facebook extends ServicoMensagem {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo FACEBOOK");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo FACEBOOK");
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando as mensagens. Aguarde!");
    }
}