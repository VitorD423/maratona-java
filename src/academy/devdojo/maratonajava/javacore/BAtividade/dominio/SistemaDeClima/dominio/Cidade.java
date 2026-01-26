package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDeClima.dominio;

public class Cidade {
    private String nome;
    private Clima clima;
    private double energiaBase;

    public Cidade(String nome, Clima clima, double energiaBase) {
        this.nome = nome;
        this.clima = clima;
        this.energiaBase = energiaBase;
    }

    public double energiaTotal(){
        return energiaBase * clima.getMultiplicadorDeEnergia();
    }

    public void alterarClima(Clima novoClima){
        clima = novoClima;
    }

    public void imprimir(){
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Clima: " + clima.getDescricaoTextual());
        System.out.println("Energia total: " + energiaTotal());
    }
}
