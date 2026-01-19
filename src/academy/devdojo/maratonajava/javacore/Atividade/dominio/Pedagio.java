package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class Pedagio {


    private static final double VALOR_BASE = 5.00;

    private static int totalVeiculos = 0;




    public static double calcularValorPedagio(String tipoVeiculo){
        if (tipoVeiculo.equalsIgnoreCase("CARRO")){
            totalVeiculos++;
            return VALOR_BASE;
        }

        else if (tipoVeiculo.equalsIgnoreCase("MOTO")){
            totalVeiculos++;
            return VALOR_BASE / 2;
        }

        else if (tipoVeiculo.equalsIgnoreCase("CAMINHAO")){
            totalVeiculos++;
            return VALOR_BASE * 3;
        }

        else{
            System.out.println("Erro");
            return 0;
        }

    }



    public static int getTotalVeiculos() {
        return totalVeiculos;
    }
}
