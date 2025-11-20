package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2002;

        carro2.nome = "Venom";
        carro2.modelo = "Lamborghini";
        carro2.ano = 2013;

        System.out.println("Carro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
