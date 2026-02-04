package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeReservaDeAssentosEXCECOES.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeReservaDeAssentosEXCECOES.dominio.Assento;

public class AssentoTest01 {
    public static void main(String[] args) {
        Assento assento1 = new Assento(5,false);

        System.out.println("Estado do assento: " + assento1.isOcupado());
        System.out.println("-------------------");
        try{
            assento1.reservar();
            System.out.println("Assento reservado com sucesso");
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------");
        System.out.println("Estado do assento: " + assento1.isOcupado());

        System.out.println("--------------------");
        try {
            assento1.reservar();
            System.out.println("Assento reservado com sucesso");
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }

}
