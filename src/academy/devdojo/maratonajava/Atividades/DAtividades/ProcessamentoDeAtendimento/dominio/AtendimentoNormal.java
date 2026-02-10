package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio;


public class AtendimentoNormal extends Atendimento implements Processavel {
    public AtendimentoNormal(String cliente, int tempoEstimado, TipoAtendimento tipoAtendimento) {
        super(cliente, tempoEstimado, tipoAtendimento);
    }

    @Override
    public int calcularTempoFinal() {
        return getTempoEstimado();
    }

    @Override
    public void processar() {
        System.out.println("Processando atendimento normal");
    }
}
