package Encapsulamento;

public class MSNMesseger {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }
    private void validarConexaoInternet(){
        System.out.println("Validando se está validado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da Mensagem");
    }
}
