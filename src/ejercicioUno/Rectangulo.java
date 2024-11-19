package ejercicioUno;

public class Rectangulo extends Figura {
    private double lado_1;
    private double lado_2;

    public Rectangulo(double lado_1, double lado_2) {
        this.lado_1 = lado_1;
    }

    @Override
    public double calcularArea() {
        return this.lado_1 * this.lado_2;
    }
}
