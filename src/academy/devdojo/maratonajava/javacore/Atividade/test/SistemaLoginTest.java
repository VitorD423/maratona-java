package academy.devdojo.maratonajava.javacore.Atividade.test;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.SistemaLogin;

public class SistemaLoginTest {
    public static void main(String[] args) {
        SistemaLogin login1 = new SistemaLogin("admin", "123");
        login1.logar("errada");
        login1.logar("errada");
        login1.logar("errada");
        login1.logar("123");

        System.out.println();

        SistemaLogin login2 = new SistemaLogin("boa","Biscoito");

        login2.logar("Biscoito");

        login1.imprimirStatus();
        System.out.println();
        login2.imprimirStatus();
    }
}
