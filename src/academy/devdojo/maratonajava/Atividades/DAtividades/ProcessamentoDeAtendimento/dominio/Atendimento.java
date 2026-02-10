package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.Processavel;

public abstract class Atendimento implements Processavel {
    private String cliente;
    private int tempoEstimado;
    private TipoAtendimento tipoAtendimento;

    public Atendimento(String cliente, int tempoEstimado, TipoAtendimento tipoAtendimento) {
        if (tempoEstimado <= 0){
            throw new IllegalArgumentException("Tempo não pode ser zero");
        }

        this.cliente = cliente;
        this.tempoEstimado = tempoEstimado;
        this.tipoAtendimento = tipoAtendimento;
    }

    public abstract int calcularTempoFinal();

    public String getCliente() {
        return cliente;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }
}
