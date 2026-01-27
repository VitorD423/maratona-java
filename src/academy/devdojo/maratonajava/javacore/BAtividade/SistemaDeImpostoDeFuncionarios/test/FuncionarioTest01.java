package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.test;

import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio.FuncionarioCLT;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio.FuncionarioPJ;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio.TipoContrato;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new FuncionarioCLT("Vitor",1500, TipoContrato.CLT);
        Funcionario funcionarioPJ = new FuncionarioPJ("Diego",5000,TipoContrato.PJ);

        funcionarioCLT.imprimirResumo();
        System.out.println("--------------------");
        funcionarioPJ.imprimirResumo();
    }

}
