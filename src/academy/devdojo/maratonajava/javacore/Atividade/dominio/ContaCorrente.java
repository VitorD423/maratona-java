package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class ContaCorrente {
    private String titular;
    private double saldo;

    public void init (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }


    public void imprimirConta(){
        System.out.println(this.titular);
        System.out.println(this.saldo);
    }


//Arrumar impressora








    public double aplicarRendimento(double taxa) {
        double novoSaldo = this.saldo * (1 + taxa);
        this.saldo = novoSaldo;
        return novoSaldo;
    }



    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
