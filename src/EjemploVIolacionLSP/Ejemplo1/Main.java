package EjemploVIolacionLSP;

public class Main {
    public static void main(String[] args) {
    Vehiculo miVehiculo = new CocheElectrico();
    miVehiculo.mover(); // Lanza una excepción inesperada.
    }
}