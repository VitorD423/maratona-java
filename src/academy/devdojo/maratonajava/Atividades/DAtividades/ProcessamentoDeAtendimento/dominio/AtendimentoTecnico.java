package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio;


public class AtendimentoTecnico extends Atendimento implements Processavel {
    public AtendimentoTecnico(String cliente, int tempoEstimado, TipoAtendimento tipoAtendimento) {
        super(cliente, tempoEstimado, tipoAtendimento);
    }

    @Override
    public int calcularTempoFinal() {
        if (getTempoEstimado() > 180){
            throw new IllegalStateException("Todo errado");
        }

        return getTempoEstimado() + 30;
    }

    @Override
    public void processar() {
        System.out.println("Processando atendimento técnico");
    }


}
