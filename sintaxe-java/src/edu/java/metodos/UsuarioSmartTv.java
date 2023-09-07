package edu.java.metodos;

public class UsuarioSmartTv {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.abaixarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.descerCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
    
    }
}
