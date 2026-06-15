package Exemplo_Fundamento.APPS;

public class FacebookMesseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO FACBOOK MESSEGER");
    }


    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK MESSEGER");
    }




}
