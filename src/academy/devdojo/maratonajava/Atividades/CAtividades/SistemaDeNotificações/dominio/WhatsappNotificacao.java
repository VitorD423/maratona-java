package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeNotificações.dominio;

public class WhatsappNotificacao extends Notificacao implements Notificavel{
    private double numeroTelefone;

    public WhatsappNotificacao(String destinatario, String mensagem, double numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Fiu fiu");
    }

    public double getNumeroTelefone() {
        return numeroTelefone;
    }
}
