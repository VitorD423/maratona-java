package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.ConversorTemperatura;

public class ConversorTemperaturaTest {
    public static void main(String[] args) {
        double resultadoCelsius = ConversorTemperatura.celsiusParaFahrenheit(5);
        System.out.println(resultadoCelsius);

        double resultadoFahrenheit = ConversorTemperatura.fahrenheitParaCelsius(-20000);
        System.out.println(resultadoFahrenheit);
    }
}
