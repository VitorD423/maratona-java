package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio;

public class VagaComum implements Vaga{
    @Override
    public double calcularValor(long horasPassadas) {

        if (horasPassadas < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas");
        }

        return horasPassadas * 10;
    }
}