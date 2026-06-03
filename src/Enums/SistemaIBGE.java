package Enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        // FOR EACH é o ideal para enums pois o método .values()
        // retorna todos os valores do enum
        for (EstadoBrasileiro estadobr: EstadoBrasileiro.values()) {
            //A parte |EstadoBrasileiro estadobr| cria uma classe (estadobr)
            // de uma classe (EstadoBrasileiro)

            //A leitura é: Para cada EstadoBrasileiro dentro de EstadoBrasileiro.values()

            System.out.println(estadobr.getSigla() + "-" + estadobr.getNome() + " " + estadobr.getIbge());
        }
            //Adicionar variavel a um estado específico
            EstadoBrasileiro estadoespecifico = EstadoBrasileiro.PIAUI;
            System.out.println("SEU ESTADO ESPECIFICO: " + estadoespecifico.getNome());
            System.out.println("SIGLA DO ESTADO ESPECIFICO: " +estadoespecifico.getSigla());
            System.out.println("NOME MAIUSCULO DO ESTADO ESPECIFICO: " +estadoespecifico.getIbge());



    }
}
