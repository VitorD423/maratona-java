package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class SistemaLogin {
    private String usuario;
    private String senha;
    private boolean logado;
    private int tentativas;

    private static int totalLogins;
    private static final int LIMITE_TENTATIVAS = 3;


   static  {
        System.out.println("Sistema de login carregado");
        totalLogins = 0;
    }

    {
        System.out.println("Inicializando usuário");
        logado = false;
        tentativas = 0;
    }

    public SistemaLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public SistemaLogin(){
       this("admin","123");
    }

    public void logar(String senhaDigitada){
       if (logado){
           System.out.println("Usuário já está logado");
           return;
       }

       if (tentativas >= LIMITE_TENTATIVAS) {
           System.out.println("Usuário bloqueado por excesso de tentativas");
           return;
       }

       if (senhaDigitada.equals(this.senha)){
           logado = true;
           totalLogins++;
           System.out.println("Login realizado com sucesso");
       } else {
           tentativas++;
           System.out.println("Senha incorreta (" + tentativas + "/" + LIMITE_TENTATIVAS + ")");
       }
    }

    public void imprimirStatus(){
        System.out.println("Nome de usuario: " + this.usuario);
        System.out.println("Status de Login: " + this.logado);
        System.out.println("Tentativas: " + tentativas);
        System.out.println("Total de logins: " + SistemaLogin.totalLogins);
    }
}
