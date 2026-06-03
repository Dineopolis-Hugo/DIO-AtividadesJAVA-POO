package Visibilidade_Recursos.atendimento.cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    //pode ser default
    public void adicionarsuconoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    //pode ser default
    public void acicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarsuconoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
        //com o modificador private a ação ficará disponível apenas na sua classe
        //a classe COZINHEIRO
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO  SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO SALADA,OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA,LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    private void fritaringredientesLanche(){
        System.out.println("FRITANDO A CARNE PARA O HAMBURGUER");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }


}

