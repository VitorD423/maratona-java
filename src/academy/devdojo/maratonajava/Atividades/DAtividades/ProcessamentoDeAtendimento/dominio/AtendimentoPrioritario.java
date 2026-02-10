package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio;


public class AtendimentoPrioritario extends Atendimento implements Processavel {
    public AtendimentoPrioritario(String cliente, int tempoEstimado, TipoAtendimento tipoAtendimento) {
        super(cliente, tempoEstimado, tipoAtendimento);
    }

    @Override
    public int calcularTempoFinal() {
        if (getTempoEstimado() > 120){
            throw new IllegalStateException("Muito alto o tempo porra");
        }

        return getTempoEstimado() /2;
    }

    @Override
    public void processar() {
        System.out.println("Processando atendimento Prioritario");
    }


}
