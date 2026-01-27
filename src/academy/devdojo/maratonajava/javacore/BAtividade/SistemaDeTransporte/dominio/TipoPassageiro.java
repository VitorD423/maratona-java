package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeTransporte.dominio;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public enum TipoPassageiro {
    ADULTO(1,"Adulto paga valor total","Adulto",1.0),
    ESTUDANTE(2,"Estudante paga meia","Estudante",0.5),
    IDOSO(3,"Idoso não paga","Idoso",0.0);

    private int codigo;
    private String descricao;
    private String nome;
    private double percentualPago;

    TipoPassageiro(int codigo, String descricao, String nome, double percentualPago) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
        this.percentualPago = percentualPago;
    }

    public static TipoPassageiro tipoPassageiroPorDescricao(String descricao){
        for (TipoPassageiro tipoPassageiro : values()) {
            if (tipoPassageiro.getDescricao().equals(descricao)){
                return tipoPassageiro;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPercentualPago() {
        return percentualPago;
    }
}
