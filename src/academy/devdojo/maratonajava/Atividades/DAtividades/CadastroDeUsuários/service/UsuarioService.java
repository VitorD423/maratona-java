package academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.service;

import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio.EmailInvalidoException;
import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio.IdadeInvalidaException;
import academy.devdojo.maratonajava.Atividades.DAtividades.CadastroDeUsuários.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario usuario){
        validar(usuario);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");

    }

    private void validar(Usuario usuario){
        if (usuario.getEmail() == null ||
                !usuario.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            throw new EmailInvalidoException("Email inválido");
        }

        if (usuario.getIdade() < 18){
            throw new IdadeInvalidaException("Idade inválida");
        }
    }
}
