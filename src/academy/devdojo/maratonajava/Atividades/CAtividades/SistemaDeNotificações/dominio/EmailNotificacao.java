package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio;

public class EmailNotificacao extends Notificacao implements Notificavel{
    private String assunto;

    public EmailNotificacao(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Produto a caminho");
    }

    public String getAssunto() {
        return assunto;
    }
}
