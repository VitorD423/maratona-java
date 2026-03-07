package academy.devdojo.maratonajava.Atividades.EAtividades.SistemaDeLoginGlobal.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.SistemaDeLoginGlobal.service.LoginServico;

public class LoginTest01 {
    public static void main(String[] args) {
        LoginServico servico = new LoginServico();
        System.out.println(servico.registrarLogin("Vitor", "Asia/Tokyo"));
    }
}
