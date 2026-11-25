package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreaming.dominio;

public class PlanoPremium implements Plano{
    @Override
    public double calcularValor(long gigabytesConsumidos) {

        if (gigabytesConsumidos < 0){
            throw new IllegalArgumentException("GB não pode ser negativo");
        }

        if (gigabytesConsumidos <= 20){
            return  80;
        } else {
            return  80 + (gigabytesConsumidos - 20) * 1.50;
        }


    }
}
