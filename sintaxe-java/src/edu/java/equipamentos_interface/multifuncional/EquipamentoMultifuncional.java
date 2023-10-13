package edu.java.equipamentos_interface.multifuncional;
import edu.java.equipamentos_interface.copiadora.Copiadora;
import edu.java.equipamentos_interface.digitalizadora.Digitalizadora;
import edu.java.equipamentos_interface.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("Copiando via Equipamento Multifuncional!");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via Equipamento Multifuncional!");
    }

    public void imprimir(){
        System.out.println("Imprimindo via Equipamento Multifuncional!");
    }
}
