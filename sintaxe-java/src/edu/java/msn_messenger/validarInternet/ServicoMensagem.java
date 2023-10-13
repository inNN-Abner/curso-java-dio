package edu.java.msn_messenger.validarInternet;

public abstract class ServicoMensagem {
        public abstract void enviarMensagem();
        public abstract void receberMensagem();
        protected void validarInternet(){
                System.out.println("Verificando conexão com a internet!");
        }
        public abstract void salvarHistoricoMensagem();
}