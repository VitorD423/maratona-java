package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeEmprestimoDeLivrosEXCECOES.dominio;

public class Livro {
    private String titulo;
    private int quantidadeDisponivel;

    public Livro(String titulo, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void emprestar (){
        if (quantidadeDisponivel <= 0){
            throw new IllegalStateException("Não é possivel emprestar");
        }
        quantidadeDisponivel --;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
