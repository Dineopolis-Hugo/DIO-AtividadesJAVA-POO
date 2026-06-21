package EXERCICIOS.BANCO_POO;

public  class Cliente {
    //Representa uma pessoa que possui uma conta.
    //Ela teria:
    //nome
    //CPF
    //endereço (se quiser)
    private String  cpf;
    public String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente() {
        this.cpf = cpf;
        this.nome = nome;
    }


}
