package Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {


        //Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("1234","HUGUIN");

        // O tipo de parametro é definido lá no construtor

        //Definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o CPF de marcos?
        //R:Através do construtor:

        /* public Pessoa (String cpf, String nome){
         *  this.cpf = cpf;
         *  this.nome = nome;*/


        //Imprimindo o marcos sem nome e CPF
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());

    }
}