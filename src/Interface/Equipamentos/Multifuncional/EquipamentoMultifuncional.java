package Interface.Equipamentos.Multifuncional;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional  implements Copiadora, Impressora, Digitalizadora {
    //Quando é interface não usa EXTENDS usa-se IMPLEMENTS

    public void copiar(){
        System.out.println("Equipamento multifuncional COPIANDO");
    }
    public void imprimir(){
        System.out.println("Equipamento multifuncional IMPRIMINDO");
    }
    public void digitalizar(){
        System.out.println("Equipamento multifuncional DIGITALIZANDO");
    }
}
