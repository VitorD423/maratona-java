package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","Pixel");
        System.out.print(s1.equals(s2));
    }
}
