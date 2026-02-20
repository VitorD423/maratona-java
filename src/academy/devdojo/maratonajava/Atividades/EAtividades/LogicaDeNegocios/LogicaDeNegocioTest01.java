package academy.devdojo.maratonajava.Atividades.EAtividades.LogicaDeNegocios;

public class LogicaDeNegocioTest01 {
    public static void main(String[] args) {
        long gigabytes = 30;
        double valor;


        if (gigabytes <= 10){
            valor = 50;
            System.out.println("O valor do plano de " + gigabytes + "GB é: "+ valor + "R$");
        } else if (gigabytes <= 20 ){
            valor = 50 + (gigabytes - 10) * 5;
            System.out.println("O valor do plano de " + gigabytes + "GB é: "+ valor + "R$");
        } else if (gigabytes > 20 && gigabytes < 30){
            valor = 100 + (gigabytes - 20) * 8;
            System.out.println("O valor do plano de " + gigabytes + "GB é: "+ valor + "R$");
        } else if (gigabytes >= 30){
            valor = 180 + (gigabytes - 30) * 8;
            double desconto = valor * 0.10;
            double valorTotal = valor - desconto;
            System.out.println("O valor do plano com desconto de " + gigabytes + "GB é: "+ valorTotal + "R$");
        }
    }
}


