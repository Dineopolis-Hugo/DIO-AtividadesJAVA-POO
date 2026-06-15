package Interface.Equipamentos.Impressora;

public class DeskJet implements Impressora {
    //Quando é interface não usa EXTENDS usa-se IMPLEMENTS
    public void imprimir() {
        System.out.println("Desk Jet Imprimindo");

    }
}
