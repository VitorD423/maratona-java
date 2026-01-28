package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class CarroEletrico extends Carro {


    static {
        System.out.println("Static CarroEletrico");
    }

    {
        System.out.println("Instance Carro Eletrico 1");
    }
    {
        System.out.println("Instance Carro Eletrico 2");
    }

    public CarroEletrico() {

        System.out.println("Constructor CarroEletrico");
    }

}
