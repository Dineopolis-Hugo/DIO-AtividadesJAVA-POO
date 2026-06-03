package Visibilidade_Recursos.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido(){
        System.out.println("FAZENDO O PEDIDO");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        //como é  uma ação da mesma classe
        // ela pode chamar o método antes de executar o outro

        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }

}
