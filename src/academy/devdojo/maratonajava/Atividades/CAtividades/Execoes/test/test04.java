package academy.devdojo.maratonajava.Atividades.CAtividades.Execoes.test;

public class test04 {
    public static void main(String[] args) {
        try {
           // dividir(10,0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("FIM");
    }


}
