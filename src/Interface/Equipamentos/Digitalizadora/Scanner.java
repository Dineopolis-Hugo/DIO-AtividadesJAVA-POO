package Interface.Equipamentos.Digitalizadora;

public class Scanner implements Digitalizadora {
    //Quando é interface não usa EXTENDS usa-se IMPLEMENTS
    public void digitalizar() {
        System.out.println("Scanner Digitalizando");

    }
}
