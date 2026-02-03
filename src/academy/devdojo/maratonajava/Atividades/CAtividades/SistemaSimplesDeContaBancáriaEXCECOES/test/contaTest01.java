package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeContaBancáriaEXCECOES.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeContaBancáriaEXCECOES.dominio.Conta;

public class contaTest01 {
    public static void main(String[] args) {
        Conta conta = new Conta(500);


        try {
            conta.sacar(600);
        System.out.println("Deu certo");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");
        try {
            conta.sacar(300);
            System.out.println("Deu certo 2");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
