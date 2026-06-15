package Exemplo_Fundamento.APPS;
//a classe MSNMesseger é ou representa
public abstract class ServicoMensagemInstantanea {

    //EXEMPLO ABSTRAÇÃO
    public abstract void enviarMensagem();

    public abstract void receberMensagem();
    //O ABSTRACT faz com que as classes filhas tenham obrugatoriamente o método desejado

    //Apenas as classes filhas e as classes do mesmo pacote conseguem ver um método PROTECTED
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    //ABSTRAÇÃO faz a classe ter métodos padrão
    //Já o POLIMORFISMO define a maneira que esses métodos padrão vão ser executados
}
