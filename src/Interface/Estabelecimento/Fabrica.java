package Interface.Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.DeskJet;
import Interface.Equipamentos.Impressora.Impressora;
import Interface.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

       /* Impressora impressora = new DeskJet();
        impressora.imprimir();*/

        //se eu colocar uma impressora específica ela imprime normalmente
        //mas para facilitar eu posso colocar o equipamento multifuncional

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
