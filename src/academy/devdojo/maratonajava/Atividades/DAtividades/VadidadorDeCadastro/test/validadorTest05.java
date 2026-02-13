package academy.devdojo.maratonajava.Atividades.DAtividades.VadidadorDeCadastro.test;

public class validadorTest05 {
    public static void main(String[] args) {
        String nome = "ana-maria__da-silva--- joao_pedro";


        String nomeFormatado = nome.replace("_"," ")
                                    .replaceAll("\\s+"," ")
                                    .trim().toLowerCase();


        String[] palavras = nomeFormatado.split(" ");

        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras){

            String[] partesHifen = palavra.split("-");

            for (int i = 0; i < partesHifen.length; i++){
                String parte = partesHifen[i];
                resultado.append(parte.substring(0,1).toUpperCase())
                        .append(parte.substring(1));

                if (i < partesHifen.length - 1) {
                    resultado.append("-");
                }
            }
            resultado.append(" ");
        }

        System.out.println(resultado.toString().trim());
    }
}
