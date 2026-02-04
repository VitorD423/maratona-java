package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeReservaDeAssentos.dominio;

public class Assento {
    private int numero;
    private boolean isOcupado;


    public Assento(int numero, boolean isOcupado) {
        this.numero = numero;
        this.isOcupado = isOcupado;
    }

    public void reservar(){
        if (isOcupado == true){
            throw new IllegalStateException("Assento não pode ser reservado pois está ocupado");
        }
        isOcupado = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return isOcupado;
    }
}
