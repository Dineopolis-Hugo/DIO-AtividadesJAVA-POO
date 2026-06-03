package Visibilidade_Recursos.atendimento;

public class Atendente {
    public void servindoMesa(){
        //como é  uma ação da mesma classe
        // ela pode chamar o método antes de executar o outro
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
    }
    private void pegarLancheCozinha(){
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }
    public void receberPagamento(){
        servindoMesa();

        System.out.println("RECEBENDO PAGAMENTO");
    }
     void trocarGas(){
        System.out.println("ATENDENTE TROCANDO GAS");
        //Essa ação sendo default ela só ficará visível para o pacote onde atendente está
        //(o pacote ATENDIMENTO)
    }
    public void pegarPedidoBalcao(){
        System.out.println("PEGANDO PEDIDO NO BALCAO");
    }
}
