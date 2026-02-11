package academy.devdojo.maratonajava.javacore.Wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        Byte bytew = 1;
        Short shortw = 1;
        Integer intw = 1;
        Long longw = 10L;
        Float floatw = 10F;
        Double doublew = 10D;
        Character charw = 'W';
        Boolean booleanw = false;

        int i = intw; // unboxing
        Integer intW2 = Integer.parseInt("1"); //
        boolean verdadeiro = Boolean.parseBoolean("tRue");
      //  System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!')); // se não for um valor ou digito == false
        System.out.println(Character.isUpperCase('a')); // Pergunta se é uppercase (Maiuscula) se sim retorna true
        System.out.println(Character.isLowerCase('A')); // mesma coisa só que minuscula
        System.out.println(Character.toUpperCase('a')); // transforma em maiuscula
        System.out.println(Character.toLowerCase('A')); // transforma em minuscula
    }
}
