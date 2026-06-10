package Pilares_POO_Resumo;

public abstract class Veiculo {
    private String chassi;


    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }  //Getters e setters chassi

    public abstract void ligar();
    //Abstração:Define métodos que as classes filhas devem possuir.
    //Ou seja,a classe mãe faz com que as filhas tenham um método padrão.
    // Mas elas decidem a maneira de executar essa ação
}
