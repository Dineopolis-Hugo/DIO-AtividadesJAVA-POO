package Pilares_POO_Resumo;

public class Carro extends Veiculo
//Herança: o carro é uma extensão da classe veículo.
//Ou seja, Pilares_POO_Resumo.Carro vai passar a possuir métodos e atributos de outra classe
{


    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Pilares_POO_Resumo.Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo Cambio em P");
    }
    //Encapsulando os métodos:
    //Nem todos os métodos mrecisam ser publicos ao usuário então podemos encapsulá-los
    //como nesse exemplo o carro quando liga ja confere o necessário sem o usuário digitar tudo
}
