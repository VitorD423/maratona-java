package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.servico;

public class CalculadoraPlano {

    public  double calcularValorPlano(long gigabytes){

        double valor;

        if (gigabytes <= 10){
            valor = 50;
        } else if (gigabytes <= 20){
            valor = 50 + (gigabytes - 10) * 5;
        } else {
            valor = 100 + (gigabytes - 20) * 8;
        }

        if (gigabytes >= 30){
            valor = valor * 0.90;
        }

        return valor;
    }


}

