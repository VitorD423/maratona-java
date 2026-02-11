package academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.Test;

import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio.EmailInvalidoException;
import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio.Usuario;
import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.service.UsuarioService;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Vitor","vitor@gmail.com",21);

        UsuarioService service = new UsuarioService();

        try {
            service.cadastrar(usuario1);
        } catch (EmailInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------");

        try {
        Usuario usuario2 = new Usuario("","diego0Ottres",17);
            service.cadastrar(usuario2);
        } catch (EmailInvalidoException | RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
