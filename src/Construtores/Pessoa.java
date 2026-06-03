package Construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Método construtor
    //Deve ser o mesmo nome da classe
    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome; //"this" usado para adicionar atributos a classe
    // O Método vai pedir o nome e o cpf da pessoa
    // Antes de chamar os outros métodos
    }

    //Get para obter informações
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    //Set para adicionar atributos
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    //...
    //Setters de nome e cpf?
}
