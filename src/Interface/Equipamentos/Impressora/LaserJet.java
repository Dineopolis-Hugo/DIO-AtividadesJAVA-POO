package Interface.Equipamentos.Impressora;

public class LaserJet implements Impressora {
    //Quando é interface não usa EXTENDS usa-se IMPLEMENTS
    public void imprimir() {
        System.out.println("Laser Jet Imprimindo");

    }
}
