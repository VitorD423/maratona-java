package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.servico;

public class Estacionamento {

    public double calcularValor(long horas){
        double valores;
        if (horas <= 1){
            valores = 5;
        }else if (horas > 1 && horas <= 3){
            valores = 5 + (horas - 1) * 3;
        }else {
            valores = 11 + (horas - 3) * 2;
        }

        if (horas > 8){
            valores = valores * 0.85;
        }
        return valores;
    }
}
