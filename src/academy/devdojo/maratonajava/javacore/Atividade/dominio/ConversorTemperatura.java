package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius){
        double resultado = (celsius * 9.0/5) + 32 ;

        if (celsius < -273.15){
            System.out.println("Temperatura inválida");
            return 0;
        }

        return resultado;


    }

    public static double fahrenheitParaCelsius(double fahrenheit){
     double resultado = (fahrenheit - 32) * 5.0/9 ;

     if (fahrenheit < -273.15){
         System.out.println("Temperatura inválida");
         return 0;
     }

     return resultado;
    }


}
