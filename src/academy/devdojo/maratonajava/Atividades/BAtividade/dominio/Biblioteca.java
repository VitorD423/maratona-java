package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Biblioteca {
    private static final int LIMITE_EMPRESTIMOS = 3;
    private static int totalEmprestimos;
    private String nome;

    static {
        System.out.println("Sistema da biblioteca iniciado");
        totalEmprestimos = 0;
    }

    {
        System.out.println("Biblioteca criada");
    }

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void emprestarLivro(Livro livro){

        if (livro.isEmprestado()){
            System.out.println("livro já está emprestado");
            return;
        }

        if (totalEmprestimos >= LIMITE_EMPRESTIMOS){
            System.out.println("Limite de empréstimos atingido");
            return;
        }

        livro.setEmprestado(true);
        totalEmprestimos++;
        System.out.println("Livro emprestado: " + livro.getTitulo());
    }

    public void imprimirStatus(){
        System.out.println("Nome da biblioteca: " + this.nome);
        System.out.println("Total de emprestimos: " + totalEmprestimos);
        System.out.println("Limite máximo: " + LIMITE_EMPRESTIMOS);
    }


    public static int getTotalEmprestimos() {
        return totalEmprestimos;
    }
}
