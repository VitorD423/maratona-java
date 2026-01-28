package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.ConversorMedidas;

public class ConversorMedidasTest {
    public static void main(String[] args) {
        double resultadoMetrosParaKm = ConversorMedidas.metrosParaKm(500);
        System.out.println(resultadoMetrosParaKm);

        double resultadoKmParaMetros = ConversorMedidas.KmParaMetros(200);
        System.out.println(resultadoKmParaMetros);

        double resultadoQuilosParaGramas = ConversorMedidas.quilosParaGramas(500);
        System.out.println(resultadoQuilosParaGramas);

        double resultadoGramasParaQuilos = ConversorMedidas.gramasParaQuilos(1000);
        System.out.println(resultadoGramasParaQuilos);
    }
}
