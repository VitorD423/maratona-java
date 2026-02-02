package academy.devdojo.maratonajava.Atividades.CAtividades.Execoes.test;

public class test01 {
    public static void main(String[] args) {
        dividir(10, 2);
        dividir(10, 0);
    }

    static void dividir(int a, int b){
        if (b == 0){
            System.out.println("B é zero :()");
        }else {
            System.out.println("Divisão: " + a / b);
        }
    }
}
