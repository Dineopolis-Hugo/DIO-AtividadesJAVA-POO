package Visibilidade_Recursos.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
    System.out.println("CONTROLANDO ENTRADA DOS ITENS");
    }
    private void controlarSaida(){
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
    }
     void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
        //Dentro desse método default eu consigo colocar o private pois está na mesma classe
        //Com isso, quando o almoxarife entregar os ingredientes ele ja vai controlar a saída
        //E apenas ele irá saber
    }
     void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
    // sem nenhum nome de visibilidade = DEFAULT
    // (no default a ação fica visível apenas no seu pacote [package])
    }

