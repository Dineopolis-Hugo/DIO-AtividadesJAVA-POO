package Exemplo_Fundamento.APPS;

public class MSNMesseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO MSN MESSEGER");
    }


    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO MSN MESSEGER");
    }

}
