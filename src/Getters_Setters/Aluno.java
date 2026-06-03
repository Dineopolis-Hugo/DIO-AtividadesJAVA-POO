package Getters_Setters;

public class Aluno {
    //Os atributos precisam ser PRIVATE como no exemplo abaixo
    private String nome;
    private int idade;

    private String sexo;

    //getado pela IDE Botão direito e generate ou ALT + INSERT
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}



