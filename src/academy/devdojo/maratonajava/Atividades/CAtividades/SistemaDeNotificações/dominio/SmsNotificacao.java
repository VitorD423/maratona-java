package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio;

public class SmsNotificacao extends Notificacao implements Notificavel{

    public SmsNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Mensagem recebida");
    }
}
