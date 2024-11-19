package ejercicioTres;

public class Main {
    public static void main(String[] args) {
        Transporte miBicicleta = new Bicicleta();
        Transporte miCoche = new Coche();

        miBicicleta.mover();
        miCoche.mover();
    }
}
