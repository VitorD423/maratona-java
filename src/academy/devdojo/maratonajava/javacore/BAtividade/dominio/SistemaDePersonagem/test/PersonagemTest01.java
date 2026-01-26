package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.test;

import academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio.ClassePersonagem;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio.Personagem;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio.TipoAtaque;

public class PersonagemTest01 {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Vitor", ClassePersonagem.GUERREIRO, TipoAtaque.CORPO_A_CORPO);
        Personagem personagem2 = new Personagem("Diego", ClassePersonagem.MAGO, TipoAtaque.MAGIA);
        Personagem personagem3 = new Personagem("Cassio",ClassePersonagem.ARQUEIRO,TipoAtaque.DISTANCIA);

        System.out.println(personagem1);
        System.out.println(personagem2);
        System.out.println(personagem3);

    }
}
