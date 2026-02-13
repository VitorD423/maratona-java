package academy.devdojo.maratonajava.Atividades.DAtividades.VadidadorDeCadastro.test;

public class validadorTest04 {
    public static void main(String[] args) {
        String nome = "--JoAO__   piErRE---  da__Silva__--";

        String nomeFormatado = nome.replace("-"," ")
                                    .replace("_"," ")
                                    .replaceAll("\\s+"," ")
                                    .trim().toLowerCase();

        String[] partes = nomeFormatado.split(" ");

        StringBuilder resultado = new StringBuilder();


        for (String parte : partes){
          if (!parte.isEmpty()){
              resultado.append(parte.substring(0,1).toUpperCase())
                      .append(parte.substring(1)).append(" ");
          }

        }
        System.out.println(resultado.toString().trim());


    }
}
