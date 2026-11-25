package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.dominio.TipoDePlano;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.dominio.UsuarioComun;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.dominio.Usuario;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.dominio.UsuarioEmpresa;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new UsuarioComun("Vito",50,TipoDePlano.BASICO);
        Usuario usuario2 = new UsuarioEmpresa("Diego",50,TipoDePlano.PREMIUM);

        usuario1.imprimirResumo();
        System.out.println("--------------------");
        usuario2.imprimirResumo();
    }

}
