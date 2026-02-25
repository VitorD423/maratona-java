package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio;

public class VagaCoberta implements Vaga{
    @Override
    public double calcularValor(long horasPassadas) {

        if (horasPassadas < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas");
        }

        double valor = horasPassadas * 15;

        if (horasPassadas > 5) {
            valor *= 0.9;
        }

        return valor;
    }
}