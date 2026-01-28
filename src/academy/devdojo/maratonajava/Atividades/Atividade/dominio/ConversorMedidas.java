package academy.devdojo.maratonajava.Atividades.Atividade.dominio;

public class ConversorMedidas {

    private static final double FATOR_CONVERSAO = 1000.0;

    public static double metrosParaKm(double metros){
        if (metros < 0){
            System.out.println("Valor invalido");
            return 0;
        }

        return metros / FATOR_CONVERSAO;
    }

    public static double KmParaMetros(double km){
        if (km < 0){
            System.out.println("Valor invalido");
            return 0;
        }

        return km * FATOR_CONVERSAO;
    }

    public static double quilosParaGramas(double kg){
        if (kg <0 ){
            System.out.println("Valor invalido");
            return 0;
        }

        return kg * FATOR_CONVERSAO;
    }

    public static double gramasParaQuilos(double gramas){
        if (gramas < 0){
            System.out.println("Valor invalido");
            return 0;
        }

        return gramas /FATOR_CONVERSAO;
    }


}
