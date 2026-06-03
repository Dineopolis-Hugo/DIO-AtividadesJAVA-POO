package Getters_Setters;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Almeida");
        felipe.setIdade(8);
        //adicionando valores dos atributos através do SET

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade());
        //puxando os valores adicionados pelo método set
    }

}
