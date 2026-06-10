package Pilares_POO_Resumo;

public class Autodromo {
    public static void main(String[] args) {
        Carro Jeep = new Carro();
        Jeep.setChassi("696969");
        Jeep.ligar();

        Moto Z400 = new Moto();
        Z400.setChassi("676767");
        Z400.ligar();

        //Resultado abstração: os métodos são iguais, mas o carro confere aslgimas coisas antes de ligar
        //diferende da moto que apenas liga.
        //Mostrando a abstração,pois são métodos iguais sendo executados de maneiras diferentes

        Veiculo Coringa = Z400;
        Coringa.ligar();
        // Exemplo de polimorfismo.
        // A variável genérica é do tipo Pilares_POO_Resumo.Veiculo, mas referencia o objeto Z400.
        // Ao chamar ligar(), é executado o método da classe real/específica: Z400.
    }

}
