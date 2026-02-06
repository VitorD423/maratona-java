package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaSimplesDeEmprestimoDeLivros.dominio;

public class Livro {
    private String titulo;
    private boolean isEmprestado;

    public Livro(String titulo, boolean isEmprestado) {
        this.titulo = titulo;
        this.isEmprestado = false;
    }

    public void emprestar(){
        if (isEmprestado){
            throw new IllegalStateException("Livro já esta emprestado");
        }
        isEmprestado = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return isEmprestado;
    }
}
