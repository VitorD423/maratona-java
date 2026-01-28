package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeEstacionamento.dominio;

public enum TipoCliente {
    COMUM(1,"Comun",1.0),
    MENSALISTA(2,"Mensalista",0.8),
    IDOSO(3,"Idoso",0.5);

    public int codigo;
    public String nome;
    public double desconto;


    TipoCliente(int codigo, String nome, double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.desconto = desconto;
    }

    public static TipoCliente tipoClientePorNome(String nome){
        for(TipoCliente tipoCliente: values()){
            if (tipoCliente.getNome().equalsIgnoreCase(nome)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getDesconto() {
        return desconto;
    }
}
