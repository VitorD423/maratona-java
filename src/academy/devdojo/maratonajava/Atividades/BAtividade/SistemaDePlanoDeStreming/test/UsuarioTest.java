package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.dominio.TipoDePlano;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.dominio.UsuarioComun;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.dominio.Usuario;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreming.dominio.UsuarioEmpresa;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new UsuarioComun("Vito",50,TipoDePlano.BASICO);
        Usuario usuario2 = new UsuarioEmpresa("Diego",50,TipoDePlano.PREMIUM);

        usuario1.imprimirResumo();
        System.out.println("--------------------");
        usuario2.imprimirResumo();
    }

}
