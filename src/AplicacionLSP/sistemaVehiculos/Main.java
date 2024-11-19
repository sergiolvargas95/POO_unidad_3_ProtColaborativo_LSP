package AplicacionLSP.sistemaVehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche();

        vehiculo.mover();
        coche.mover();
    }
}
