package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeContaBancáriaEXCECOES.dominio;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (valor > saldo){
            throw new IllegalArgumentException("O valor não pode ser maior que o saldo");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso");
    }
}
