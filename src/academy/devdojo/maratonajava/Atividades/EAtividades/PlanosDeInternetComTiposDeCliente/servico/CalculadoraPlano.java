package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.servico;

public class CalculadoraPlano {

    public  double calcularValorPlano(long gigabytes){

        double valores;

        if (gigabytes <= 10){
            valores = 50;
        } else if (gigabytes <= 20){
            valores = 50 + (gigabytes - 10) * 5;
        } else {
            valores = 100 + (gigabytes - 20) * 8;
        }

        if (gigabytes >= 30){
            valores = valores * 0.90;
        }

        return valores;
    }


}

