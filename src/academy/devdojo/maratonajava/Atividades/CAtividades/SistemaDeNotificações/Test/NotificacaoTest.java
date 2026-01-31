package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.Test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio.*;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.servico.CentralNotificacoes;

public class NotificacaoTest {
    public static void main(String[] args) {
        EmailNotificacao  email =  new EmailNotificacao("Vitor","Tô comendo aqui","HAMBURG");
        SmsNotificacao smsNotificacao =  new SmsNotificacao("Diego","Recarrege agora seu chip por apenas R$ 9,99");
        WhatsappNotificacao whatsappNotificacao =  new WhatsappNotificacao("Torres","Bom dia",99999-99999);

        CentralNotificacoes.enviar(email);
        CentralNotificacoes.gerarRelatorio(email);
        System.out.println("--------------------------");
        CentralNotificacoes.enviar(smsNotificacao);
        CentralNotificacoes.gerarRelatorio(smsNotificacao);
        System.out.println("--------------------------");
        CentralNotificacoes.enviar(whatsappNotificacao);
        CentralNotificacoes.gerarRelatorio(whatsappNotificacao);
    }
}
