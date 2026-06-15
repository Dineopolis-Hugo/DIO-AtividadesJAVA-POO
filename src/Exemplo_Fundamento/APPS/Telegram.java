package Exemplo_Fundamento.APPS;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");
    }


    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");
    }

}
