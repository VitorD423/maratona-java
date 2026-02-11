package academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio;

public class EmailInvalidoException extends RuntimeException{
    public EmailInvalidoException(String message) {
        super(message);
    }
}
