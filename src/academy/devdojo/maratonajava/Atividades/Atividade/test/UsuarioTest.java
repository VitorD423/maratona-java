package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1,"Vitor","Vitor@gmail.com",true,"16/01/2026");
        usuario.imprimirUsuario();
    }
}
