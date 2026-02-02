package academy.devdojo.maratonajava.Atividades.CAtividades.Execoes.test;

public class test02 {
    public static void main(String[] args) {
        dividir(5,0);
    }

    public static int dividir(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("b  não pode ser zero");
        }
        return  a / b;
    }
}
