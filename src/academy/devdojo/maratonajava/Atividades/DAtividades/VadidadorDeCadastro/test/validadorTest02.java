package academy.devdojo.maratonajava.Atividades.DAtividades.VadidadorDeCadastro.test;

public class validadorTest02 {
    public static void main(String[] args) {
        String nome = "---ViToR dIEGo-------";

        String nomeFormatado = nome.replace("-"," ").trim().toLowerCase();

        String[] partes = nomeFormatado.split(" ");

        String resultado = "";

        for (String parte : partes){
            resultado += parte.substring(0,1).toUpperCase() + parte.substring(1) + " ";
        }
        System.out.println(resultado.trim());
    }
}
