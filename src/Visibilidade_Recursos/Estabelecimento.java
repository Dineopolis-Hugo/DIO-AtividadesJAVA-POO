package Visibilidade_Recursos;

import Visibilidade_Recursos.area.cliente.Cliente;
import Visibilidade_Recursos.atendimento.Atendente;
import Visibilidade_Recursos.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();


        //ações que o estabelecinmento precisa ter ciência
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarsuconoBalcao();
        cozinheiro.acicionarComboNoBalcao();


        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();



    }
}
