package academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio;

public class UsuarioJaCadastradoExcepetion extends RuntimeException {
    public UsuarioJaCadastradoExcepetion(String message) {
        super(message);
    }
}
