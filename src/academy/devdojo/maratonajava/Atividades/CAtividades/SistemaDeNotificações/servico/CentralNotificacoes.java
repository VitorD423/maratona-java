package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio.EmailNotificacao;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio.Notificacao;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio.Notificavel;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio.WhatsappNotificacao;

public class CentralNotificacoes {


    public static void enviar(Notificavel notificavel){
       notificavel.enviarNotificacao();
    }


public static void gerarRelatorio(Notificacao notificacao){
    System.out.println("Destinatário: " + notificacao.getDestinatario());
    System.out.println("Mensagem: " + notificacao.getMensagem());

    if (notificacao instanceof EmailNotificacao){
        EmailNotificacao emailNotificacao = (EmailNotificacao) notificacao;
        System.out.println("Assunto: " + emailNotificacao.getAssunto());
    }

    if (notificacao instanceof WhatsappNotificacao){
        WhatsappNotificacao whatsappNotificacao = (WhatsappNotificacao) notificacao;
        System.out.println("Numero: " + whatsappNotificacao.getNumeroTelefone());
    }
}
}


