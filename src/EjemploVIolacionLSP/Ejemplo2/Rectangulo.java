package EjemploVIolacionLSP.Ejemplo2;

public class Rectangulo extends Forma {
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
    }
    @Override
    public double area() {
    return ancho * alto;
    }
}