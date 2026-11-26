package academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.dominio;

public class VagaVIP implements Vaga{
    @Override
    public double calcularValor(long horasPassadas) {
        if (horasPassadas < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas");
        }

        double valor = horasPassadas * 25;

        if (horasPassadas > 3){
            valor = 60;
        }
        return valor;
    }
}
