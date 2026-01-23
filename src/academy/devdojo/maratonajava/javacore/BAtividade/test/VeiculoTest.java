package academy.devdojo.maratonajava.javacore.BAtividade.test;

import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Carro;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Moto;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("BMW",235);
        Veiculo carro = new Carro("Chevrolet", 300, 2);
        Veiculo moto = new Moto("Yamaha",145,155 );

        Veiculo[] veiculos = {veiculo,carro,moto};

        for (Veiculo v : veiculos){
            System.out.println("------------");
            v.imprimir();
        }
    }
}
