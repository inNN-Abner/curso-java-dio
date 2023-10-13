package edu.java.msn_messenger.validarInternet;

public class Telegram extends ServicoMensagem {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo TELEGRAM");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo TELEGRAM");
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando mensagens");
    }

}