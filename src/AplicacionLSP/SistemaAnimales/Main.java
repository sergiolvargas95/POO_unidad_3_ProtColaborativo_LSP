package AplicacionLSP.SistemaAnimales;

public class Main {
    public static void main(String[] args) {
        Animal miPato = new Pato();
        Animal miPerro = new Perro();

        miPerro.hacerSonido();
        miPato.hacerSonido();
    }
}
