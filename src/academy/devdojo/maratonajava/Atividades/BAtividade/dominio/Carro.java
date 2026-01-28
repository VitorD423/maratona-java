package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;


    static {
        System.out.println("Static Carro");
    }

    {
        System.out.println("Instance Carro 1 ");
    }
    {
        System.out.println("Instance Carro 2 ");
    }

    public Carro() {
        System.out.println("Constructor Carro");
    }

    public Carro(String marca, double velocidadeMaxima, int quantidadePortas) {
        super(marca, velocidadeMaxima);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularImposto() {
        return velocidadeMaxima * 0.15;
    }

    public void imprimir(){
        System.out.println("Tipo do veiculo: Carro");
        super.imprimir();
        System.out.println("Quantidade de portas: " + this.quantidadePortas);
    }
}
