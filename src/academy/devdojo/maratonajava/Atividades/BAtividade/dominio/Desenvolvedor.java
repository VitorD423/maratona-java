package academy.devdojo.maratonajava.Atividades.BAtividade.dominio;

public class Desenvolvedor extends Funcionario{
    private String nivel;

    public Desenvolvedor(String nome, double salario, String nivel) {
        super(nome, salario);
        this.nivel = nivel;
    }

    @Override
    public double calcularBonus() {

        if (nivel.equalsIgnoreCase ("Junior")){
            return salario * 0.05;
        }else if (nivel.equalsIgnoreCase("Pleno")){
            return salario / 10;
        }else if (nivel.equalsIgnoreCase("Senior")){
            return salario * 0.2;
        }else {
        return 0;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Desenvolvedor");
        super.imprimir();
        System.out.println("Nivel: " + this.nivel);
    }
}
