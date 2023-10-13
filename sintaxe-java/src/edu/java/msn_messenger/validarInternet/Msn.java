package edu.java.msn_messenger.validarInternet;

public class Msn extends ServicoMensagem {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando as mensagens. Aguarde!");
    }
}