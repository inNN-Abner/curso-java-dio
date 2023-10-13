package edu.java.equipamentos_interface.estabelecimento;

import edu.java.equipamentos_interface.copiadora.Copiadora;
import edu.java.equipamentos_interface.digitalizadora.Digitalizadora;
import edu.java.equipamentos_interface.digitalizadora.Scanner;
import edu.java.equipamentos_interface.impressora.Impressora;
import edu.java.equipamentos_interface.impressora.LaserJet;
import edu.java.equipamentos_interface.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args){
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        LaserJet lj = new LaserJet();
        Scanner sc = new Scanner();

        Impressora impressora = lj;
        Digitalizadora digitalizadora = sc;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
