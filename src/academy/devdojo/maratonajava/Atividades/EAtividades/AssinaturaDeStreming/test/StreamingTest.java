package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio.*;
import academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.service.StreamingService;

public class StreamingTest {
    public static void main(String[] args) {
        StreamingService service = new StreamingService();

        Cliente clienteNormal = new clienteNormal("Vitor");
        Cliente clienteVip = new clienteVip("Ana");

        Plano planoBasico = new PlanoBasico();
        Plano planoPremium = new PlanoPremium();



            long gb1 = 15;
            long gb2 = 25;
            long gb3 = 40;

            System.out.println("Testes");

            System.out.println("\nCliente NORMAL + Plano BASICO (15GB)");
            System.out.println(service.calcularPlano(clienteNormal,planoBasico,gb1));

            System.out.println("\nCliente NORMAL + Plano PREMIUM (25GB)");
            System.out.println(service.calcularPlano(clienteNormal, planoPremium, gb2));

            System.out.println("\nCliente VIP + Plano BASICO (25GB)");
            System.out.println(service.calcularPlano(clienteVip,planoBasico,gb2));

            System.out.println("\nCliente VIP + Plano PREMIUM (40GB)");
            System.out.println(service.calcularPlano(clienteVip,planoPremium, gb3));

        System.out.println("\nTeste GB negativo");

        try {
            System.out.println(service.calcularPlano(clienteNormal,planoBasico,-10));
        } catch (IllegalArgumentException e){
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}
