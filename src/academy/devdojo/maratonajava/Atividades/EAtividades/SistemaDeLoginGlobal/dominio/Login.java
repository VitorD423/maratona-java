package academy.devdojo.maratonajava.Atividades.EAtividades.SistemaDeLoginGlobal.dominio;

import java.time.Instant;

public class Login {
    private String nome;
    private Instant momentoDoLogin;

    public Login(String nome, Instant momentoDoLogin) {
        this.nome = nome;
        this.momentoDoLogin = momentoDoLogin;
    }

    public String getNome() {
        return nome;
    }

    public Instant getMomentoDoLogin() {
        return momentoDoLogin;
    }
}
