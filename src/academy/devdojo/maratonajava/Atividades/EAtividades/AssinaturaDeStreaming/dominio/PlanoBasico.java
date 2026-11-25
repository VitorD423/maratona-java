package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreaming.dominio;

public class PlanoBasico implements Plano{
    @Override
    public double calcularValor(long gigabytesConsumidos) {

        if (gigabytesConsumidos < 0){
            throw new IllegalArgumentException("GB não pode ser negativo");


        }

        if (gigabytesConsumidos <= 10){
            return 30;
        } else{
            return 30 + (gigabytesConsumidos - 10) * 2;
        }

    }
}
