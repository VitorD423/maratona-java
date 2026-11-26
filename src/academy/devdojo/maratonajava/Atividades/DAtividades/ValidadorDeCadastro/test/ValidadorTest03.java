package academy.devdojo.maratonajava.Atividades.DAtividades.ValidadorDeCadastro.test;

public class ValidadorTest03 {
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
            resultado.append(parte.substring(0,1).toUpperCase())
                    .append(parte.substring(1))
                    .append(" ");
        }
        System.out.println(resultado.toString().trim());
                                                                        ;
    }
}
