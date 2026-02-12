package academy.devdojo.maratonajava.Atividades.DAtividades.VadidadorDeCadastro.test;

public class validadorTest01 {
    public static void main(String[] args) {
        String nome = "  wIlLiAm suAne  ";

        String nomeFormatado = nome.trim().toLowerCase();
        String[] parte = nomeFormatado.split(" ");

        String resultado = "";

        for (String partes : parte){
         resultado +=  partes.substring(0,1).toUpperCase() + partes.substring(1) + " ";
        }
        System.out.println(resultado.trim());

    }
}
