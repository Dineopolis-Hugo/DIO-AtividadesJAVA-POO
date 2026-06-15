package Exemplo_Fundamento;

import Exemplo_Fundamento.APPS.FacebookMesseger;
import Exemplo_Fundamento.APPS.MSNMesseger;
import Exemplo_Fundamento.APPS.ServicoMensagemInstantanea;
import Exemplo_Fundamento.APPS.Telegram;

public class computadorPedrinho {
    public static void main(String[] args) {
        //ABSTRAÇÃO faz a classe ter métodos padrão
        //Já o POLIMORFISMO define a maneira que esses métodos padrão vão ser executados

        //Os Serviços (telegram,face,msn) Tem métodos obrigatórios (padrões) para funcionar
        //Isso foi implementado através da herança,
        //onde eles receberam esses métodos da classe mãe (SERVIÇO DE MENSAGEM INSTANTANEA)

        ServicoMensagemInstantanea smi = null;
        // EXEMPLO POLIMORFISMO
        // Não se sabe qual app, mas qualquer um deve receber e enviar mensagens

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMesseger();
        }
        else if (appEscolhido.equals("fcb")) {
            smi = new FacebookMesseger();
        }
        else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }
        //O Serviço de mensagens "MSI" está nulo, dependendo da resposta o MSI vira o app que eu quero
        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
