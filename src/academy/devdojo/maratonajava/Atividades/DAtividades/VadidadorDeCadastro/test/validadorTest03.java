package academy.devdojo.maratonajava.Atividades.DAtividades.VadidadorDeCadastro.test;

public class validadorTest03 {
    public static void main(String[] args) {
        String nome = "---AnA__mArIA---    da__Silva---";


        String nomeFormatado = nome.replace("-"," ")
                                    .replace("_"," ")
                                    .replaceAll("\\s+"," ")
                                    .trim()
                                    .toLowerCase();


        String[] partes = nomeFormatado.split(" ");

        StringBuilder resultado = new StringBuilder();

        for (String parte : partes){
            resultado.append(parte.substring(0,1).toUpperCase() + parte.substring(1) + " ");
        }
        System.out.println(resultado.toString().trim());
                                                                        ;
    }
}
